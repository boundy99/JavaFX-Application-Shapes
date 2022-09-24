package com.project1;
import java.util.Optional;
import javafx.scene.canvas.*;

public class MyOval extends MyShape
{

    //variables 
    double a, b;            //radius of the oval
    MyPoint center;         //center of the oval
    MyColor ovalColor;      //color of the oval

    //constructors
    MyOval(double majorAxis, double minorAxis, MyPoint p) 
    {
        super(new MyPoint(), null);                           //calls the super class constructor
        setOvalColor(ovalColor);                                         //sets the color of the oval                                             //sets radius of the circle
        this.center = p;                                                 //sets the center of the oval 
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

     //Setters 
     public void setOvalColor(MyColor ovaColor)                     //sets the rectangle color
    {
        this.ovalColor = Optional.ofNullable(ovalColor).orElse(MyColor.BLACK);
    }

     //Getters
     public double getX() { return center.getXCoordinate();}              //return the x coordinate of the center

     public double getY() { return center.getYCoordinate();}              //returns the y coordinate of the center

     public double getA() { return a;}                                    //returns the absissa of the oval

     public double getB() { return b;}                                    //returns the abscissa axis of the oval

     public MyColor getOvalColor() { return ovalColor; }                  //returns the color of the oval

     @Override
     public double perimeter() 
     { 
        return 2 * Math.PI * Math.sqrt(((a * a) + (b * b)) / 2); 
     }                                                                    //returns the perimeter of the oval

     @Override 
     public double area() { return 2 * a * b; }                           //returns the area of the oval

     @Override
    public String toString()
    {
        return "Oval center : ("+ center.getXCoordinate() + ", "+ center.getXCoordinate() + "), " +
        "Major and Minor axis : " + getA() + ", " + getB() + "), Permimeter =  " + perimeter() +
        ", Area = " + area();
    }

    @Override
    public void Stroke(GraphicsContext GC)
    {
        GC.setStroke(ovalColor.getJavaFXColor());
        GC.strokeOval(center.getXCoordinate() - a, center.getYCoordinate() - b, a * 2.0, b * 2.0);
    }

    @Override
    public void draw(GraphicsContext GC)
    {
        GC.setFill(ovalColor.getJavaFXColor());
        GC.fillOval(center.getXCoordinate() - a, center.getYCoordinate() - b, a * 2.0, b * 2.0);
    }

 } // end of the class MyOval
