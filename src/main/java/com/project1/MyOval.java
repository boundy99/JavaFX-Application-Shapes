package com.project1;

import javafx.scene.canvas.*;

public class MyOval extends MyShape
{

    //variables 
    double a, b;            //major and minore axis of the oval
    MyPoint center;         //center of the oval

    //constructors
    MyOval(double majorAxis, double minorAxis, MyPoint tp, MyColor color) 
    {
        super(tp, color);                                     //calls the super class constructor
        this.center = this.p;                                 //sets the center of the oval 
        if (a>b)
        {
            this.a = majorAxis;
            this.b = minorAxis;
        }   
        else if(b>a)
        {
            this.b = majorAxis;
            this.a = minorAxis;
        }    
        else
        { 
            this.a = majorAxis = minorAxis;
            this.b = minorAxis = majorAxis;
        }                                              
    }

     //Getters
     public double getX() { return center.getXCoordinate();}              //return the x coordinate of the center

     public double getY() { return center.getYCoordinate();}              //returns the y coordinate of the center

     public double getA() { return a;}                                    //returns the absissa of the oval

     public double getB() { return b;}                                    //returns the abscissa axis of the oval

     @Override
     public double perimeter() 
     { 
        return 2 * Math.PI * Math.sqrt(((a * a) + (b * b)) / 2); 
     }                                                                    //returns the perimeter of the oval

     @Override 
     public double area() { return 2 * a * b; }                           //returns the area of the oval

     @Override
    public String toString()                                              //returns the oval's description
    {
        return "Center Coordinates : "+
               "\nX = " + center.getXCoordinate() + 
               "\nY = " + center.getXCoordinate() +
               "\nAbscissa 1 = " + getA() + 
               "\nAbscissa 2 = " + getB() + 
               "\nPermimeter =  " + perimeter() +
               "\nArea = " + area();
    }

    @Override
    public void Stroke(GraphicsContext GC)
    {
        GC.setStroke(color.getJavaFXColor());
        GC.strokeOval(center.getXCoordinate(), center.getYCoordinate(), a, b);
    }

    @Override
    public void draw(GraphicsContext GC)
    {
        GC.setFill(color.getJavaFXColor());
        GC.fillOval(center.getXCoordinate(), center.getYCoordinate(), a, b);
    }

 } // end of the class MyOval
