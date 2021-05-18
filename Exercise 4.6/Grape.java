package Exercise4_6;

public class Grape extends Apple {
	
	public Grape(String name, double p, int qty) {
		super(name, p, qty);
	}
	
	public String info() {
		return super.name + " contains many important vitamins and minerals.";
	}
	
	public String toString() { //overriding
		return info();
	}

}
