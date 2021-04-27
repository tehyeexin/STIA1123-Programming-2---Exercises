package Exercise4_2;

public class Apple extends Fruit {

	protected int quantity;
	protected double price;
	
	public Apple() { 
		super();
	}
	
	public Apple(String name, int qty, double price) {
		super(name);
		this.quantity = qty;
		this.price = price;
	}
	
	public double totalPrice() {
		return this.quantity * this.price;
	}
	
	public String toString() { //overriding
		return super.toString();
	}
	
	public String toString1() { //overriding
		return "\nTotal price\t: RM" + df2.format(totalPrice());
	}
	
}
