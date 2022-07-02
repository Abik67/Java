//2. Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. 
//Assign the value of roll_no as '2' and that of the name as "John" by creating an object of the class
//Student Assign and print the roll number, phone number, and 
//address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.

public class Student{
	
	String name,address,phone_number;
	int roll_no=2;
	
	public static void main(String []args){
			
		Student s1=new Student();
		s1.name="John";
		s1.roll_no=4;
		s1.phone_number="01928374651";
		s1.address="Uttara";
		System.out.println("Name= "+s1.name+" Roll number= "+s1.roll_no+" Phone Number= "+s1.phone_number+" Address= "+s1.address);
		
		Student s2=new Student();
		s2.name="Sam";
		s2.roll_no=5;
		s2.phone_number="01394857643";
		s2.address="Kuratoli";
		System.out.println("Name= "+s2.name+" Roll number= "+s2.roll_no+" Phone Number= "+s2.phone_number+" Address= "+s2.address);
		
		}
}