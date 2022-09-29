package com.project1;
import java.util.Optional;
//import javafx.scene.canvas.GraphicsContext;

import javafx.scene.canvas.GraphicsContext;

public class MyPoint {

    public double x;         //x coordinate of the point
    public double y;         //y coordinate of the point
    MyColor pointColor;      //color of the point

    //Constructor
    MyPoint() { setPoint(0,0); }

    MyPoint(double x, double y)
    {
        setPoint(x,y);
        setColor(pointColor);
    } 

    MyPoint(MyPoint p)
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

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setColor(MyColor pointColor) 
    {
        this.pointColor = Optional.ofNullable(pointColor).orElse(MyColor.PINK);
        //In case the user to choose his own default color
    } 

    //Getters 
    public MyColor getColor() { return pointColor; }     //returns the color of the point

    public double getXCoordinate(){ return x; }          //returns the x coordinate of the point

    public double getYCoordinate(){ return y; }          //returns the y coordinate of the point


    public void translate(double dx, double dy)           //Change the x and y coordinates by the specified distance
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

    public void draw(GraphicsContext GC)
    {
        GC.setFill(pointColor.getJavaFXColor());
        GC.fillRect(1,1, x,y);
    }
    
    @Override
    public String toString() {  
        return "X = "  + x + 
               "\nY = " + y ; } //Object's description

} //end of the class MyPoint
