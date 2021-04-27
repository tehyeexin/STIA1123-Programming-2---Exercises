package Exercise4_2;

public class GreenApple extends Apple {
	
	private String color;
	private String taste;
	private int grams;
	
	public GreenApple() { 
		super();
	}
	
	public GreenApple(String name, int qty, double price, String color, String taste, int grams) { 
		super(name, qty, price);
		this.color = color;
		this.taste = taste;
		this.grams = grams;
	}
	
	public double totalWeight() {
		return this.quantity * this.grams;
	}
	
	public String toString() { //overriding
		return super.toString() + "\nColor\t\t: " + color + "\nTaste\t\t: " + taste + super.toString1() 
				+ "\nTotal weight\t: " + df2.format(totalWeight()) + "g";
	}

}
