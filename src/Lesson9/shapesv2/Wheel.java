package Lesson9.shapesv2;


import TurtleGraphics.Pen;


public class Wheel extends Circle {
    
    private double spokes;   
    //wheel has 4 properties
    //it inherits x,y,rad from Circle
    
    public Wheel(double x, double y, double r, double s) {
        super(x, y, r); //call the Parent class constructor
        spokes = s;
    }
    
    //all methods from circle are available to wheel by default
    
    //some methods -> area, get x&y, stretchby, move are fine as is from circle
    
    //others like draw -> are a good start but need to be added on to(extended)
    //toString -> we will override completely
    
    
    public void draw(Pen p){
        //call the parent version of draw
        super.draw(p);
        
        //draw the spokes
        for (int i = 1; i <=spokes; i++) {
            p.up();
            p.move(xPos,yPos);
            p.down();
            p.setDirection(i*(360/spokes));
            p.move(radius);
        }
    }
    
    //exclusive method only for wheels
    public void setSpoke(int s){
        spokes = s;
    }
    
    //completely override the parent
    public String toString(){
       String str = "Circle\n=====\n";
        str += " Xpos" + xPos + " YPos: " + yPos;
        str += "\nRadius: " + radius;
        str+= "\nSpokes: " + spokes;
        str += String.format("\nArea: %.2f" , area());
        return str;
    } 
    
}
