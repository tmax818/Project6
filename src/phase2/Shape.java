/*
 * Project #6
 * Source Code File: Shape.java
 * Programmer: Tyler Maxwell
 * Due: 12/4/19
 * Description: Student created class per Project 6 (phase2) instructions
 */

package phase2;

import java.awt.Graphics;

//import phase1.*;

public abstract class Shape {
    
    private int x;
    private int y;
    
    public Shape(){
        x = 0;
        y = 0;
    }
    
    public Shape(int newX, int newY){
        setX(newX);
        setY(newY);
    }
    
    public int getX(){
        return x;
    }
    
    public void setX(int newX){
        if(newX >= 0){
            this.x = newX;
        } else {
            this.x = 0;
        }
    }
    
        public int getY(){
        return y;
    }
    
    public void setY(int newY){
        if(newY >= 0){
            this.y = newY;
        } else {
            this.y = 0;
        }
    }
    
    // Abstract methods
    
    public abstract double getArea();
    
    public abstract void drawShape(Graphics g);
    
}
