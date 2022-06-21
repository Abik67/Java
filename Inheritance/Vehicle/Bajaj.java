public class Bajaj extends Bike{
	private String makeType= " ";
	
	public Bajaj(float mileage, float price,int numberCylindes,int numberGears,String coolingType)
	{
		super(mileage,price,numberCylindes,numberGears,coolingType);
		this.makeType="Bajaj";
	}
	public void display()
	{
		super.display();
		System.out.print("Make-Type: ");
		System.out.print(makeType);
		System.out.println();
	}
}