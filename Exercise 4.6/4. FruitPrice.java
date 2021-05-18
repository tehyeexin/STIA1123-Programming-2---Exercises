package Exercise4_6;

class ApplePrice implements Price { //sub class for interface Price
	public double totalPrice(int qty) { //same method as in Price
		return 3.99 * qty; //with body
		//3.99 is the new price for apple
	}

	public double totalPrice(int qty, double d) { //same method as in Price
		return (1.99 * qty) - ((1.99 * qty) * (d / 100)); //with body
		//1.99 is the new price for apple
	}
}

class GrapePrice implements Price { //sub class for interface Price
	public double totalPrice(int qty) { //same method as in Price
		return 13.99 * qty; //with body
		//13.99 is the new price for apple
	}

	public double totalPrice(int qty, double d) { //same method as in Price
		return (11.99 * qty) - ((11.99 * qty) * (d / 100)); //with body
		//11.99 is the new price for apple
	}
}
	
class WatermelonPrice implements Price { //sub class for interface Price
	public double totalPrice(int qty) { //same method as in Price
		return 10.99 * qty; //with body
		//10.99 is the new price for apple
	}

	public double totalPrice(int qty, double d) { //same method as in Price
		return (9.99 * qty) - ((9.99 * qty) * (d / 100)); //with body
		//9.99 is the new price for apple
	}
}
