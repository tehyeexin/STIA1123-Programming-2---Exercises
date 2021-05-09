package Exercise4_5;

public class Watermelon extends Fruit {
	
	private String type;
	private double kilogram;
	
	public Watermelon(String name, String t, double kg) {
		super(name);
		this.type = t;
		this.kilogram = kg;
		
		Discount discWM = new WatermelonDiscount(); //create new object - discount for class watermelon
		double d = discWM.discountPercent();
		
		switch(this.type) {
		case "Amarillo" :
			System.out.println("Name        : " + name);
			System.out.println(info("Round", "Yellow"));
			double pA = 2.99;
			if (this.kilogram < 5) { //if kilogram less than 5, no discount 
				System.out.println("Price       : RM" + df2.format(pA) + " per 1 kg"
						+ "\nWeight      : " + kg + "kg"
						+ "\nTotal price : RM" + df2.format(totalPrice(pA))
						+ "\n*No discount if buy less than 5kg");
			}
			else { //if kilogram more than 5, get discount 
				System.out.println("Price       : RM" + df2.format(pA) + " per 1 kg"
						+ "\nWeight      : " + kg + "kg"
						+ "\nTotal price : RM" + df2.format(totalPrice(pA))
						+ "\nDiscount    : " + discWM.discountPercent() + "%"
						+ "\n*After discount, total price is RM" + df2.format(totalPrice(d, pA)));
			}
		break;
		
		case "Bijou":
			System.out.println("Name        : " + name);
			System.out.println(info("Round", "Red"));
			double pB = 1.29;
			if (this.kilogram < 5) { //if kilogram less than 5, no discount 
				System.out.println("Price       : RM" + df2.format(pB) + " per 1 kg"
						+ "\nWeight      : " + kg + "kg"
						+ "\nTotal price : RM" + df2.format(totalPrice(pB))
						+ "\n*No discount if buy less than 5kg");
			}
			else { //if kilogram more than 5, get discount 
				System.out.println("Price       : RM" + df2.format(pB) + " per 1 kg"
						+ "\nWeight      : " + kg + "kg"
						+ "\nTotal price : RM" + df2.format(totalPrice(pB))
						+ "\nDiscount    : " + discWM.discountPercent() + "%"
						+ "\n*After discount, total price is RM" + df2.format(totalPrice(d, pB)));
			}
		break;
		
		case "Jamboree":
			System.out.println("Name        : " + name);
			System.out.println(info("Elongated uniform", "Red"));
			double pJ = 3.99;
			if (this.kilogram < 5) { //if kilogram less than 5, no discount 
				System.out.println("Price       : RM" + df2.format(pJ) + " per 1 kg"
						+ "\nWeight      : " + kg + "kg"
						+ "\nTotal price : RM" + df2.format(totalPrice(pJ))
						+ "\n*No discount if buy less than 5kg");
			}
			else { //if kilogram more than 5, get discount 
				System.out.println("Price       : RM" + df2.format(pJ) + " per 1 kg"
						+ "\nWeight      : " + kg + "kg"
						+ "\nTotal price : RM" + df2.format(totalPrice(pJ))
						+ "\nDiscount    : " + discWM.discountPercent() + "%"
						+ "\n*After discount, total price is RM" + df2.format(totalPrice(d, pJ)));
			}
		break;
		
		}
	}	
	
	public String info() { //overloading with no arguments
		return "Type        : " + this.type;
	}
	
	public String info(String s) { //overloading with 1 arguments
		return "Type        : " + this.type + "\nShape       : " + s;
	}
	
	public String info(String s, String c) { //overloading with 2 arguments
		return "Type        : " + this.type + "\nShape       : " + s + "\nColor       : " + c;
	}
	
	public double totalPrice() { //overloading with no arguments
		return 0;
	}
	
	public double totalPrice(double p) { //overloading with 1 arguments
		return p * this.kilogram;
	}
	
	public double totalPrice(double d, double p) { //overloading with 2 arguments
		return (p * this.kilogram) - ((p * this.kilogram) * (d / 100));
	}
	
	public String toString() { //overriding
		return name + " has a high water content. "
				+ "\nThis makes it hydrating and helps you feel full.";
	}

}
