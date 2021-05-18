package Exercise4_6;

public class Apple extends Fruits {
	
	protected double price;
	protected int quantity;
	
	public Apple(String name, double p, int qty) {
		super(name);
		this.price = p;
		this.quantity = qty;
		
		Price tpA = new ApplePrice(); 
		Price tpG = new GrapePrice();
		Price tpW = new WatermelonPrice();
		
		System.out.println("Name        : " + name);
		
		if (this.quantity <= 10) { 
			System.out.println("Price       : RM" + df2.format(p)
								+ "\nQuantity    : " + qty + " (10 and below)"
								+ "\nTotal price : RM" + df2.format(p * qty));
		}
		
		else if (this.quantity > 10 && this.quantity <= 50) { 
			if (name == "Apple" || name == "Fuji" || name == "Granny Smith") {
				double pA = 3.99; //new price for Apple
				System.out.println("Price       : RM" + df2.format(pA)
									+ "\nQuantity    : " + qty + " (50 and below)"
									+ "\nTotal price : RM" + df2.format(tpA.totalPrice(qty)));
			}
			
			else if (name == "Grape") {
				double pG = 13.99; //new price for Grape
				System.out.println("Price       : RM" + df2.format(pG)
									+ "\nQuantity    : " + qty + " (50 and below)"
									+ "\nTotal price : RM" + df2.format(tpG.totalPrice(qty)));
			}
			
			else if (name == "Watermelon") {
				double pW = 10.99; //new price for Watermelon
				System.out.println("Price       : RM" + df2.format(pW)
									+ "\nQuantity    : " + qty + " (50 and below)"
									+ "\nTotal price : RM" + df2.format(tpW.totalPrice(qty)));
			}
		}
		
		else { 
			if (name == "Apple" || name == "Fuji" || name == "Granny Smith") {
				double pA = 1.99; //new price for Apple
				Discount dA = new AppleDiscount(); //create new object
				double d = dA.discountPercent();
				System.out.println("Price       : RM" + df2.format(pA)
									+ "\nQuantity    : " + qty + " (more than 50)"
									+ "\nDiscount    : " + dA.discountPercent() + "%"
									+ "\nTotal price : RM" + df2.format(tpA.totalPrice(qty, d)));
			}
			
			else if (name == "Grape") {
				double pG = 11.99; //new price for Grape
				Discount dG = new GrapeDiscount(); //create new object
				double d = dG.discountPercent();
				System.out.println("Price       : RM" + df2.format(pG)
									+ "\nQuantity    : " + qty + " (more than 50)"
									+ "\nDiscount    : " + dG.discountPercent() + "%"
									+ "\nTotal price : RM" + df2.format(tpG.totalPrice(qty, d)));
			}
			
			else if (name == "Watermelon") {
				double pW = 9.99; //new price for Watermelon
				Discount dW = new WatermelonDiscount(); //create new object
				double d = dW.discountPercent();
				System.out.println("Price       : RM" + df2.format(pW)
									+ "\nQuantity    : " + qty + " (more than 50)"
									+ "\nDiscount    : " + dW.discountPercent() + "%"
									+ "\nTotal price : RM" + df2.format(tpW.totalPrice(qty, d)));
			}
		}
	}
	
	public String info() {
		return super.name + " is a good source of fiber and vitamin C. ";
	}
	
	public String toString() { //overriding
		return info();
	}

}
