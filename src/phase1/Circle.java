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
public class Circle extends Shape {
    private double radius;
    
    public Circle() {
        super();
        radius = 1.0;
        
    }
    
    public Circle(double newRadius){
        super();
        setRadius(newRadius);
        //finish
    }
    
    public Circle(int newX, int newY, double newRadius){
        super(newX, newY);
        setRadius(newRadius);
        //finish
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
}
