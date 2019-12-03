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
    
    public abstract double getArea();
    
}
