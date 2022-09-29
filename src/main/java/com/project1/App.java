package com.project1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Pair;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage PS) throws IOException {

        Canvas canvas = new Canvas(1000, 1000);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        double ovalSize = 500;
        MyPoint o1 = new MyPoint(0, 0);
        MyOval oval = new MyOval(ovalSize, ovalSize, o1, MyColor.LIGHTBLUE);
        oval.draw(gc);

        Pair<MyPoint, Double> info = drawRecInsideOval(gc, o1, ovalSize, MyColor.MISTYROSE);
        ovalSize = info.getValue();
        MyOval oval2 = new MyOval(ovalSize, ovalSize, info.getKey(), MyColor.LIGHTPINK);
        oval2.draw(gc);

        info = drawRecInsideOval(gc, info.getKey(), ovalSize, MyColor.KHAKI);

        MyOval oval3 = new MyOval(info.getValue(), info.getValue(), info.getKey(), MyColor.LIGHTSALMON);
        oval3.draw(gc);

        Pane P = new Pane();
        P.getChildren().add(canvas);

        Scene scene = new Scene(P);
        PS.setScene(scene);
        PS.show();

    }

    public Pair<MyPoint, Double> drawRecInsideOval(GraphicsContext gc, MyPoint oval, double diameter, MyColor color) {
        double rectangle = Math.sqrt(2) * diameter / 2;
        double distance = (diameter - rectangle) / 2;
        MyPoint rPoint = new MyPoint(distance + oval.x, distance + oval.y);
        MyRectangle r = new MyRectangle(rectangle, rectangle, rPoint, color);
        r.draw(gc);
        Pair<MyPoint, Double> info = new Pair<MyPoint, Double>(rPoint, rectangle);
        return info;
    }

    public static void main(String[] args) {
        launch();
    }

}