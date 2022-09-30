/*
Student name: Abdoulaye Boundy Djikine
Instructor name: Hesham Auda
Section: CSC 22100 M[24141]
Date:29/09/2022

Goal: This assignment has for goal to draw overlaying shapes using JavaFX Application

Class: MyRectangle
*/
package com.project1;
import javafx.scene.canvas.GraphicsContext;

public class MyRectangle extends MyShape {
   
    //Variables 
    double w;                                                    //the width of the rectangle
    double h;                                                    //The height of the rectangle

    //Constructors
    MyRectangle(double h, double w, MyPoint tp, MyColor color) 
    {
        super(tp, color);                                        //calls the constructor from the super class of MyShape 
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
    public void Stroke(GraphicsContext GC)             //draws outline of the shape using JavaFX Application      
    {
        GC.setStroke(color.getJavaFXColor());
        GC.strokeRect(this.p.getXCoordinate(), this.p.getYCoordinate(), w,h);
    }

    @Override
    public void draw(GraphicsContext GC)              //fills the interior of the shape using JavaFX Application  
    {
        GC.setFill(color.getJavaFXColor());
        GC.fillRect(this.p.getXCoordinate(), this.p.getYCoordinate(), w,h);
    }

} // end of the class MyRectangle
