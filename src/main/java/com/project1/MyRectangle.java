package com.project1;
import javafx.scene.canvas.GraphicsContext;

public class MyRectangle extends MyShape {
   
    //Variables 
    double w;                        //The width of the rectangle
    double h;                        //The height of the rectangle

    //Constructors
    MyRectangle(double h, double w, MyPoint tp, MyColor color) 
    {
        super(tp, color); 
        this.h= h;
        this.w= w;
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
    public String toString()
    {
        return "Rectangle width and height: ("+ w + ", "+ h + ") "+  "Permimeter =  " + perimeter() +
        ", Area = " + area();
    }

    @Override
    public void Stroke(GraphicsContext GC)
    {
        GC.setStroke(color.getJavaFXColor());
        //GC.strokeRect(0, 0, w, h);
        GC.strokeRect(this.p.getXCoordinate(), this.p.getYCoordinate(), w,h);
    }

    @Override
    public void draw(GraphicsContext GC)
    {
        GC.setFill(color.getJavaFXColor());
        //GC.fillRect(14, 14, w, h);
        GC.fillRect(this.p.getXCoordinate(), this.p.getYCoordinate(), w,h);
    }

} // end of the class MyRectangle
