package Lesson9.shapesv1;

import TurtleGraphics.*;
import java.awt.Color;
import java.util.Scanner;

public class MakeShape {

    public static void main(String[] args) {
        Shape shp[] = new Shape[10];
        for (int i = 0; i < shp.length; i++) {
            if (i < 5) {
                shp[i] = getRandCircle();
            } else {
                shp[i] = getRandRect();
            }

        }
        //draw all 10 shapes
        StandardPen p = new StandardPen(new SketchPadWindow(640, 480));
        for (Shape shape : shp) {
            shape.draw(p);
        }
        //resize each shape
        Scanner scan = new Scanner(System.in);

        for (Shape shape : shp) {
            System.out.println("Press any key to shrink a shape");
            scan.nextLine();
            shape.erase(p);
            shape.stretchBy(.5);
            shape.draw(p);
        }

        for (Shape shape : shp) {
            System.out.println("Press any key to move a shape");
            scan.nextLine();
            shape.erase(p);
            shape.move(shape.getXPos() + 50, shape.getYPos() + 50);
            shape.draw(p);

        }
        System.out.println("Press any key to turn all circles green");
        
        for (Shape shape : shp) {
            if( shape instanceof Circle){
                ((Circle)shape).turnGreen(p);
                //this is what casting an object looks like
                //(int)z
            }
        }
    }

    public static Circle getRandCircle() {
        //x pos & y -> -200 to + 200 // rad = 50 to 100
        Circle temp = new Circle((Math.random() * 400 - 200),
                (Math.random() * 400 - 200),
                (Math.random() * 50 + 50));
        return temp;

    }

    public static Rect getRandRect() {
        Rect temp = new Rect((Math.random() * 400 - 200),
                (Math.random() * 400 - 200),
                (Math.random() * 100 + 50),
                (Math.random() * 100 + 50));
        return temp;

    }
}
