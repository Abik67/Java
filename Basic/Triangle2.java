//4. Write a program to print the area and perimeter of a triangle having sides of 3, 4, and 5 units by
//creating a class named 'Triangle' with a constructor having the three sides as its parameters.

public class Triangle2
{
    private float s1,s2,s3;
	
    private Triangle2(float side1,float side2,float side3)
     {
        s1=side1;
        s2=side2;
        s3=side3;
     }
       public static void main(String[] args)
       {
             Triangle2 t1=new Triangle2(3,4,5);
             float para=(t1.s1+t1.s2+t1.s3);
             System.out.println("parameter is:"+para);
             float sp=(para/2);
             float ar=((((sp*(sp-t1.s1))*(sp-t1.s2))*(sp-t1.s3)));       
             float area=(int)Math.sqrt(ar);   
             System.out.println("Area is:"+area);
        }
}