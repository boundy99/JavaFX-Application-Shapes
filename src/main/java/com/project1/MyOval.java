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
    MyPoint center;                              //center of the oval of type MyPoint

    //constructors
    MyOval(double a, double b, MyPoint tp, MyColor color) 
    {
        super(tp, color);                                     //calls the constructor from the super class of MyShape 
        this.center = this.p;                                 //sets the center of the oval 
        if (a>b)
        {
            this.majorAxis = a;
            this.minorAxis = b;
        }   
        else if(b>a)
        {
            this.minorAxis = a;
            this.majorAxis = b;
        }    
        else
        { 
            this.majorAxis = a = b;
            this.minorAxis = b = a;
        }                                              
    }

     //Getters
     public double getX() { return center.getXCoordinate();}              //return the x coordinate of the center

     public double getY() { return center.getYCoordinate();}              //returns the y coordinate of the center

     public double getA() { return Math.max(majorAxis,minorAxis);}        //returns the major axis of the oval

     public double getB() { return Math.min(majorAxis,minorAxis);}        //returns the minor axis of the oval

     @Override
     public double perimeter() 
     { 
        return 2 * Math.PI * Math.sqrt(((majorAxis * majorAxis) + (minorAxis * minorAxis)) / 2); 
     }                                                                    //returns the perimeter of the oval

     @Override 
     public double area() { return 2 * majorAxis * minorAxis; }                           //returns the area of the oval

     @Override
    public String toString()                                              //returns the oval's description
    {
        return "Center Coordinates : "+
               "\nX = " + center.getXCoordinate() + 
               "\nY = " + center.getXCoordinate() +
               "\nMajor Axis = " + getA() + 
               "\nMinor Axis = " + getB() + 
               "\nPermimeter =  " + perimeter() +
               "\nArea = " + area();
    }

    @Override
    public void Stroke(GraphicsContext GC)
    {
        GC.setStroke(color.getJavaFXColor());
        GC.strokeOval(center.getXCoordinate(), center.getYCoordinate(), majorAxis, minorAxis);
    }

    @Override
    public void draw(GraphicsContext GC)
    {
        GC.setFill(color.getJavaFXColor());
        GC.fillOval(center.getXCoordinate(), center.getYCoordinate(), majorAxis, minorAxis);
    }

 } // end of the class MyOval
