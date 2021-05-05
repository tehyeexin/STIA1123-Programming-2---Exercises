package Exercise4_4;

import java.text.DecimalFormat;

public class Fruit {
	
	public static DecimalFormat df2 = new DecimalFormat("0.00");
	
	protected String name;
	
	public Fruit(String name) { 
		this.name = name;
		System.out.println(name + " constructor is invoked.");
	}

}
