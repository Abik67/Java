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