package Exercise4_5;

public class Apple extends Fruit {
	
	protected double price;
	protected int quantity;
	
	public Apple(String name, double p, int qty) {
		super(name);
		this.price = p;
		this.quantity = qty;
		
		if (this.quantity <= 10) { //if quantity less than or equal to 10
			System.out.println("Name        : " + name);
			totalPrice(); //overloading with no arguments
			System.out.println("Price       : RM" + df2.format(p)
					+ "\nQuantity    : " + qty + " (10 and below)"
					+ "\n*No discount if quantity is 10 and below"
					+ "\nTotal price : RM" + df2.format(totalPrice()));
		}
		
		else if (this.quantity > 10 && this.quantity <= 50) { //if quantity is more than 10, less than or equal to 50
			System.out.println("Name        : " + name);
			double p1 = 3.99; //new price
			totalPrice(p1); //overloading with 1 arguments
			System.out.println("Price       : RM" + df2.format(p1)
					+ "\nQuantity    : " + qty + " (50 and below)"
					+ "\n*No discount if quantity is 50 and below"
					+ "\nTotal price : RM" + df2.format(totalPrice(p1)));
		}
		
		else { //if quantity is more than 50
			System.out.println("Name        : " + name);
			double p1 = 1.99; //new price
			Discount discApple = new AppleDiscount(); //create new object - discount for class apple
			double d = discApple.discountPercent();
			totalPrice(d, p1); //overloading with 2 arguments
			System.out.println("Price       : RM" + df2.format(p1)
					+ "\nQuantity    : " + qty + " (more than 50)"
					+ "\nTotal price : RM" + df2.format(totalPrice(p1))
					+ "\nDiscount    : " + discApple.discountPercent() + "%"
					+ "\n*After discount, total price is RM" + df2.format(totalPrice(d, p1)));
		}
	}
	
	public double totalPrice() { //overloading with no arguments
		return this.price * this.quantity;
	}
	 
	public double totalPrice(double p1) { //overloading with 1 arguments
		return p1 * this.quantity;
	}
	
	public double totalPrice(double d, double p1) { //overloading with 2 arguments
		return (p1 * this.quantity) - ((p1 * this.quantity) * (d / 100));
	}
	
	public String toString() { //overriding
		return name + " are a good source of fiber and vitamin C. "
				+ "\nThey also contain polyphenols, which may have numerous health benefits.";
	}

}
