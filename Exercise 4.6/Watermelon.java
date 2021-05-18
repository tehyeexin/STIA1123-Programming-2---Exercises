package Exercise4_6;

public class Watermelon extends Apple {
	
	public Watermelon(String name, double p, int qty) {
		super(name, p, qty);
	}
	
	public String info() {
		return super.name + " has a high water content which helps to hydrate.";
	}
	
	public String toString() { //overriding
		return info();
	}

}
