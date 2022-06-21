public class Bike extends Vehicle{
	private int numberCylindes;
	private int numberGears;
	private String coolingType=" ";
	
	public Bike()
	{}
	public Bike(float mileage, float price,int numberCylindes,int numberGears,String coolingType)
	{
		super(mileage,price);
		this.numberCylindes=numberCylindes;
		this.numberGears=numberGears;
		this.coolingType=coolingType;
	}
	public int getNumberCylindes()
	{
		return this.numberCylindes;
	}
	public int getNumberGears()
	{
		return this.numberGears;
	}
	public String getCoolingType()
	{
		return this.coolingType;
	}
	public void display()
	{
		System.out.print("Bike");
		super.display();
		System.out.print("Number of Cylindes: ");
		System.out.print(numberCylindes);
		System.out.println();
		System.out.print("Number of Gears: ");
		System.out.print(numberGears);
		System.out.println();
		System.out.print("Cooling Type: ");
		System.out.print(coolingType);
		System.out.println();
	}
}