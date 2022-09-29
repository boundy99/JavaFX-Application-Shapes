/*
Student name: Abdoulaye Boundy Djikine
Instructor name: Hesham Auda
Section: CSC 22100 M[24141]
Date:29/09/2022

Goal: This assignment has for goal to draw overlaying shapes using JavaFX Application

Class: MyShape
*/
package com.project1;
import java.util.Optional;
import javafx.scene.canvas.GraphicsContext;

public class MyShape{

    //Variables
    MyPoint p;                //creats a point p from class MyPoint
    MyColor color;            //creates a color from class MyColor

    //Constructors
    MyShape(MyPoint p, MyColor shapeColor) 
    {
        setPoint(p);             //calls the the function setPoint() to sets the point to p
        setColor(shapeColor);    //calls the the function setColor to sets the color
    }

    MyShape(int x, int y, MyColor shapeColor)  //Overloads the constructor with x and y
    {
        setPoint(x,y);          //calls the the function setPoint to set the point coordinates to x and y
        setColor(shapeColor);
    }

    //Setters
    public void setPoint(MyPoint p) { this.p = p; }                 //sets the point to p

    public void setPoint(int x, int y) { p.setPoint(x, y); }        //assigns x and y as the point's coordinates

    public void setColor(MyColor shapeColor)                        //sets the color of the shape
    {
        this.color = Optional.ofNullable(shapeColor).orElse(MyColor.BLACK);  
        //set the color of the shape to black if user does not set it explicitly
    }

    //Getters 
    public MyPoint getPoint() { return p; }                         //returns the point

    public MyColor getShapeColor() { return color; }                //returns the color of the shape

    public double getXCoordinate(){ return p.getXCoordinate(); }    //returns the x coordinate of the point

    public double getYCoordinate(){ return p.getYCoordinate(); }    //returns the y coordinate of the point


    //Return Area and Perimeter of MyShape

    public double area(){ return 0; }                              //returns the area of the shape

    public double perimeter(){ return 0; }                         //returns the perimeter of the shape


    public void Stroke(GraphicsContext GC)
    {
        GC.setStroke(color.getJavaFXColor());
        GC.strokeRect(0, 0, GC.getCanvas().getWidth(), GC.getCanvas().getHeight());
    }

    public void draw(GraphicsContext GC)
    {
        GC.setFill(color.getJavaFXColor());
        GC.fillRect(0, 0, GC.getCanvas().getWidth(), GC.getCanvas().getHeight());
    }

    @Override
    public String toString() { return "This is my My Shape : "; }  //Object's description
    
} // end of the class MyShape



