package Exercise4_4;

public class RedApple extends Apple {
	
	private String color;
	private String taste;
	
	public RedApple(String name, double p, int qty, String c, String t) {
		super(name, p, qty);
		this.color = c;
		this.taste = t;
	}
	
	public String color() {
		return this.color;
	}
	
	public String taste() {
		return this.taste;
	}
	
	public double calPrice() {
		return super.quantity * super.price;
	}
	
	public String toString() {
		return "Color : " + color + "\nTaste : " + taste + "\n" +super.toString();
	}

}
