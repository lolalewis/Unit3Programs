package Lesson9.shapesv1;

import TurtleGraphics.Pen;

public class Circle implements Shape {
    
    private double xPos, yPos;
    private double radius;

    public Circle(double x, double y , double r){
        xPos = x;
        yPos = y;
        radius = r;
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
        
    }

    @Override
    public void draw(Pen p) {
       p.up();
        double side = 2 * Math.PI * radius / 120;
       p.move(xPos + radius, yPos - side /2.0);
       p.down();
       p.turn(90);     
        for (int i = 0; i < 120; i++) {
            p.move(side);
            p.turn(3);
        }
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
        radius = radius * factor;
    }
    
}
