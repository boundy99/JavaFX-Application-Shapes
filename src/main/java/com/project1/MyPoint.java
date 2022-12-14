/*
Student name: Abdoulaye Boundy Djikine
Instructor name: Hesham Auda
Section: CSC 22100 M[24141]
Date:29/09/2022

Goal: This assignment has for goal to draw overlaying shapes using JavaFX Application

Class: MyPoint
*/
package com.project1;
import java.util.Optional;

import javafx.scene.canvas.GraphicsContext;

public class MyPoint {

    //variables
    public double x;                      //creates x of type double
    public double y;                      //creates y of type double
    MyColor pointColor;                   //creates a color of type MyColor

    //Constructor
    MyPoint() { setPoint(0,0); }

    MyPoint(double x, double y)
    {
        setPoint(x,y);                    //assigns x and y to the point's coordinates
        setColor(pointColor);             //sets the color to pointColor
    } 

    MyPoint(MyPoint p)
    {
        setPoint(p);                      //sets the point to p
        setColor(pointColor);             //sets the color to pointColor
    } 

    //Setters
    
    public void setPoint(MyPoint p)
    {
        this.x = p.getXCoordinate();      //assigns x as the point p x coordinate
        this.y = p.getYCoordinate();      //assigns y as the point p y coordinate
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setColor(MyColor pointColor) 
    {
        this.pointColor = Optional.ofNullable(pointColor).orElse(MyColor.PINK);
        //In case the user does not choose his own color
    } 

    //Getters 
    public MyColor getColor() { return pointColor; }     //returns the color of the point

    public double getXCoordinate(){ return x; }          //returns the x coordinate of the point

    public double getYCoordinate(){ return y; }          //returns the y coordinate of the point


    public void translate(double dx, double dy)           //changes the x and y coordinates by the specified distance
    {
        this.x += dx;
        this.y += dy;
    }

    public double distanceFromCoordinatesToOriogin()     //Distance from points x and y to origin
    {
        return Math.sqrt((x*x) + (y*y));
    }

    public double distance(MyPoint p)                    //Distance from points x and y to other defined points
    {
        double dx = x - p.getXCoordinate();
        double dy = y - p.getYCoordinate();
        return Math.sqrt((dx*dx) + (dy*dy));
    }

    public double getAngleX(MyPoint p)                   //returns the angleX bewtwenn points
    { 
        double dx = p.getXCoordinate() - x;
        double dy = p.getYCoordinate() - y;
        return Math.toDegrees(Math.atan2(dy, dx));
    }

    public void setStroke(GraphicsContext GC)            //draws outline using JavaFX Application 
    {
        GC.setStroke(pointColor.getJavaFXColor());
        GC.strokeRect(1,1, x,y);
    }

    public void draw(GraphicsContext GC)                 //fills the interior using JavaFX Application 
    {
        GC.setFill(pointColor.getJavaFXColor());
        GC.fillRect(1,1, x,y);
    }
    
    @Override
    public String toString() {  
        return "X = "  + x + 
               "\nY = " + y ; } //Point's description

} //end of the class MyPoint
