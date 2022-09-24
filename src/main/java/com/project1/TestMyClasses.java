package com.project1;
//import java.awt.Color;
import java.util.Random;

public class TestMyClasses {
    public static void main(String[] args) {

        Random rand = new Random();
        MyColor[] myColors = MyColor.getColors();
        int randomNum = rand.nextInt(myColors.length);
        MyColor color = myColors[randomNum];

        System.out.println("--------------------------------");

        System.out.println(color);
        System.out.println(color.printColorsAndHex());
        
        System.out.println("--------------------------------");
        
        // System.out.println("AWT COLOR: ");
        // Color awtColor = color.getAWTColor();
        // System.out.println(awtColor);
        // System.out.println("(" + awtColor.getRed() + ", " + awtColor.getGreen() 
        //         + ", " + awtColor.getBlue() + ", " + awtColor.getAlpha() + ")");

        System.out.println("--------------------------------");

        MyPoint p1 = new MyPoint(128,246);
        MyPoint p2 = new MyPoint(200,600);

        System.out.println("Distance is: " + p1.distance(p2));
        System.out.println("The Angle is: " + p1.getAngleX(p2));

        System.out.println("--------------------------------");
        
        MyRectangle rectangle = new MyRectangle(4, 5, p1, MyColor.ALICEBLUE);
        System.out.println("Rectangle : " + rectangle.perimeter());
        
        System.out.println("--------------------------------");

        MyOval oval = new MyOval(5, 5, p1, MyColor.DARKBLUE);
        System.out.println("Oval Perimeter: " + oval.perimeter());
        System.out.println("Oval Area : " + oval.area());

    }

} //end of TestMyClasses
