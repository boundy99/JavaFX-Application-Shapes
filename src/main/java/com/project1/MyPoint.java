package com.project1;
import java.util.Optional;
//import javafx.scene.canvas.GraphicsContext;

import javafx.scene.canvas.GraphicsContext;

public class MyPoint {

    public double x;         //x coordinate of the point
    public double y;         //y coordinate of the point
    MyColor pointColor;      //color of the point

    //Constructor
    MyPoint() 
    {
        setPoint(0,0);
        this.pointColor = MyColor.BLACK;
    }

    MyPoint(int x, int y, MyColor shapeColor)
    {
        setPoint(x,y);
        setColor(pointColor);
    } 

    MyPoint(MyPoint p, MyColor shapeColor)
    {
        setPoint(p);
        setColor(pointColor);
    } 

    //Setters
    
    public void setPoint(MyPoint p)
    {
        this.x = p.getXCoordinate();
        this.y = p.getYCoordinate();
    }

    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setColor(MyColor shapeColor) 
    {
        this.pointColor = Optional.ofNullable(pointColor).orElse(MyColor.BLACK);
        //In case the user wants to choose his own default color
    } 

    //Getters 
    public MyColor getColor() { return pointColor; }     //returns the color of the point

    public double getXCoordinate(){ return x; }          //returns the x coordinate of the point

    public double getYCoordinate(){ return y; }          //returns the y coordinate of the point


    public void translate(int dx, int dy)                //Change the x and y coordinates by the specified distance
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

    public double getAngleX(MyPoint p)                   //returns the angleX
    { 
        double dx = p.getXCoordinate() - x;
        double dy = p.getYCoordinate() - y;
        return Math.toDegrees(Math.atan2(dy, dx));
    }


    public void Stroke(GraphicsContext GC)
    {
        GC.setStroke(pointColor.getJavaFXColor());
        //GC.fillOval(center.getXCoordinate() - a, center.getYCoordinate() - b, a * 2.0, b * 2.0;
    }

    public void draw(GraphicsContext GC)
    {
        // GC.setFill(pointColor.getJavaFXCOlor);
        // GC.fillOval(center.getXCoordinate() - a, center.getYCoordinate() - b, a * 2.0, b * 2.0;

    }
    
    @Override
    public String toString() {  return "My Point is (" + " x = " + x + ", y=" + y + ")" ; } //Object's description

} //end of the class MyPoint
