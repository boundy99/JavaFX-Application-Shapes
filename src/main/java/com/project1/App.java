package com.project1;

import java.io.*;
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
        
        double val = 500;
        double sq = Math.sqrt(2) * (val / 2);
        double distance = 73;
        MyPoint p = new MyPoint(0,0);
        MyPoint p2 = new MyPoint(distance, distance);
        Canvas canvas = new Canvas(1000,1000);
        GraphicsContext gc = canvas.getGraphicsContext2D();
      

        System.out.println("Sq: " + sq);
        MyRectangle r1 = new MyRectangle(val,val, p, MyColor.ROSYBROWN);
        MyOval oval = new MyOval(val,val, p, MyColor.WHITE);
        MyRectangle r2 = new MyRectangle(sq ,sq, p2, MyColor.ROSYBROWN);
        r1.draw(gc);
        oval.draw(gc);
        r2.draw(gc);

        Pane P = new Pane();
        P.getChildren().add(canvas);

        Scene scene = new Scene(P);
        PS.setScene(scene);
        PS.show();
    
    }
    public static void main(String[] args) {
        launch();
    }

}