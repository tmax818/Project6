/*
 * Project #6
 * Source Code File: Triangle.java
 * Programmer: Tyler Maxwell
 * Due: 12/4/19
 * Description: Student created class per Project 6 instructions
 */
package phase2;

import java.awt.Graphics;

//import phase1.*;

public class Triangle extends Shape {
    
    private double base;
    private double height;
    
    public Triangle() {
        super();
        base = 1.0;
        height = 1.0;
    }
    
    public Triangle(double newBase, double newHeight){
        super();
        setBase(newBase);
        setHeight(newHeight);
    }
    
    public Triangle(int newX, int newY, double newBase, double newHeight){
        super(newX, newY);
        setBase(newBase);
        setHeight(newHeight);
    }
    
    public double getBase(){
        return this.base;
    }
    
    public void setBase(double newBase){
        if(newBase > 0){
            base = newBase;
        } else {
            base = 1.0;
        } 
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public void setHeight(double newHeight){
        if(newHeight > 0){
            height = newHeight;
        } else {
            height = 1.0;
        }
    }
    
    
    public double getArea(){
        return (base/2.0) * height;
    }
    
    public String toString(){
        return "Triangle: (" + getX() + ", " + getY() + "), base: " + getBase() + ", height: " + getHeight();
    }
    
     public void drawShape(Graphics g) {
        g.drawLine(getX(), getY() + (int)height,
        getX() + (int)base, getY() + (int)height);
        g.drawLine(getX(), getY() + (int)height,
        getX() + (int)(base / 2), getY());
        g.drawLine(getX() + (int)base, getY() + (int)height,
        getX() + (int)(base / 2), getY());
    }
}
