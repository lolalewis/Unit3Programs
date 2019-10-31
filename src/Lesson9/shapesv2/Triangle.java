
package Lesson9.shapesv2;

import TurtleGraphics.Pen;


public class Triangle extends Shape{  //extends Shape
   
    private double x1,x2,x3,y1,y2,y3;
    private double xPos2,xPos3,yPos2,yPos3;     
    
    public Triangle(double x, double y, double xPos2, double yPos2 ,double xPos3, double yPos3){
       super(x,y);
       x2 = xPos2;
       x3 = xPos3;
       y2 = yPos2;
       y3 = yPos3;
    }

    @Override
    double area() {
       return Math.abs((x1*y2-x2*y1) + (x2*y3-x3*y2) + (x3*y1-x1*y3))/2;
    }

    @Override
    void draw(Pen p) {     
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.move(xPos2, yPos2);
        p.move(xPos3, yPos3);
        p.move(xPos, yPos);
    }
    public void move(double xLoc, double yLoc, double xLoc2, double yLoc2, double xLoc3, double yLoc3){
       xPos = xLoc;
       yPos = yLoc;
       xPos2 = xLoc2;
       xPos3 = xLoc3;
       yPos2 = yLoc2;
       yPos3 = yLoc3;
       
    }

    @Override
    void stretchBy(double factor) {
        x2 = (x2-xPos) * factor + xPos;
        x3 = (x3-xPos2) * factor + xPos2;
        y2 = (y2-yPos) * factor + xPos;
        y3 = (y3-yPos2) * factor + xPos2;
    }
     public String toString() {
        String str = String.format("Triangle\n=========\n");     
        str+= String.format("\nPerimeter: " + perimeter());
        str += super.toString();
        return str;
    }

    @Override
    double perimeter() {
        return Math.sqrt((x1-x2) * (x1-x2) + (y1-y2) * (y1-y2));
    }
}
