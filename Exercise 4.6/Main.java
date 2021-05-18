package Exercise4_6;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("-------------------------- APPLE ---------------------------");
		Apple a = new Apple("Apple", 5.99, 10);
		System.out.println(a);
		System.out.println("_____________________________________________________________");

		System.out.println("\n\n-------------------------- GRAPE ----------------------------");
		Grape g = new Grape("Grape", 15.99, 30);
		System.out.println(g);
		System.out.println("_____________________________________________________________");
		
		System.out.println("\n\n------------------------ WATERMELON -------------------------");
		Watermelon w = new Watermelon("Watermelon", 12.99, 60);
		System.out.println(w);
		System.out.println("_____________________________________________________________");

		System.out.println("\n\n--------------------------- FUJI ----------------------------");
		RedApple redA = new RedApple("Fuji", 4.75, 50);
		System.out.println(redA);
		System.out.println("_____________________________________________________________");
		
		System.out.println("\n\n------------------------ GRANNY SMITH -----------------------");
		GreenApple greenA = new GreenApple("Granny Smith", 4.50, 100);
		System.out.println(greenA);
		System.out.println("_____________________________________________________________");

	}

}
