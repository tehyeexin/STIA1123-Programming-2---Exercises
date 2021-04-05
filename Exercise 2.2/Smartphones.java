package Exercise2_2;

public class Smartphones {
	
	String brand;
	String model;
	String color;
	double screenSize;
	int weight;
	int price;
	char fingerprint;
	
	void phoneSpec(String b, String m, String c, double s, int w, int p, char f) {
		System.out.println("Brand       : " + b +
							"\nModel       : " + m +
							"\nColor       : " + c +
							"\nScreen size : " + s + " inches" +
							"\nWeight      : " + w + "g" +
							"\nPrice       : RM" + p +
							"\nFingerprint : " + f);
	}
	
	void totalPrice(int p, int quantity, String m) {
		int totalPrice = p*quantity;
		System.out.println("The total price of " + quantity + " " + m + " is RM" + totalPrice + ".");
	}
	
	void chargingTime(double Ah, double A, String m) {
		double chargingTime = Ah/A; // battery capacity (Ah) / charging current (A)
		System.out.printf("The charging time of " + m + " is %.2f", chargingTime);
		System.out.println(" hour.");
	}

	void dimensions(double height, double width, double depth, String m) {
		System.out.println("The dimensions of " + m + " is " + height + "mm X "+ width + "mm X "+ depth + "mm.");
	}

	void weight(int w, int quantity, String m) {
		int totalWeight = w*quantity;
		System.out.println("The total weight of " + quantity + " " + m + " is " + totalWeight + "g.");
	}
	
	

}
