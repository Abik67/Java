//Make a class named Fruit with a data member to calculate the number of fruits in a basket. 
//Create two other class named Apples and Mangoes to calculate the number of apples and mangoes in the basket. 
//Print the number of fruits of each type and the total number of fruits in the basket.
	
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
