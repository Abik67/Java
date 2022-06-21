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