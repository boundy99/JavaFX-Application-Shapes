package com.project1;
import java.util.Optional;
import javafx.scene.canvas.GraphicsContext;

public class MyRectangle extends MyShape {
   
    //Variables 
    double w;                        //The width of the rectangle
    double h;                        //The height of the rectangle
    MyColor rectangleColor;          //The color of the rectangle
    MyPoint p;                       //The point 

    //Constructors
    MyRectangle(double h, double w, MyPoint tp) 
    {
        super(new MyPoint(), null); 
        this.h= h;
        this.w= w;
        this.p = tp;
        setRectangleColor(rectangleColor);;
    }

    //Setters 
    public void setRectangleColor(MyColor rectangleColor) //set the rectangle color
    {
        this.rectangleColor = Optional.ofNullable(rectangleColor).orElse(MyColor.BLACK);
    }
    
    public void setPoint(MyPoint p){this.p = p; } //set the point


    //Getters 
    public MyPoint getP(){ return this.p; }                       //returns the top left corner point

    public double getWidth(){ return w; }                        //returns the the width of the rectangle

    public double getHeight(){ return h; }                       //returns the height of the rectangle

    public MyColor getRectangleColor(){ return rectangleColor; } //returns the color of the rectangle

    @Override
    public double perimeter(){ return ( 2 * w * h); }            //returns the perimeter of the rectangle

    @Override
    public double area(){ return (w * h); }                      //returns the area of the rectangle

    @Override
    public String toString()
    {
        return "Rectangle width and height: ("+ w + ", "+ h + ") "+  "Permimeter =  " + perimeter() +
        ", Area = " + area();
    }

    @Override
    public void Stroke(GraphicsContext GC)
    {
        GC.setStroke(rectangleColor.getJavaFXColor());
        GC.strokeRect(p.getXCoordinate(), p.getXCoordinate(), w,h);
    }

    @Override
    public void draw(GraphicsContext GC)
    {
        GC.setFill(rectangleColor.getJavaFXColor());
        GC.fillRect(p.getXCoordinate(), p.getXCoordinate(), w,h);
    }

} // end of the class MyRectangle
