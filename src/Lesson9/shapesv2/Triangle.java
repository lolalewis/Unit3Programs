
package Lesson9.shapesv2;

import TurtleGraphics.Pen;


public class Triangle extends Shape{  //extends Shape
   
    private double x2,x3,y2,y3;
   // private double xPos2,xPos3,yPos2,yPos3;     
    
    public Triangle(double x, double y, double xPos2, double yPos2 ,double xPos3, double yPos3){
       super(x,y);
       x2 = xPos2;
       x3 = xPos3;
       y2 = yPos2;
       y3 = yPos3;
    }

    @Override
    double area() {
       return Math.abs((xPos*y2-x2*yPos) + (x2*y3-x3*y2) + (x3*yPos-xPos*y3))/2;
    }

    @Override
    void draw(Pen p) {     
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.move(x2, y2);
        p.move(x3, y3);
        p.move(xPos, yPos);
    }
    
    @Override
    public void move(double xLoc, double yLoc){
       double differenceX = xLoc - xPos; 
       double differenceY = yLoc - yPos;        
       xPos = xLoc;
       yPos = yLoc;          
       x2 += differenceX;
       x3 += differenceX;
       y2 += differenceY;
       y3 += differenceY;
       
    }

    @Override
    void stretchBy(double factor) {
        
        x2 = (x2-xPos) * factor + xPos;
        x3 = (x3-xPos) * factor + xPos;
        y2 = (y2-yPos) * factor + yPos;
        y3 = (y3-yPos) * factor + yPos;
    }
     public String toString() {
        String str = String.format("Triangle\n=========\n");     
        str+= String.format("\nPerimeter: %.2f" , perimeter());
        str += super.toString();
        return str;
    }

    @Override
    double perimeter() {
        double p = Math.sqrt((xPos-x2) * (xPos-x2) + (yPos-y2) * (yPos-y2)); //adding x1, y1 and x2,y2 length
        p += Math.sqrt((x2-x3) * (x2-x3) + (y2-y3) * (y2-y3)); //adding x2, y2 and x3,y3 length
        p += Math.sqrt((xPos-x3) * (xPos-x3) + (yPos-y3) * (yPos-y3));
        return p;
    }
}
