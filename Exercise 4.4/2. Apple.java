package Exercise4_4;

public class Apple extends Fruit {
	
	protected double price;
	protected int quantity;
	
	public Apple(String name, double p, int qty) {
		super(name);
		this.price = p;
		this.quantity = qty;
		
		if (this.quantity < 10) {
			totalPrice();
			System.out.println("Name  : " + name);
			System.out.println("If the quantity is less than 10, total price is RM" + df2.format(totalPrice()) + ".");
		}
		
		else if (this.quantity > 10 && this.quantity < 50) {
			double p1 = 3.99; 
			totalPrice(p1); 
			System.out.println("Name  : " + name);
			System.out.println("If the quantity is more than 10, total price is RM" + df2.format(totalPrice(p1)) + ".");
		}
		
		else {
			double p1 = 1.99; 
			double d = 0.1; 
			totalPrice(d, p); 
			System.out.println("Name  : " + name);
			System.out.println("If the quantity is more than 50, total price is RM" + df2.format(totalPrice(d, p1)) + ".");
		}
	}
	
	public double totalPrice() {
		return this.price * this.quantity;
	}
	
	public double totalPrice(double p1) {
		return p1 * this.quantity;
	}
	
	public double totalPrice(double d, double p1) {
		return p1 * this.quantity - ((p1 * this.quantity) * d);
	}
	
	public String toString() {
		return name + " are a good source of fiber and vitamin C. "
				+ "\nThey also contain polyphenols, which may have numerous health benefits.";
	}
	
}
