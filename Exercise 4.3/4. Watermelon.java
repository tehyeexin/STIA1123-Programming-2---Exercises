package Exercise4_3;

public class Watermelon extends Fruit {
	
	public Watermelon() { 
		super();
	}
	
	public Watermelon(String name) {
		super(name);
	}
	
	public double totalCarbs() { //overloading with no parameters
		return 0.0755;
	}
	
	public double totalCarbs(int grams) { //overloading with 1 parameters
		return 0.0755 * grams;
	}
	
	public double totalCarbs(double carbs, int grams) { //overloading with 2 parameters
		return carbs * grams;
	}
	
	public String toString() { //overriding
		return super.toString() + "\nTotal carbs\t: " + totalCarbs(0.0755, 100) + "g";
	}

}
