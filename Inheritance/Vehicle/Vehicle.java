public class Vehicle{
	private float mileage;
	private float price;
	
	public Vehicle()
	{}
	public Vehicle(float mileage,float price)
	{
		this.mileage=mileage;
		this.price=price;
	}
	public float getMileage()
	{
		return this.mileage;
	}
	public float getPrice()
	{
		return this.price;
	}
	public void display()
	{
		System.out.print("Mileage: ");
		System.out.print(mileage);
		System.out.println();
		System.out.print("Price: ");
		System.out.print(price);
		System.out.println();
	}
}