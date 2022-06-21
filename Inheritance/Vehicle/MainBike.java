//We want to store the information of different vehicles. Create a class named Vehicle with two data member named mileage and price. Create its two subclasses
//*Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
//*Bike with data members to store the number of cylinders, number of gears, cooling type (air, liquid or oil), wheel type (alloys or spokes) and fuel tank size (in inches)
//Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
//Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
//Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike.
	
public class MainBike{
	public static void main(String[]args){
		Bajaj bikeBajaj=new Bajaj(16000F, 12000F, 1, 1, "liquid");
		TVS bikeTVS=new TVS(56000F, 52000F, 6, 6, "liquid");
		bikeBajaj.display();
		System.out.println();
		bikeTVS.display();
		System.out.println();
	}
}
