package Lesson9.shapesv1;

import TurtleGraphics.Pen;

public class Rect implements Shape {
    private double xPos,yPos;
    private double width, height;
    
    public Rect(double x, double y, double w, double h){
        xPos= x;
        yPos= y;
        width= w;
        height = h;
    }
    
    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos,yPos);
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

    @Override
    public double getXPos() {
        return xPos;
    }

    @Override
    public double getYPos() {
        return yPos;
    }

    @Override
    public void move(double xLoc, double yLoc) {
     xPos  = xLoc;
     yPos = yLoc;
    }

    @Override
    public void stretchBy(double factor) {
       width*= factor;
       height *= factor;
    }
    
}
