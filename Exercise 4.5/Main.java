package Exercise4_5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-------------------------------- APPLE ---------------------------------");
		Apple a = new Apple("Apples", 5.99, 60);
		System.out.println(a);
		System.out.println("_________________________________________________________________________");
		
		System.out.println("\n\n-------------------------------- GRAPE ----------------------------------");
		Grape g = new Grape("Grapes", 100, "Seeded", 5);
		System.out.println(g);
		System.out.println("_________________________________________________________________________");
		
		System.out.println("\n\n------------------------------ WATERMELON -------------------------------");
		Watermelon w = new Watermelon("Watermelon", "Bijou", 8);
		System.out.println(w);
		System.out.println("_________________________________________________________________________");
		
		System.out.println("\n\n--------------------------------- FUJI ----------------------------------");
		RedApple redA = new RedApple("Fuji", 4.75, 10, "Red", "Sweet");
		System.out.println(redA);
		System.out.println("_________________________________________________________________________");
		
		System.out.println("\n\n------------------------------ GRANNY SMITH -----------------------------");
		GreenApple greenA = new GreenApple("Granny Smith", 4.50, 30, "Green", "Sour");
		System.out.println(greenA);
		System.out.println("_________________________________________________________________________");

	}

}
