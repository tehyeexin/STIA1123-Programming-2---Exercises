package Exercise2_2;

public class Smartphones {
	
	String brand;
	String model;
	String color;
	double screenSize;
	int price;
	char fingerprint;
	
	void phoneSpec(String b, String m, String c, double s, int p, char f) {
		System.out.println("Brand       : " + b +
							"\nModel       : " + m +
							"\nColor       : " + c +
							"\nScreen size : " + s + " inches" +
							"\nPrice       : RM" + p +
							"\nFingerprint : " + f);
	}
	
	void totalprice(int p, int q, String m) {
		int total = p*q;
		System.out.println("The total price of " + q + " " + m + " is RM" + total + ".");
	}
	
	void PhoneCall(String m) {
		System.out.println(m + " can make phone calls with other people.");
	}

	void SendMessage(String m) {
		System.out.println(m + " have the function of sending messages to others.");
	}

	void PlayingGame(String m) {
		System.out.println(m + " can play various games.");
	}
	
	

}
