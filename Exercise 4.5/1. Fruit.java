package Exercise4_5;

import java.text.DecimalFormat;

public abstract class Fruit {
	
	public static DecimalFormat df2 = new DecimalFormat("0.00");
	
	protected String name;
	
	public Fruit(String name) { 
		this.name = name;
		System.out.println(name + " constructor is invoked.");
	}
	
	public abstract double totalPrice(); //define method as abstract, no body

}
