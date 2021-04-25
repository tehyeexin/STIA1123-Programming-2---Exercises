package Exercise4_1;

import java.text.DecimalFormat;

public class Main {
	
	public static DecimalFormat df2 = new DecimalFormat("0.00");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruit f = new Fruit("Fruit");
		Apple a = new Apple("Apple", 2, 5);
		Grape g = new Grape("Grape", 0.67, 100);
		Watermelon w = new Watermelon("Watermelon", 0.0755, 100);
		RedApple redA = new RedApple("Fuji", 3, 7, "Red", "Sweet", 0.54, 100);
		GreenApple greenA = new GreenApple("Granny Smith", 3, 6, "Green", "Sour", 70);
		
		System.out.println("\n" + f);
		System.out.println("\n" + a + "\nTotal price: RM"+ df2.format(a.totalPrice()));
		System.out.println("\n" + g + "\nTotal calories: "  + df2.format(g.totalCalories()) + "cal");
		System.out.println("\n" + w + "\nTotal carbohydrates: " + df2.format(w.totalCarbs()) + "g");
		System.out.println("\n" + redA + "\nTotal Vitamin A: " + df2.format(redA.totalVitaminA()) + "IU");
		System.out.println("\n" + greenA + "\nTotal weight: " + df2.format(greenA.totalWeight()) + "g");
		
	}

}
