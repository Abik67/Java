public class Food {

	private String name; 
	private String specialIngredients;
	private double price;
	private float calories;
	

    Food(){}
	
    Food(String name, String specialIngredients, double price, float calories){
        this.name = name;
        this.specialIngredients = specialIngredients;
        this.price = price;
        this.calories = calories;
    }
    void setName(String name){
       this.name = name;
    }
    void setIngredients(String specialIngredients){
        this.specialIngredients = specialIngredients;
    }
    void setPrice(double price){
        this.price = price;
    }
    void setCalories(float calories){
        this.calories = calories;
    }
    String getName(){
        return name;
    }
    String getSpecialIngredients(){
        return specialIngredients;
    }
    double getPrice(){
        return price;
    }
    float getCalories(){
        return calories;
    }
    void showDetails(){
        System.out.println("Name: " + name + "\nSpecialIngredients: " + specialIngredients + "\nPrice: " + price + "\nCalories: " + calories);
    }
}