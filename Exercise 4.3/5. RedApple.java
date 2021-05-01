package Exercise4_3;

public class RedApple extends Apple {
	
	private int grams;
	
	public RedApple() { 
		super();
	}
	
	public RedApple (String name, double price, int grams) {
		super(name, price);
		this.grams = grams;
	}
	
	public String details() { //overloading with no parameters
		return "\nOrigin\t\t: Australia";
	}
	
	public String details(String color) { //overloading with 1 parameters
		return "\nOrigin\t\t: Australia" + "\nColor\t\t: " + color;
	}
	
	public String details(String color, String taste) { //overloading with 2 parameters
		return "\nOrigin\t\t: Australia" + "\nColor\t\t: " + color + "\nTaste\t\t: " + taste;
	}
	
	public double vitaminA() { //overloading with no parameters
		return 0.54;
	}
	
	public double vitaminA(int grams) { //overloading with 1 parameters
		return 0.54 * grams;
	}
	
	public double vitaminA(int grams, double vitamin) { //overloading with 2 parameters
		return vitamin * grams;
	}
	
	public String toString() { //overriding
		return super.toString() + details("Red", "Sweet") + "\nTotal price\t: RM" + df2.format(super.totalPrice(3, 0.1)) 
				+ "\nVitamin A\t: " + vitaminA(100, 0.54) + "IU";
	}

}
