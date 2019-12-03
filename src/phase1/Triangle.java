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
        
        //finish
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
        //finish
    }
}
