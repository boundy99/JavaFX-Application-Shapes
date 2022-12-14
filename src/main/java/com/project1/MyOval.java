/*
Student name: Abdoulaye Boundy Djikine
Instructor name: Hesham Auda
Section: CSC 22100 M[24141]
Date:29/09/2022

Goal: This assignment has for goal to draw overlaying shapes using JavaFX Application

Class: MyOval
*/
package com.project1;
import javafx.scene.canvas.*;

public class MyOval extends MyShape
{

    //variables 
    double majorAxis, minorAxis;                 //major and minor axis of the oval
    MyPoint cp;                                  //center point of the oval of type MyPoint
    MyPoint tp;                                  //top left corner point of the oval of type MyPoint

    //constructors
    MyOval(double a, double b, MyPoint tp, MyColor color) 
    {
        super(tp, color);                   //calls the constructor from the super class of MyShape 
        this.tp = this.p;                   //sets top left corner point of the oval to p
        this.cp = new MyPoint((tp.getXCoordinate()/2), tp.getYCoordinate()/2); //creates a new point calculate the center coordinates
        this.majorAxis = Math.max(a,b);     //initializes the major axis to the bigger value    
        this.minorAxis = Math.min(a,b);     //initializes the minor axis to the smaller value                             
    }

     //Getters
     public double getX() { return cp.getXCoordinate();}  //returns the x coordinate of the center

     public double getY() { return cp.getYCoordinate();}  //returns the y coordinate of the center

     public double getA() { return majorAxis;}        //returns the major axis of the oval

     public double getB() { return minorAxis;}        //returns the minor axis of the oval

     @Override
     public double perimeter() 
     { 
        return 2 * Math.PI * Math.sqrt(((majorAxis * majorAxis) + (minorAxis * minorAxis)) / 2); 
     }                                                                 //returns the perimeter of the oval

     @Override 
     public double area() { return 2 * majorAxis * minorAxis; }        //returns the area of the oval

     @Override
    public String toString()                                           //returns the oval's description
    {
        return "Point Coordinates : "+
               "\nX = " + tp.getXCoordinate() + 
               "\nY = " + tp.getXCoordinate() +
               "\nCenter Coordinates : "+
               "\nX = " + cp.getXCoordinate() + 
               "\nY = " + cp.getXCoordinate() +
               "\nMajor Axis = " + getA() + 
               "\nMinor Axis = " + getB() + 
               "\nPermimeter =  " + perimeter() +
               "\nArea = " + area();
    }

    @Override
    public void Stroke(GraphicsContext GC)    //draws outline of the oval using JavaFX Application
    {
        GC.setStroke(color.getJavaFXColor());
        GC.strokeOval(tp.getXCoordinate(), tp.getYCoordinate(), majorAxis, minorAxis);
    }

    @Override
    public void draw(GraphicsContext GC)      //fills the interior of the oval using JavaFX Application
    {
        GC.setFill(color.getJavaFXColor());
        GC.fillOval(tp.getXCoordinate(), tp.getYCoordinate(), majorAxis, minorAxis);
    }

 } // end of the class MyOval
