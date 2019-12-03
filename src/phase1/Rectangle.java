/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phase1;

/**
 *
 * @author tmax818
 */
public class Rectangle extends Shape {
    
    private double width;
    private double height;
    
    public Rectangle(){
        super();
        width = 1.0;
        height = 1.0;
    }
    
    public Rectangle(double newWidth, double newHeight){
        super();
        setHeight(newHeight);
        
    }
    
    public Rectangle(int newX, int newY, double newWidth, double newHeight){
        super(newX, newY);
        setWidth(newWidth);
        setHeight(newHeight);
        //finish
    }
    
    public double getWidth(){
        return this.width;
    }
    
    public void setWidth(double newWidth){
        if(newWidth > 0){
            width = newWidth;
        } else {
            width = 1.0;
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
        return width * height;
    }
    
    public String toString(){
        return "Rectangle: (" + getX() + ", " + getY() + "), width: " + getWidth() + ", height: " + getHeight();
        //finish
    }
    
}
