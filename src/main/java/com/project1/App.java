package com.project1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
// import javafx.scene.paint.Color;

// import javafx.fxml.FXMLLoader;
// import javafx.scene.Parent;


import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage PS) throws IOException {
        
        MyPoint p1 = new MyPoint(128,246, MyColor.BLUE);
        Canvas canvas = new Canvas(600,800);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        MyRectangle r1 = new MyRectangle(300,500, MyColor.BLUE, p1);
        MyOval oval = new MyOval(p1, 50,50);
        r1.draw(gc);
        oval.draw(gc);
        
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