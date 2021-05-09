package Exercise4_5;

public class GreenApple extends Apple {
	
	private String color;
	private String taste;

	public GreenApple(String name, double p, int qty, String c, String t) {
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
	
	public String toString() { //overloading with 2 arguments
		return "Color       : " + color + "\nTaste       : " + taste + "\n" +super.toString();
	}

}
