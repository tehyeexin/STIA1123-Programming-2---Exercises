package Exercise4_3;

public class Apple extends Fruit {

	protected double price;
	
	public Apple() { 
		super();
	}
	
	public Apple(String name, double price) {
		super(name);
		this.price = price;
	}
	
	public double totalPrice() { //overloading with no parameters
		return this.price = 0;
	}
	
	public double totalPrice(int qty) { //overloading with 1 parameters
		return this.price * qty;
	}
	
	public double totalPrice(int qty, double discount) { //overloading with 2 parameters
		return (this.price * qty ) - (this.price * qty * discount);
	}
	
	public String toString() { //overriding
		return super.toString();
	}
	
	public String printPrice() { 
		return "\nTotal price\t: RM" + df2.format(totalPrice(2,0.1));
	}
	

}
