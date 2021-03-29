package Exercise2;

public class MainClassExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassSmartphone a = new ClassSmartphone(); 
		System.out.println("- Smartphone -");
		a.phone1();
		System.out.println();
		a.phone2();
		System.out.println();
		a.phone3();
		System.out.println();
		a.PhoneCall();
		a.SendMessage();
		a.PlayingGame();
		
		System.out.println();
		
		ClassMultiCooker b = new ClassMultiCooker(); 
		System.out.println("- Multi Cooker -");
		b.cooker1();
		System.out.println();
		b.cooker2();
		System.out.println();
		b.cooker3();
		System.out.println();
		b.CookRice();
		b.Steam();
		b.BoilingWater();
	}

}
