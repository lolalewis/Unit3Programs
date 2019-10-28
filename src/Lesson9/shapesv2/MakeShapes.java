package Lesson9.shapesv2;

import TurtleGraphics.Pen;
import TurtleGraphics.StandardPen;


public class MakeShapes {

    
    public static void main(String[] args) {
       Pen p = new StandardPen();
       
       Shape c = new Circle(0,0,25);
       Shape r = new Rect (0,0,50,25);
       Shape w = new Wheel(-75,0,25,3);
       
       c.draw(p);
       r.draw(p);
       w.draw(p);
    }
    
}
