import java.util.Scanner; 
import java.util.*;
public class PointOfIntersection {
    public static void main(String args[]) {
   
        int X1;
        int Y1;
        int X2;
        int Y2;
        int X3;
        int Y3;
        int X4;
        int Y4;
        int M1;
        int B1;
        int M2;
        int B2;
        int M3;
        int B3;
        int X;
        int Y;
        
        Scanner in = new Scanner(System.in);
        
      System.out.println("Enter an integer for X1");
      X1 = in.nextInt();
      System.out.println("You entered integer " + X1);
      
      System.out.println("Enter an integer for Y1");
      Y1 = in.nextInt();
      System.out.println("You entered integer " + Y1);
      
      System.out.println("Enter an integer for X2");
      X2 = in.nextInt();

      System.out.println("You entered integer " + X2);
      
      System.out.println("Enter an integer for Y2");
      Y2 = in.nextInt();
      System.out.println("You entered integer " + Y2);
      
      System.out.println("Enter an integer for X3");
      X3 = in.nextInt();
      System.out.println("You entered integer " + X3);
      
      System.out.println("Enter an integer for Y3");
      Y3 = in.nextInt();
      System.out.println("You entered integer " + Y3);
      
      System.out.println("Enter an integer for X4");
      X4 = in.nextInt();
      System.out.println("You entered integer " + X4);
      
      System.out.println("Enter an integer for Y4");
      Y4 = in.nextInt();
      System.out.println("You entered integer " + Y4);
      
      M1 = ((Y2-Y1)/(X2-X1));
      B1 = Y1-(M1*X1);
      System.out.println("The equation for line 1 is y = " + M1 + "x + " + B1);
      
      M2 = ((Y4-Y3)/(X4-X3));
      B2 = Y3-(M2*X3);
      System.out.println("The equation for line 2 is y = " + M2 + "x + " + B2);
      
      if (M1 == M2) {
         System.out.println("Line 1 is parallel to line 2; there is no point of intersection.");
      } else {
         M3 = M1-M2;
         B3 = B2-B1;
         X = (B3/M3);
         Y = ((M1*X) + B1);
      
      System.out.println("The point of intersection of these two lines is (" + X + ", " + Y + ")");
      }
 
    }
}