/**
 * 
 */

/**
 * @author Jake
 *
 */
public class Circle {

    /**
     * @param args
     */
  public static void main(String[] args) {
        // TODO Auto-generated method stub
     final double PI = 3.14159; 
   
     int radius = 10;
     double area1 = PI * radius * radius;
     double circumference1 = PI * radius * 2;
     
     System.out.println("The area of a circle with radius " + radius + " is " + area1);
     System.out.println("The circumference of a circle with radius " + radius + " is " + circumference1);
     System.out.println("");
     
     radius = 20;
     double area2 = PI * radius * radius;
     double circumference2 = PI * radius * 2;
     
     System.out.println("The area of a circle with radius " + radius + " is " + area2);
     System.out.println("The circumference of a circle with radius " + radius + " is " + circumference2);
     System.out.println("");
    double areaDiffer = area2 / area1;
    double circumferenceDiffer = circumference2 / circumference1;
    
    System.out.println("The differance between area1 and area 2 is: " + areaDiffer);
    System.out.println("The difference between circumference1 and circumference2 is : " + circumferenceDiffer);
    }

}
