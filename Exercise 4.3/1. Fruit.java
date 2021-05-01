package Exercise4_3;

import java.text.DecimalFormat;

public class Fruit {
	
	public static DecimalFormat df2 = new DecimalFormat("0.00");
	
	protected String name;
	
	public Fruit() { 
		this.name = " ";
	}
	
	public Fruit(String name) { 
		this.name = name;
		System.out.println(name + " constructor is invoked.");
	}
	
	public String toString() { 
		return "Name\t\t: " + name;
	}

}
