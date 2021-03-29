package Exercise2;

public class ClassMultiCooker {
	
	String brand [] = {"Philip", "Cornell", "Tefal"};
	String model [] = {"HD2145", "CMC-S1500X", "CY638D"};
	double capacity [] = {6.0, 1.5, 5.0};
	String potMaterial [] = {"Ceramic", "Stainless steel", "Ceramic"};
	int powerConsumption [] = {1000, 800, 1300};
		
	void cooker1() {
		System.out.println("1.");
		System.out.println("Brand = " + brand[0]);
		System.out.println("Model = " + model[0]);
		System.out.println("Capacity (L) = " + capacity[0]);
		System.out.println("Pot material = " + potMaterial[0]);
		System.out.println("Power consumption (W) = " + powerConsumption[0]);
	}
		
	void cooker2() {
		System.out.println("2.");
		System.out.println("Brand = " + brand[1]);
		System.out.println("Model = " + model[1]);
		System.out.println("Capacity (L) = " + capacity[1]);
		System.out.println("Pot material = " + potMaterial[1]);
		System.out.println("Power consumption (W) = " + powerConsumption[1]);
	}
		
	void cooker3() {
		System.out.println("3.");
		System.out.println("Brand = " + brand[2]);
		System.out.println("Model = " + model[2]);
		System.out.println("Capacity (L) = " + capacity[2]);
		System.out.println("Pot material = " + potMaterial[2]);
		System.out.println("Power consumption (W) = " + powerConsumption[2]);
	}	
	
	void CookRice() {
		System.out.println("Multi cooker can cook rice.");
	}
	
	void Steam() { 
		System.out.println("Multi cooker can steam food.");
	}
	
	void BoilingWater() {
		System.out.println("Multi cooker can boiling water.");
	}
}
