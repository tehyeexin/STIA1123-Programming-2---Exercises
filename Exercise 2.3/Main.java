package Exercise2_3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multicooker Philip = new Multicooker();
		Multicooker Cornell = new Multicooker();
		Multicooker Tefal = new Multicooker();
		Multicooker Pensonic = new Multicooker();
		
		System.out.println("- Philip -");
		Philip.brand();
		Philip.price();
		Philip.cookingTime();
		Philip.waterHeatingTime();
		Philip.payment();
		System.out.println("_______________________________________________________________________");
		System.out.println();
		
		System.out.println("- Cornell -");
		Cornell.brand();
		Cornell.price();
		Cornell.cookingTime();
		Cornell.waterHeatingTime();
		Cornell.payment();
		System.out.println("_______________________________________________________________________");
		System.out.println();
		
		System.out.println("- Tefal -");
		Tefal.brand();
		Tefal.price();
		Tefal.cookingTime();
		Tefal.waterHeatingTime();
		Tefal.payment();
		System.out.println("_______________________________________________________________________");
		System.out.println();
		
		System.out.println("- Pensonic -");
		Pensonic.brand();
		Pensonic.price();
		Pensonic.cookingTime();
		Pensonic.waterHeatingTime();
		Pensonic.payment();
		System.out.println("_______________________________________________________________________");
		System.out.println();
	}

}
