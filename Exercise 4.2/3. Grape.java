package Exercise4_2;

public class Grape extends Fruit {
	
	private double calories;
	private int grams;
	
	public Grape() { 
		super();
	}
	
	public Grape(String name, double cal, int grams) {
		super(name);
		this.calories = cal;
		this.grams = grams;
	}
	
	public double totalCalories() {
		return this.calories * this.grams;
	}
	
	public String toString() { //overriding
		return super.toString() + "\nTotal calories  : "  + df2.format(totalCalories()) + "cal";
	}
	
	


}
