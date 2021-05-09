package Exercise4_5;

public class Grape extends Fruit{
	
	private int grams;
	private String type; //Seeded or Seedless
	private int quantity; //quantity per pack
	
	public Grape(String name, int g, String t, int qty) {
		super(name);
		this.grams = g;
		this.type = t;
		this.quantity = qty;
		
		Discount discGrape = new GrapeDiscount(); //create new object - discount for class grape
		double d = discGrape.discountPercent();
		
		switch(this.type) {
		case "Seeded" :
			double redCal = 0.65; //calories of red grapes per 1g
			double redP = 12.95; //price of red grapes per 500g
			double greenCal = 0.615; //calories of green grapes per 1g
			double greenP = 15.80; //price of green grapes per 1kg
			System.out.println("Name : " + name);
			System.out.println("Type : " + t);
			
			if(this.quantity < 3) { //if quantity less than 3, no discount
				System.out.println("\nRed Grapes - Calories    : " + totalCalories(redCal, g) + " cal per " + g + "g"
						+ "\n           - Price       : RM" + df2.format(redP) + " per 500g"
						+ "\n           - Quantity    : " + qty + " pack"
						+ "\n           - Total price : RM" + df2.format(totalPrice(redP))
						+ "\n           *No discount if buy less than 3 packs");

				System.out.println("\nGreen Grapes - Calories    : " + totalCalories(greenCal, g) + " cal per " + g + "g"
						+ "\n             - Price       : RM" + df2.format(greenP) + " per 500g"
						+ "\n             - Quantity    : " + qty + " pack"
						+ "\n             - Total price : RM" + df2.format(totalPrice(greenP))
						+ "\n             *No discount if buy less than 3 packs");
			}
			else { //if quantity more than 3, get discount 
				System.out.println("\nRed Grapes - Calories    : " + totalCalories(redCal, g) + " cal per " + g + "g"
						+ "\n           - Price       : RM" + df2.format(redP) + " per 500g"
						+ "\n           - Quantity    : " + qty + " pack"
						+ "\n           - Total price : RM" + df2.format(totalPrice(redP))
						+ "\n           - Discount    : " + discGrape.discountPercent() + "%"
						+ "\n*After discount, total price is RM" + df2.format(totalPrice(d, redP)));

				System.out.println("\nGreen Grapes - Calories    : " + totalCalories(greenCal, g) + " cal per " + g + "g"
						+ "\n             - Price       : RM" + df2.format(greenP) + " per 500g"
						+ "\n             - Quantity    : " + qty + " pack"
						+ "\n             - Total price : RM" + df2.format(totalPrice(greenP))
						+ "\n             - Discount    : " + discGrape.discountPercent() + "%"
						+ "\n*After discount, total price is RM" + df2.format(totalPrice(d, greenP)));
			}
			System.out.println();
		break;
		
		case "Seedless":
			double redCal1 = 0.738; //calories of red grapes per 1g
			double redP1 = 19.99; //price of red grapes per 500g
			double greenCal1 = 0.66; //calories of green grapes per 1g
			double greenP1 = 20.90;  //price of green grapes per 500g
			System.out.println("Name : " + name);
			System.out.println("Type : " + t);
			
			if (this.quantity < 3) { //if quantity less than 3, no discount
				System.out.println("\nRed Grapes - Calories    : " + totalCalories(redCal1, g) + " cal per " + g + "g"
						+ "\n           - Price       : RM" + df2.format(redP1) + " per 500g"
						+ "\n           - Quantity    : " + qty + " box"
						+ "\n           - Total price : RM" + df2.format(totalPrice(redP1))
						+ "\n           *No discount if buy less than 3 packs");
	
				System.out.println("\nGreen Grapes - Calories    : " + totalCalories(greenCal1, g) + " cal per " + g + "g"
						+ "\n             - Price       : RM" + df2.format(redP1) + " per 500g"
						+ "\n             - Quantity    : " + qty + " box"
						+ "\n             - Total price : RM" + df2.format(totalPrice(redP1))
						+ "\n             *No discount if buy less than 3 packs");
			}
			else { //if quantity more than 3, get discount 
				System.out.println("\nRed Grapes - Calories    : " + totalCalories(redCal1, g) + " cal per " + g + "g"
								+ "\n           - Price       : RM" + df2.format(redP1) + " per 500g"
								+ "\n           - Quantity    : " + qty + " box"
								+ "\n           - Total price : RM" + df2.format(totalPrice(redP1))
								+ "\n           - Discount    : " + discGrape.discountPercent() + "%"
								+ "\n*After discount, total price is RM" + df2.format(totalPrice(d, redP1)));
			
				System.out.println("\nGreen Grapes - Calories    : " + totalCalories(greenCal1, g) + " cal per " + g + "g"
								+ "\n             - Price       : RM" + df2.format(redP1) + " per 500g"
								+ "\n             - Quantity    : " + qty + " box"
								+ "\n             - Total price : RM" + df2.format(totalPrice(redP1))
								+ "\n             - Discount    : " + discGrape.discountPercent() + "%"
								+ "\n*After discount, total price is RM" + df2.format(totalPrice(d, redP1)));
			}
			System.out.println();
		break;
		}	
	}
	
	public double totalCalories() { //overloading with no arguments
		return 0;
	}
	
	public double totalCalories(int g) { //overloading with 1 arguments
		return this.grams;
	}
	
	public double totalCalories(double cal, int g) { //overloading with 2 arguments
		return cal * this.grams;
	}
	
	public double totalPrice() { //overloading with no arguments
		return 0;
	}
	
	public double totalPrice(double p) { //overloading with 1 arguments
		return p * this.quantity;
	}
	
	public double totalPrice(double d, double p) { //overloading with 2 arguments
		return (p * this.quantity) - ((p * this.quantity) * (d / 100));
	}
	
	public String toString() { //overriding
		return name + " contain many important vitamins and minerals,"
				+ "\nincluding more than one-quarter of the RDIs for vitamins C and K.";
	}

}
