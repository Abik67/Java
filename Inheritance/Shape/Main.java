//Create a class named Shape with a function that prints "This is a shape". 
//Create another class named Polygon inheriting the Shape class with the same function that prints "Polygon is a shape". 
//Create two other classes named Rectangle and Triangle having the same function which prints "Rectangle is a polygon" and "Triangle is a polygon" respectively. 
//Again, make another class named Square having the same function which prints "Square is a rectangle".
//Now, try calling the function by the object of each of these classes.
	
public class Main{
	public static void main(String[]args){
		Shape s= new Shape();
		Polygon p=new Polygon();
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		Square sq=new Square();
		
		s.print();
		p.print();
		r.print();
		t.print();
		sq.print();
	}
}
