//5. Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by
//creating a class named 'Rectangle' with a method named 'Area' which returns the area and length
//and breadth passed as parameters to its constructor.

public class Rectangle{
	
    private float l1=4,b1=5,l2=5,b2=8;
    
	public static void main(String[] args)
    {
            Rectangle r=new Rectangle();
            System.out.println("Area of rectangle 1 is :"+r.Area(r.l1,r.b1));
            System.out.println("Area of rectangle 2 is :"+r.Area(r.l2,r.b2));
     }
     public float Area(float length,float breadth)
     {
               return length*breadth;   
     }
} 