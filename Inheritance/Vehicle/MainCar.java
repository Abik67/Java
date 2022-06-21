//We want to store the information of different vehicles. Create a class named Vehicle with two data member named mileage and price. Create its two subclasses
//*Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
//*Bike with data members to store the number of cylinders, number of gears, cooling type (air, liquid or oil), wheel type (alloys or spokes) and fuel tank size (in inches)
//Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
//Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
//Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike.

public class MainCar{
	public static void main(String[]args){
		Audi carAudi=new Audi(10000F, 36000F, 29000F, 10, 3, "diesel");
		Ford carFord=new Ford(20000F, 26000F, 19000F, 5, 1, "petrol");
		carAudi.display();
		System.out.println();
		carFord.display();
		System.out.println();
	}
}
