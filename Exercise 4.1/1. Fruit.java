package Exercise4_1;

import java.text.DecimalFormat;

public class Fruit {
	
	public static DecimalFormat df2 = new DecimalFormat("0.00");
	
	private String name;
	
	public Fruit(String name) {
		this.name = name;
		System.out.println(name + " constructor is invoked");
	}
	
	public String toString() {
		return "Name: " + name;
	}
	
	

}
