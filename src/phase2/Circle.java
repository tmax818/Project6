/*
 * Project #6
 * Source Code File: Circle.java
 * Programmer: Tyler Maxwell
 * Due: 12/4/19
 * Description: Student created class per Project 6 (phase2) instructions
 */

package phase2;

import java.awt.Graphics;

//import phase1.*;

public class Circle extends Shape {
    private double radius;
    
    public Circle() {
        super();
        radius = 1.0;
        
    }
    
    public Circle(double newRadius){
        super();
        setRadius(newRadius);
    }
    
    public Circle(int newX, int newY, double newRadius){
        super(newX, newY);
        setRadius(newRadius);
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public void setRadius(double newRadius){
        if(newRadius > 0){
            radius = newRadius;
        }else {
            radius = 1.0;
        }
    }
    
    public double getArea(){
        return radius * radius * 3.14159;
    }
    
    public String toString(){
        return "Circle: (" + getX() + ", " + getY() + "), radius: " + getRadius();
    }
    
     public void drawShape(Graphics g) {
        g.drawOval(getX(), getY(), (int)(2 * radius),
        (int)(2 * radius));
    }
}
