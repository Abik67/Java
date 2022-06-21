public class Car extends Vehicle{
	private float ownershipCost;
	private int warrenty;
	private int seatingCapacity;
	private String fuelType="";
	
	public Car()
	{}
	public Car(float mileage, float price, float ownershipCost,int warrenty,int seatingCapacity, String fuelType)
	{
		super(mileage,price);
		this.ownershipCost=ownershipCost;
		this.warrenty=warrenty;
		this.seatingCapacity=seatingCapacity;
		this.fuelType=fuelType;
	}
	public float getOwnershipCost()
	{
		return this.ownershipCost;
	}
	public float getWarrenty()
	{
		return this.warrenty;
	}
	public float getSeatingCapacity()
	{
		return this.seatingCapacity;
	}
	public String getFuelType()
	{
		return this.fuelType;
	}
	public void display()
	{
		System.out.print("Car");
		super.display();
		System.out.print("Ownership Cost: ");
		System.out.print(ownershipCost);
		System.out.println();
		System.out.print("Warrenty: ");
		System.out.print(warrenty);
		System.out.println();
		System.out.print("Seating Capacity: ");
		System.out.print(seatingCapacity);
		System.out.println();
		System.out.print("FuelType: ");
		System.out.print(fuelType);
		System.out.println();
	}
}