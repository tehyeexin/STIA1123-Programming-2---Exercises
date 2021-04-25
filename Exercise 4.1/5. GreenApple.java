package Exercise4_1;

public class GreenApple extends Apple {
	
	private String color;
	private String taste;
	private int grams;
	
	public GreenApple (String name, int qty, double price, String color, String taste, int grams) {
		super(name, qty, price);
		this.color = color;
		this.taste = taste;
		this.grams = grams;
	}
	
	public double totalWeight() {
		return this.quantity * this.grams;
	}
	
	public String toString() {
		return super.toString() + "\nColor: " + color + "\nTaste: " + taste 
				+ "\nTotal price: RM" + df2.format(super.totalPrice());
	}

}
