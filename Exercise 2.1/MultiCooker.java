package Exercise2;

public class MultiCooker {
	
	String brand [] = {"Philip", "Cornell", "Tefal"};
	String model [] = {"HD2145", "CMC-S1500X", "CY638D"};
	double capacity [] = {6.0, 1.5, 5.0};
	String potMaterial [] = {"Ceramic", "Stainless steel", "Ceramic"};
	int powerConsumption [] = {1000, 800, 1300};
	
	public static void CookRice() {
		System.out.println("Multi cooker can be used to cook rice.");
	}
	
	public static void Steam() { 
		System.out.println("Multi cooker is able to steam vegetables, meat, and dumplings.");
	}
	
	public static void BoilingWater() {
		System.out.println("Multi cooker has the function of boiling water.");
	}

}
