//1. Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. 
//The first method called 'setDim' takes the length and breadth of the rectangle as parameters and 
//the second method named 'getArea' returns the area of the rectangle.
//The length and breadth of the rectangle are entered through the keyboard.

import java.util.Scanner;

public class Area{
	
	private double length, breadth;
	
	public void setDim(double length, double breadth){
		
		this.length=length;
		this.breadth=breadth;
	}
	
	public double getArea(){
		return length*breadth;
	}
	
	public static void main(String []args){
		
		Scanner bc = new Scanner(System.in);
		
		System.out.println("Enter Length= ");
		double l=bc.nextDouble();
		System.out.println("Enter Breadth= ");
		double b=bc.nextDouble();
		
		Area x= new Area();
		
		x.setDim(l,b);
		System.out.println("Area= "+x.getArea());
		
	}
}