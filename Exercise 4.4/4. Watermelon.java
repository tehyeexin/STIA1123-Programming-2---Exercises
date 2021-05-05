package Exercise4_4;

public class Watermelon extends Fruit {
	
	private String type;
	
	public Watermelon(String name, String t) {
		super(name);
		this.type = t;
		
		switch(this.type) {
		case "Amarillo" :
			System.out.println("Name  : " + name);
			System.out.println(info("Round", "Yellow"));
		break;
		
		case "Bijou":
			System.out.println("Name  : " + name);
			System.out.println(info("Round", "Red"));
		break;
		
		case "Jamboree":
			System.out.println("Name  : " + name);
			System.out.println(info("Elongated uniform", "Red"));
		break;
		
		}
	}	
	
	public String info() {
		return "Type  : " + this.type;
	}
	
	public String info(String s) {
		return "Type  : " + this.type + "\nShape\t\t: " + s;
	}
	
	public String info(String s, String c) {
		return "Type  : " + this.type + "\nShape : " + s + "\nColor : " + c;
	}
	
	public String toString() {
		return name + " has a high water content. "
				+ "\nThis makes it hydrating and helps you feel full.";
	}

}
