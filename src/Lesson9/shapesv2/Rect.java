package Lesson9.shapesv2;

import TurtleGraphics.Pen;
import java.awt.Color;

public class Rect extends Shape {


    private double width, height;
    private double x,y,w,h;
    
    public Rect(double x, double y, double w, double h) {
        super(x, y);
        width = w;
        height = h;
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
        String str = "Rectangle\n=========\n";
        str += "\nWidth: " + width + "Height: " + height;
        str+= String.format("\nPerimeter: " + perimeter());
        str += super.toString();
        return str;
    }

    @Override
    double perimeter() {
       return (x + y + w + h);
    }

}
