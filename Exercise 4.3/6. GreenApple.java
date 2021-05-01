package Exercise4_3;

public class GreenApple extends Apple {

	public GreenApple() { 
		super();
	}
	
	public GreenApple(String name, double price) { 
		super(name, price);
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
	
	public double totalWeight() { //overloading with no parameters
		return 1;
	}
	
	public double totalWeight(int grams) { //overloading with 1 parameters
		return 1 * grams;
	}
	
	public double totalWeight(int grams, int qty) { //overloading with 2 parameters
		return qty * grams;
	}
	
	public String toString() { //overriding
		return super.toString() + details("Green", "Sour") + "\nTotal price\t: RM" + df2.format(super.totalPrice(4, 0.1)) 
			+ "\nTotal weight\t: " + totalWeight(100, 5) + "g";
	}

}
