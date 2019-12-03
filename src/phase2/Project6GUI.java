/*
 * Project #6
 * Source Code File: Project6.java
 * Programmer: Tyler Maxwell
 * Due: 12/4/19
 * Description: File copied from project instructions
 */

package phase2;
import javax.swing.*;
import java.awt.*;
/**
*
* Programmer: Benjamin Riveira
*/
public class Project6GUI {
 // Create an array to hold 100 Shape objects
 private Shape[] shapeArray = new Shape[100];

 public Project6GUI() {
 JFrame guiFrame = new JFrame();
 CustomPanel myPanel = new CustomPanel();
 guiFrame.setTitle("Project 6 GUI");
 guiFrame.setSize(800, 600);
 guiFrame.setLocation(0, 0);
 guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 guiFrame.add(myPanel);
 guiFrame.setVisible(true);
 }

 public static void main (String [] args) {

 Project6GUI project6 = new Project6GUI();
 project6.run();

 } // end of main
 public void run () {
 int count = 0;
 double totalArea = 0.0;
 /********** Fill the array region begin ***********/
 /* Students may only modify the code in this Fill */
 /* the array region. DO NOT MODIFY THE CODE */
 /* OUTSIDE OF THIS REGION. */
 shapeArray[count++] = new Circle();
 shapeArray[count++] = new Circle(5.0);
 shapeArray[count++] = new Circle(20, 20, 40.5);
 shapeArray[count++] = new Triangle();
 shapeArray[count++] = new Triangle(30.0, 50.0);
 shapeArray[count++] = new Triangle(70, 70, 20.3, 35.4);
 shapeArray[count++] = new Rectangle();
 shapeArray[count++] = new Rectangle(100, 50);
 shapeArray[count++] = new Rectangle(150, 150, 40.5, 60.5);
 /********** Fill the array region end **********/ 
 /* The following for loop loops through all objects in
 * shapeArray, invoking the toString() method on each
 * Shape object. This causes those objects to "display"
 * themselves as text strings.
 */
 for (int i = 0; i < count; i++ ) {
 System.out.println(shapeArray[i].toString());
 } // end for loop

 /* The following for loop loops through all objects
 * in shapeArray, invoking the getArea() method on each
 * Shape object and adding each object's area to totalArea.
 */
 for(int i = 0; i < count; i++) {
 if(shapeArray[i] != null) {
 totalArea += shapeArray[i].getArea();
 }
 } // end for loop

 System.out.println("\nThe total area for " + count
 + " Shape objects is " + totalArea);
 } // end of run() method
 public class CustomPanel extends JPanel {
 public void paintComponent(Graphics g) {
 for(Shape s : shapeArray) {
 if(s != null) {
 s.drawShape(g);
 }
 }
 repaint();
 }
 }
}