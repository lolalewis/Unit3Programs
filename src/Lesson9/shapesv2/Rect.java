package Lesson9.shapesv2;

import TurtleGraphics.Pen;
import java.awt.Color;

public class Rect extends Shape {


    private double width, height;   
    
    public Rect(double x, double y, double w, double h) {
        super(x, y);
        width = w;
        height = h;
    }
    public Rect () {
        super();
        width = 10;
        height=10;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.setDirection(0);
        p.move(width);
        p.turn(-90);
        p.move(height);
        p.turn(-90);
        p.move(width);
        p.turn(-90);
        p.move(height);
    }

    public void stretchBy(double factor) {
        width *= factor;
        height *= factor;
    }

    public String toString() {
        String str = String.format("Rectangle\n=========\n");
        str += String.format("\nWidth: " + width + "Height: " + height);
        str+= String.format("\nPerimeter: " + perimeter());
        str += super.toString();
        return str;
    }

    @Override
    double perimeter() {
       return (width+height)*2;
    }

}
