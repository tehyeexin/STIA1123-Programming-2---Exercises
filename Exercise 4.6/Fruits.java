package Exercise4_6;

import java.text.DecimalFormat;

public abstract class Fruits {
	
	public static DecimalFormat df2 = new DecimalFormat("0.00");
	
	protected String name;
	
	public Fruits(String name) { 
		this.name = name;
		System.out.println(name + " constructor is invoked.");
	}

}