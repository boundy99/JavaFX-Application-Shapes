/*
Student name: Abdoulaye Boundy Djikine
Instructor name: Hesham Auda
Section: CSC 22100 M[24141]
Date:29/09/2022

Goal: This assignment has for goal to draw overlaying shapes using JavaFX Application

Class: MyShape
*/
package com.project1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage PS) throws IOException {

        Canvas canvas = new Canvas(1000, 1000);  //creates a new canvas of height 1000 and width 1000
        GraphicsContext gc = canvas.getGraphicsContext2D();

        double major = 300;    //major axis of the oval
        double minor = 200;    //minor axis of the oval
        MyPoint point = new MyPoint(0, 0);  //new point from class MyPoint
        MyShape shape = new MyShape (point, MyColor.STEELBLUE); //new shape from class MyShape
        shape.draw(gc); //draw the shape
        MyOval oval = drawOval(gc, point , minor, major, MyColor.LIGHTBLUE);   //draws oval
        MyRectangle rec = drawRecInsideOval(gc, point, oval.getA(), oval.getB(), MyColor.MISTYROSE); //draws rectangle inside oval
        oval = drawOval(gc, rec.getPoint(), rec.getHeight() , rec.getWidth(), MyColor.LIGHTPINK); //draws oval inside rectangle
        rec = drawRecInsideOval(gc, oval.getPoint(), oval.getA() , oval.getB(), MyColor.CORNSILK); //draws rectangle inside oval
        oval = drawOval(gc, rec.getPoint(), rec.getHeight() , rec.getWidth(), MyColor.SKYBLU); //draws oval inside rectangle
        
        Pane P = new Pane();        //manages the image
        P.getChildren().add(canvas);
        Scene scene = new Scene(P); //displays the scene
        PS.setScene(scene);
        PS.show();

    }

    public MyOval drawOval(GraphicsContext gc, MyPoint point, double minor, double major, MyColor color){
        MyOval oval = new MyOval(minor, major, point, color); //new oval
        oval.draw(gc); //draws the oval
        return oval;   //returns the oval
    }
    public MyRectangle drawRecInsideOval(GraphicsContext gc, MyPoint oval, double minor, double major, MyColor color) {
        double width = Math.sqrt(2) * minor / 2;   //width 
        double height = Math.sqrt(2) * major / 2;  //height
        double x = (minor - width) / 2;  //area between oval and rectangle on x axis
        double y = (major - height) / 2; //area between oval and rectangle on y axis
        MyPoint rPoint = new MyPoint(x + oval.x, y + oval.y);
        MyRectangle r = new MyRectangle(height, width, rPoint, color);
        r.draw(gc);
        return r;
    }

    public static void main(String[] args) {
        launch();   //launches the application
    }

} //end of class App