package Exercise4_4;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("----------------- APPLE ------------------");
		Apple a = new Apple("Apples", 5.99, 5);
		System.out.println(a);
		
		System.out.println("\n\n--------------- GRAPE ----------------");
		Grape g = new Grape("Grapes", 100, "Seeded");
		System.out.println(g);
		
		System.out.println("\n\n------------- WATERMELON --------------");
		Watermelon w = new Watermelon("Watermelon", "Bijou");
		System.out.println(w);
		
		System.out.println("\n\n---------------- FUJI ----------------");
		RedApple redA = new RedApple("Fuji", 4.75, 3, "Red", "Sweet");
		System.out.println(redA);
		
		System.out.println("\n\n------------ GRANNY SMITH ------------");
		GreenApple greenA = new GreenApple("Granny Smith", 4.50, 6, "Green", "Sour");
		System.out.println(greenA);
		
	}

}
