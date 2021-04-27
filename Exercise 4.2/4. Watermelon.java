package Exercise4_2;

public class Watermelon extends Fruit {
	
	private double carbs;
	private int grams;
	
	public Watermelon() { 
		super();
	}
	
	public Watermelon(String name, double carbs, int grams) {
		super(name);
		this.carbs = carbs;
		this.grams = grams;
	}
	
	public double totalCarbs() {
		return this.carbs * this.grams;
	}
	
	public String toString() { //overriding
		return super.toString() + "\nTotal carbs\t: " + df2.format(totalCarbs()) + "g";
	}

}
