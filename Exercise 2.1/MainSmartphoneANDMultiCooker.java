package Exercise2;

public class MainSmartphoneANDMultiCooker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("- Smartphone -");
		System.out.println();
		
		Smartphone Apple = new Smartphone();
		System.out.println("1. Brand\t\t: " + Apple.brand[0] +
							"\n   Model\t\t: " + Apple.model[0] +
							"\n   Color\t\t: " + Apple.color[0] +
							"\n   Screen size (inch)\t: " + Apple.screenSize[0]);
		
		System.out.println();
		
		Smartphone Samsung = new Smartphone();
		System.out.println("2. Brand\t\t: " + Samsung.brand[1] +
							"\n   Model\t\t: " + Samsung.model[1] +
							"\n   Color\t\t   : " + Samsung.color[1] +
							"\n   Screen size (inch)\t: " + Samsung.screenSize[1]);
		
		System.out.println();
		
		Smartphone Huawei = new Smartphone();
		System.out.println("3. Brand\t\t: " + Huawei.brand[2] +
							"\n   Model\t\t: " + Huawei.model[2] +
							"\n   Color\t\t: " + Huawei.color[2] +
							"\n   Screen size (inch)\t: " + Huawei.screenSize[2]);
		
		System.out.println();
		Smartphone.PhoneCall();
		Smartphone.SendMessage();
		Smartphone.PlayingGame();
		
		System.out.println("____________________________________________________________");
		System.out.println();
		
		System.out.println("- Multi Cooker -");
		System.out.println();
		
		MultiCooker Philip = new MultiCooker();
		System.out.println("1. Brand\t\t: " + Philip.brand[0] +
							"\n   Model\t\t: " + Philip.model[0] +
							"\n   Capacity (L)\t\t: " + Philip.capacity[0] +
							"\n   Pot Material\t\t: " + Philip.potMaterial[0] +
							"\n   Power consumption (W): " + Philip.powerConsumption[0]);
		
		System.out.println();
		
		MultiCooker Cornell = new MultiCooker();
		System.out.println("2. Brand\t\t: " + Cornell.brand[1] +
							"\n   Model\t\t: " + Cornell.model[1] +
							"\n   Capacity (L)\t\t: " + Cornell.capacity[1] +
							"\n   Pot Material\t\t: " + Cornell.potMaterial[1] +
							"\n   Power consumption (W): " + Cornell.powerConsumption[1]);
		
		System.out.println();
		
		MultiCooker Tefal = new MultiCooker();
		System.out.println("3. Brand\t\t: " + Tefal.brand[2] +
							"\n   Model\t\t: " + Tefal.model[2] +
							"\n   Capacity (L)\t\t: " + Tefal.capacity[2] +
							"\n   Pot Material\t\t: " + Tefal.potMaterial[2] +
							"\n   Power consumption (W): " + Tefal.powerConsumption[2]);
		
		System.out.println();
		MultiCooker.CookRice();
		MultiCooker.Steam();
		MultiCooker.BoilingWater();

	}

}
