package Exercise4_2;

public class RedApple extends Apple {
	
	private String color;
	private String taste;
	private double vitamin;
	private int grams;
	
	public RedApple() { 
		super();
	}
	
	public RedApple (String name, int qty, double price, String color, String taste, double vitamin, int grams) {
		super(name, qty, price);
		this.color = color;
		this.taste = taste;
		this.vitamin = vitamin;
		this.grams = grams;
	}
	
	public double totalVitaminA() {
		return this.vitamin * this.grams;
	}
	
	public String toString() { //overriding
		return super.toString() + "\nColor\t\t: " + color + "\nTaste\t\t: " + taste + super.toString1() 
				+ "\nTotal Vitamin A : " + df2.format(totalVitaminA()) + "IU";
	}

	

}
