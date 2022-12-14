/*
Student name: Abdoulaye Boundy Djikine
Instructor name: Hesham Auda
Section: CSC 22100 M[24141]
Date:29/09/2022

Goal: This assignment has for goal to draw overlaying shapes using JavaFX Application

Class: MyColor
*/
package com.project1;
import javafx.scene.paint.Color;

public enum MyColor {    	
	//creates our own color object from RapidTables									
    MAROON	(128,0,0,255),
    DARKRED	(139,0,0,255),
 	BROWN (165,42,42,255),
 	FIREBRICK (178,34,34,255),
 	CRIMSON (220,20,60,255),
 	RED (255,0,0,255),
 	TOMATO (255,99,71,255),
 	CORAL (255,127,80,255),
 	INDIANRED (205,92,92,255),
 	LIGHTCORAL (240,128,128,255),
 	DARKSALMON (233,150,122,255),
 	SALMON (250,128,114,255),
 	LIGHTSALMON (255,160,122,255),
 	ORANGERED (255,69,0,255),
 	DARKORANGE (255,140,0,255),
 	ORANGE (255,165,0,255),
 	GOLD (255,215,0,255),
 	DARKGOLDENROD (184,134,11,255),
 	GOLDENROD (218,165,32,255),
 	PALEGOLDENROD (238,232,170,255),
 	DARKKHAKI (189,183,107,255),
 	KHAKI (240,230,140,255),
 	OLIVE (128,128,0,255),
 	YELLOW (255,255,0,255),
 	YELLOWGREEN (154,205,50,255),
 	DARKOLIVEGREEN (85,107,47,255),
    OLIVEDRAB (107,142,35,255),
 	LAWNGREEN (124,252,0,255),
 	CHARTREUSE (127,255,0,255),
 	GREENYELLOW (173,255,47,255),
 	DARKGREEN (0,100,0,255),
 	GREEN (0,128,0,255),
 	FORESTGREEN (34,139,34,255),
 	LIME (0,255,0,255),
 	LIMEGREEN (50,205,50,255),
 	LIGHTGREEN (144,238,144,255),
 	PALEGREEN (152,251,152,255),
 	DARKSEAGREEN (143,188,143,255),
 	MEDIUMSPRINGGREEN (0,250,154,255),
 	SPRINGGREEN (0,255,127,255),
 	SEAGREEN (46,139,87,255),
 	MEDIUMAQUAMARINE (102,205,170,255),
 	MEDIUMSEAGREEN (60,179,113,255),
 	LIGHTSEAGREEN (32,178,170,255),
 	DARKSLATEGRAY (47,79,79,255),
 	TEAL (0,128,128,255),
 	DARKCYAN (0,139,139,255),
 	AQUA (0,255,255,255),
 	LIGHTCYAN (224,255,255,255),
 	DARKTURQUOISE (0,206,209,255),
 	TURQUOISE (64,224,208,255),
 	MEDIUMTURQUOISE (72,209,204,255),
 	PALETURQUOISE (175,238,238,255),
 	AQUAMARINE (127,255,212,255),
 	POWDERBLUE (176,224,230,255),
 	CADETBLUE (95,158,160,255),
 	STEELBLUE (70,130,180,255),
 	CORNFLOWERBLUE (100,149,237,255),
 	DEEPSKYBLUE (0,191,255,255),
 	DODGERBLUE (30,144,255,255),
 	LIGHTBLUE (173,216,230,255),
 	SKYBLU (135,206,235,255),
 	LIGHTSKYBLUE (135,206,250,255),
 	MIDNIGHTBLUE (25,25,112,255),
 	NAVY (0,0,128,255),
 	DARKBLUE (0,0,139,255),
 	MEDIUMBLUE (0,0,205,255),
 	BLUE (0,0,255,255),
 	ROYALBLUE (65,105,225,255),
 	BLUEVIOLET (138,43,226,255),
 	INDIGO (75,0,130,255),
 	DARKSLATEBLUE (72,61,139,255),
 	SLATEBLUE (106,90,205,255),
 	MEDIUMSLATEBLUE (123,104,238,255),
 	MEDIUMPURPLE (147,112,219,255),
 	DARKMAGENTA (139,0,139,255),
 	DARKVIOLET (148,0,211,255),
 	DARKORCHID (153,50,204,255),
 	MEDIUMORCHID (186,85,211,255),
 	PURPLE (128,0,128,255),
 	THISTLE (216,191,216,255),
 	PLUM (221,160,221,255),
 	VIOLET (238,130,238,255),
 	MAGENTA (255,0,255,255),
 	ORCHID (218,112,214,255),
 	MEDIUMVIOLETRED (199,21,133,255),
 	PALEVIOLETRED (219,112,147,255),
 	DEEPPINK (255,20,147,255),
 	HOTPINK (255,105,180,255),
 	LIGHTPINK (255,182,193,255),
 	PINK (255,192,203,255),
 	ANTIQUEWHITE (250,235,215,255),
 	BEIGE (245,245,220,255),
 	BISQUE (255,228,196,255),
 	BLANCHEDALMOND (255,235,205,255),
 	WHEAT (245,222,179,255),
 	CORNSILK (255,248,220,255),
 	LEMONHIFFON (255,250,205,255),
 	TAN (210,180,140,255),
 	ROSYBROWN (188,143,143,255),
 	MOCCASIN (255,228,181,255),
 	NAVAJOWHITE (255,222,173,255),
 	PEACHPUFF (255,218,185,255),
 	MISTYROSE (255,228,225,255),
 	LAVENDERBLUSH (255,240,245,255),
 	LINEN (250,240,230,255),
 	OLDLACE (253,245,230,255),
 	PAPAYAHIP (255,239,213,255),
 	SEASHELL (255,245,238,255),
 	MINTCREAM (245,255,250,255),
 	SLATEGRA (112,128,144,255),
 	LIGHTSLATEGRAY (119,136,153,255),
 	LIGHTSTEELBLUE (176,196,222,255),
 	LAVENDER (230,230,250,255),
 	FLORALWHITE (255,250,240,255),
 	ALICEBLUE (240,248,255,255),
 	GHOSTWHITE (248,248,255,255),
 	HONEYDEW (240,255,240,255),
 	IVORY (255,255,240,255),
 	AZURE (240,255,255,255),
 	SNOW (255,250,250,255),
 	BLACK (0,0,0,255),
 	DIMGRAY (105,105,105,255),
 	GRAY (128,128,128,255),
 	WHITESMOKE (245,245,245,255),
 	WHITE (255,255,255,255);
    
    //variables
    private int r;    //Red Colors component range from 0 to 255
    private int b;    //Blue Colors component range from 0 to 255
    private int g;    //Green Colors component range from 0 to 255
	private int a;    //Opacity of the Colors component range from 0 to 255
    private int argb; // Pack of Opacity -  Red   -  Green  -  Blue in bits
					  // Bits:     31-24 - 23-16  -  15-8   -  7-0

    //constructor
    MyColor(int r, int g, int b, int a)
    {
       setR(r); //sets the red component to r
	   setG(g); //sets the green component to g
       setB(b); //sets the blue component to b
	   setA(a); //sets the opacity component to
       setARGB(r, g, b, a); //sets the argb component to
    }

    //Setters 
    public void setR(int r)    //sets the red component to r
    {
        if(r>=0 && r<=255)	   //if it is within the range
        {
        this.r = r;
        }
    }

    public void setG(int g)   //sets the green component to g
    {
        if(g>=0 && g<=255)    //if it is within the range
        {
        this.g = g;
        }
    }

    public void setB(int b)    //sets the blue component to b
    {
        if(b>=0 && b<=255)     //if it is within the range
        {
        this.b = b;
        }
    }

	public void setA(int a)    //sets the opacity component to a
    {
        if(a>=0 && a<=255)	   //if it is within the range
        {
        this.a = a;
        }
    }

    public void setARGB(int a, int r, int g, int b)  //
    {
        this.argb = (a << 24) & 0xFF000000 | 	//shifts opacity by 24 bits and converts to hexadecimal 
                    (r << 16) & 0x00FF0000| 	//shifts red by 16 bits and converts to hexadecimal
                    (g << 8) & 0x0000FF00|      //shifts green by 8 bits and converts to hexadecimal
                     b;                         //shifts blue and converts to hexadecimal
    }

	//Getters
    public int getR() { return r;}       //returns the red color component
	public int getG() { return g;}       //returns the green color component
	public int getB() { return b;}       //returns the blue color component
	public int getA() { return a;}       //returns the opacity component
	public int getARGB() { return argb;} //returns the arbg component

	
	public String getHex() //gives the hexadecimal representation of opaque colors
	{
		return "#" + Integer.toHexString(getARGB()).toUpperCase();
	}

	public Color getJavaFXColor()  //returns the JavaFX colors
	{
		return Color.rgb(r, g, b, ((double) a/255.0)); //divides a by 255 to get non-opaque color
	}

	public static MyColor[] getColors()   //stores Colors in an Array 
	{
		return MyColor.values();
	}
       
	//Prints Color components and hexadecimal representation
	public String printColorsAndHex()	
	{
		return "(r: " + this.r + ", g: " + this.g + ", b: " + this.b + ")" +
		 "\nTHE HEXADECIMAL REPRESENTATION OF THE COLOR VALUES IS " + this.getHex();
	}
	
} // end of class MyColor

