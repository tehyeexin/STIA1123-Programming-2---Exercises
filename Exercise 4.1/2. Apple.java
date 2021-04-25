package Exercise4_1;

public class Apple extends Fruit {
	
	 int quantity;
	 double price;
	
	public Apple(String name, int qty, double price) {
		super(name);
		this.quantity = qty;
		this.price = price;
	}
	
	public double totalPrice() {
		return this.quantity * this.price;
	}

}
