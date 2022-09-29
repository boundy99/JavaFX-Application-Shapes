package com.project1;
//import java.awt.Color;
import java.util.Random;

public class TestMyClasses {
    public static void main(String[] args) {

        Random rand = new Random();                         //random number generator
        MyColor[] myColors = MyColor.getColors();           //creats an array of colors
        int randomNum = rand.nextInt(myColors.length);      //random number generator
        MyColor color = myColors[randomNum];                //randomises the colors in the array


        MyPoint p1 = new MyPoint(128,246);             //creates a new point p1 of coordinates x and y from MyPoint
        MyPoint p2 = new MyPoint(200,600);             //creates a new point p2 of coordinates x and y from MyPoint

        System.out.println("--------------------------------|");
        System.out.println("CLASS MyColor OUTPUTS");
        System.out.println("--------------------------------|");

        System.out.println();
        System.out.println(color);                          //prints the color name
        System.out.println(color.printColorsAndHex());      //prints the color red, green, blue and its hexadecimal representation
    
        System.out.println("--------------------------------|");
        System.out.println("CLASS MyPoint OUTPUTS");
        System.out.println("--------------------------------|");

        System.out.println();
        System.out.println("Point 1 " + "\n" + p1);         //prints the coordinates of point 1
        System.out.println("\nPoint 2 " + "\n" + p2);       //prints the coordinates of point 2

        System.out.println("\nDistance from point 1 and point 2 is: " + p1.distance(p2)); //prints the distance between point 1 and point 2
        System.out.println("The Angle of point 1 and point 2 is: " + p1.getAngleX(p2));   //prints the angle of point 1 and point 2

        System.out.println("--------------------------------|");
        System.out.println("CLASS MyRectangle OUTPUTS");
        System.out.println("--------------------------------|");

        System.out.println();
        MyRectangle rectangle = new MyRectangle(4, 5, p1, MyColor.ALICEBLUE); //creates a new rectangle from MyRectangle
        System.out.println(rectangle); //prints the rectangle height, width, top left corner, area and perimeter
        
        System.out.println("--------------------------------|");
        System.out.println("CLASS MyOval OUTPUTS");
        System.out.println("--------------------------------|");
        System.out.println();
        MyOval oval = new MyOval(5, 5, p1, MyColor.DARKBLUE); ////creates a new OVAL from MyOval
        System.out.println(oval);

    }
} //end of TestMyClasses
