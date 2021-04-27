package Exercise4_2;

import java.text.DecimalFormat;

public class Fruit {
	
	public static DecimalFormat df2 = new DecimalFormat("0.00");
	
	protected String name;
	
	public Fruit() { //overloading with no argument
		this.name = " ";
	}
	
	public Fruit(String name) { //overloading with argument
		this.name = name;
		System.out.println(name + " constructor is invoked.");
	}
	
	public String toString() { //overriding
		return "Name\t\t: " + name;
	}
	
	

}
