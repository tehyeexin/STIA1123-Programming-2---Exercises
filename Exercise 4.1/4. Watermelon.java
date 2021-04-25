package Exercise4_1;

public class Watermelon extends Fruit {
	
	private double carbs;
	private int grams;
	
	public Watermelon(String name, double carbs, int grams) {
		super(name);
		this.carbs = carbs;
		this.grams = grams;
	}
	
	public double totalCarbs() {
		return this.carbs * this.grams;
	}

}
