package Exercise4_5;

public class RedApple extends Apple {
	
	private String color;
	private String taste;
	
	public RedApple(String name, double p, int qty, String c, String t) {
		super(name, p, qty);
		this.color = c;
		this.taste = t;
		
	}
	
	public String color() { //overloading with no arguments
		return this.color;
	}
	
	public String taste() { //overloading with 1 arguments
		return this.taste;
	}
	
	public double calPrice() { //overloading with 2 arguments
		return super.quantity * super.price;
	}
	
	public String toString() { //overriding
		return "Color       : " + color + "\nTaste       : " + taste + "\n" +super.toString();
	}

}
