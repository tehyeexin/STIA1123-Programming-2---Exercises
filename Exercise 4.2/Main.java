package Exercise4_2;

import java.text.DecimalFormat;

public class Main {
	
	public static DecimalFormat df2 = new DecimalFormat("0.00");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apple a = new Apple("Apple", 2 ,5);
		Grape g = new Grape("Grape", 0.67, 100);
		Watermelon w = new Watermelon("Watermelon", 0.0755, 100);
		RedApple redA = new RedApple("Fuji", 3, 7, "Red", "Sweet", 0.54, 100);
		GreenApple greenA = new GreenApple("Granny Smith", 3, 6, "Green", "Sour", 70);
		
		System.out.println("\n---------- APPLE -----------\n" + a + a.toString1());
		System.out.println("\n\n---------- GRAPE -----------\n" + g);
		System.out.println("\n\n-------- WATERMELON --------\n" + w);
		System.out.println("\n\n----------- FUJI -----------\n" + redA);
		System.out.println("\n\n------- GRANNY SMITH -------\n" + greenA);

	}

}
