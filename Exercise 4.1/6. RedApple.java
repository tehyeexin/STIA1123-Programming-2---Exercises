package Exercise4_1;

public class RedApple extends Apple {
	
	private String color;
	private String taste;
	private double vitamin;
	private int grams;
	
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
	
	public String toString() {
		return super.toString() + "\nColor: " + color + "\nTaste: " + taste 
				+ "\nTotal price: RM" + df2.format(super.totalPrice());
	}

}
