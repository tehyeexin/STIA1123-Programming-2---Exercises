package Exercise4_1;

public class Grape extends Fruit {
	
	private double calories;
	private int grams;
	
	public Grape(String name, double cal, int grams) {
		super(name);
		this.calories = cal;
		this.grams = grams;
	}
	
	public double totalCalories() {
		return this.calories * this.grams;
	}

}
