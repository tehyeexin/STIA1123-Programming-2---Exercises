package Exercise2;

public class ClassSmartphone {
	
	String brand [] = {"Apple", "Samsung", "Huawei"};
	String color [] = {"Pacific blue", "Mirror purple", "Mystic silver"};
	String model [] = {"iPhone 12 Pro Max", "Samsung Galazy Z Flip", "Huawei Mate 40 Pro"};
	double screenSize [] = {6.7, 6.7, 6.76};
	
	void phone1() {
		System.out.println("1.");
		System.out.println("Brand = " + brand[0]);
		System.out.println("Color = " + color[0]);
		System.out.println("Model = " + model[0]);
		System.out.println("Screen size (inch) = " + screenSize[0]);
	}
	
	void phone2() {
		System.out.println("2.");
		System.out.println("Brand = " + brand[1]);
		System.out.println("Color = " + color[1]);
		System.out.println("Model = " + model[1]);
		System.out.println("Screen size (inch) = " + screenSize[1]);
	}
	
	void phone3() {
		System.out.println("3.");
		System.out.println("Brand = " + brand[2]);
		System.out.println("Color = " + color[2]);
		System.out.println("Model = " + model[2]);
		System.out.println("Screen size (inch) = " + screenSize[2]);
	}
	
	void PhoneCall() {
		System.out.println("Smartphone can have a phone call with other people.");
	}
	
	void SendMessage() {
		System.out.println("Smartphone can send message to other people.");
	}
	
	void PlayingGame() {
		System.out.println("Smartphone can play games.");
	}

}
