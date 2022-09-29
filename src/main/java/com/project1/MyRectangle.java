package com.project1;
import javafx.scene.canvas.GraphicsContext;

public class MyRectangle extends MyShape {
   
    //Variables 
    double w;                        //The width of the rectangle
    double h;                        //The height of the rectangle

    //Constructors
    MyRectangle(double h, double w, MyPoint tp, MyColor color) 
    {
        super(tp, color);                                        //calls the constructor from the super class of MyRectangle 
        this.h= h;                                               //initializes the height to h
        this.w= w;                                               //initializes the width to w
    }

    //Getters 
    public MyPoint getP(){ return this.p; }                      //returns the top left corner point

    public double getWidth(){ return w; }                        //returns the the width of the rectangle

    public double getHeight(){ return h; }                       //returns the height of the rectangle

    @Override
    public double perimeter(){ return ( 2 * w * h); }            //returns the perimeter of the rectangle

    @Override
    public double area(){ return (w * h); }                      //returns the area of the rectangle

    @Override
    public String toString()                                     //returns the rectangle's description
    {
        return "Height:  "  + h +
               "\nWidth:  " + w +
               "\nTop Left Corner Coordinates: " +  "\n" +getP() + 
               "\nPermimeter =  " + perimeter() +
               "\nArea = " + area();
    }

    @Override
    public void Stroke(GraphicsContext GC)
    {
        GC.setStroke(color.getJavaFXColor());
        GC.strokeRect(this.p.getXCoordinate(), this.p.getYCoordinate(), w,h);
    }

    @Override
    public void draw(GraphicsContext GC)
    {
        GC.setFill(color.getJavaFXColor());
        GC.fillRect(this.p.getXCoordinate(), this.p.getYCoordinate(), w,h);
    }

} // end of the class MyRectangle
