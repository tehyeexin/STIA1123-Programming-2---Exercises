package Exercise4_4;

public class Grape extends Fruit{
	
	private int grams;
	private String type; //Seeded or Seedless
	
	public Grape(String name, int g, String t) {
		super(name);
		this.grams = g;
		this.type = t;
		
		switch(this.type) {
		case "Seeded" :
			double redCal = 0.65; //per 1g
			double greenCal = 0.615; //per 1g
			System.out.println("Name : " + name);
			System.out.println("Type : " + t);
			System.out.println("Red Grapes   : " + totalCalories(redCal, g) + " cal per " + g + "g"
								+ "\nGreen Grapes : " + totalCalories(greenCal, g) + " cal per " + g + "g");
		break;
		
		case "Seedless":
			double redCal1 = 0.738; //per 1g
			double greenCal1 = 0.66; //per 1g
			System.out.println("Name : " + name);
			System.out.println("Type : " + t);
			System.out.println("Red Grapes   : " + totalCalories(redCal1, g) + " cal per " + g + "g"
								+ "\nGreen Grapes : " + totalCalories(greenCal1, g) + " cal per " + g + "g");
		break;
		}	
	}
	
	public double totalCalories() { 
		return 0;
	}
	
	public double totalCalories(int g) { 
		return this.grams;
	}
	
	public double totalCalories(double cal, int g) { 
		return cal * this.grams;
	}
	
	public String toString() {
		return name + " contain many important vitamins and minerals,"
				+ "\nincluding more than one-quarter of the RDIs for vitamins C and K.";
	}

}
