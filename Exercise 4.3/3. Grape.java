package Exercise4_3;

public class Grape extends Fruit {
	
	public Grape() { 
		super();
	}
	
	public Grape(String name) {
		super(name);
	}
	
	public double totalCalories() { //overloading with no parameters
		return 0.67;
	}
	
	public double totalCalories(int grams) { //overloading with 1 parameters
		return 0.67 * grams;
	}
	
	public double totalCalories(double cal, int grams) { //overloading with 2 parameters
		return cal * grams;
	}
	
	public String toString() { //overriding
		return super.toString() + "\nTotal calories  : "  + totalCalories(0.67, 100) + "cal";
	}

}
