public class TVS extends Bike{
	private String makeType= " ";
	
	public TVS(float mileage, float price,int numberCylindes,int numberGears,String coolingType)
	{
		super(mileage,price,numberCylindes,numberGears,coolingType);
		this.makeType="TVS";
	}
	public void display()
	{
		super.display();
		System.out.print("Make-Type: ");
		System.out.print(makeType);
		System.out.println();
	}
}