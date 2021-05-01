package Exercise4_3;

import java.text.DecimalFormat;

public class Main {

	public static DecimalFormat df2 = new DecimalFormat("0.00");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apple a = new Apple("Apple", 5);
		Grape g = new Grape("Grape");
		Watermelon w = new Watermelon("Watermelon");
		RedApple redA = new RedApple("Fuji", 7, 100);
		GreenApple greenA = new GreenApple("Granny Smith", 6);
		
		System.out.println("\n---------- APPLE -----------\n" + a + a.printPrice());
		System.out.println("\n\n---------- GRAPE -----------\n" + g);
		System.out.println("\n\n-------- WATERMELON --------\n" + w);
		System.out.println("\n\n----------- FUJI -----------\n" + redA);
		System.out.println("\n\n------- GRANNY SMITH -------\n" + greenA);

	}
}
