//6. Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and 
//breadth as parameters of its constructor and having a method named 'returnArea' which returns the area of the rectangle. 
//The length and breadth of the rectangle are entered through the keyboard.

import java.util.Scanner;

public class Area2{
	
    private int length,breadth;
	
    public Area2(int l,int b)
   {
       length=l;
       breadth=b;
   }
    public int getArea()
   {
        return length*breadth;
   }
  
  public static void main(String[] args)
  {
     int l,b;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter length"); 
     l=s.nextInt();
     System.out.println("Enter breadth");
     b=s.nextInt();
     Area2 a=new Area2(l,b);
    System.out.println("Area is :"+a.getArea());
  }
}  