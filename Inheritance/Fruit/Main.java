public class Main
	{
		public static void main(String[]args){
			
				Apples firstApple= new Apples();
				Apples secondApple= new Apples();
				Apples thirdApple= new Apples();
				
				Mangoes firstMango= new Mangoes();
				Mangoes secondMango= new Mangoes();
				Mangoes thirdMango= new Mangoes();
								
			System.out.println("Total Number of Fruits: ");
			System.out.println(Fruit.fruitCounter);
			System.out.println();
			
			System.out.println("Number of Apples: ");
			System.out.println(Apples.applesCounter);
			System.out.println();
			
			System.out.println("Number of Mangoes: ");
			System.out.println(Mangoes.mangoesCounter);
		}
	}