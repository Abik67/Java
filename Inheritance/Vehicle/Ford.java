public class Ford extends Car{
	private String modelType= " ";
	
	public Ford(float mileage, float price, float ownershipCost,int warrenty,int seatingCapacity, String fuelType)
	{
		super(mileage,price,ownershipCost,warrenty,seatingCapacity,fuelType);
		this.modelType="Ford";
	}
	public void display()
	{
		super.display();
		System.out.print("Model Type: ");
		System.out.print(modelType);
		System.out.println();
	}
}