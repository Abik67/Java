//10. Add two distances in inch-feet by creating a class named 'AddDistance'.

public class AddDistance
{
	private double distance1;
	private double distance2;
	public AddDistance ()
	{}
	public AddDistance(double distance1, double distance2)
	
	{
	 this.distance1=distance1;
     this.distance2=distance2;
	 
	}
	public void showadd()
	{
		System.out.println(" Adding by Inch : "+(distance1+distance2));
		System.out.println(" Adding by Feet : "+(distance1+distance2));
	}
	
	public static void main( String[] args)
	{
		AddDistance a=new AddDistance(4,5);
		a.showadd();
		
	}
	
	
	
}