package Exercise4_6;

class AppleDiscount implements Discount { //sub class for interface Discount
	public int discountPercent() { //same method as in Discount
		return 5; //with body
	}
}

class GrapeDiscount implements Discount { //sub class for interface Discount
	public int discountPercent() { //same method as in Discount
		return 15; //with body
	}
}
	
class WatermelonDiscount implements Discount { //sub class for interface Discount
	public int discountPercent() { //same method as in Discount
		return 10; //with body
	}
}
