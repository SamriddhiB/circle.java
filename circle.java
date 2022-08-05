/*Design a class named Circle containing following attributes and behavior.
•Onedouble data field named radius.
 The default valueis1.•A no-argumentconstructor that creates a default circle.
 •A Single argument constructor that creates a Circle with the specified radius.•A method named getArea() that returns area of the Circle.
 •A method named getPerimeter() that returns perimeterof it. */

 import java.util.*;
 import java.util.Scanner;
 class Circle
 { 
 double radius;
 Circle()
 { 
  radius=1; 
}
 Circle(double r)
 { 
  radius=r; 
}
 double getArea()
 { 
  return 3.14*radius*radius; 
}
 double getPerimeter()
 { 
  return 2*3.14*radius; 
} 
}
 class Main extends Circle
 { 
  public static void main(String args[])
 { 
  Circle c=new Circle();
 double r,area,perimeter;
 Scanner s=new Scanner(System.in);
 area=c.getArea();
 perimeter=c.getPerimeter();
 System.out.println("Area:" + area);
 System.out.println("Perimeter:" + perimeter);
 System.out.print("\nEnter the value of radius: ");
 r=s.nextDouble();
 Circle c1=new Circle(r);
 area=c1.getArea();
 perimeter=c1.getPerimeter();
 System.out.println("Area:" + area);
 System.out.println("Perimeter:" + perimeter); 
}
}
