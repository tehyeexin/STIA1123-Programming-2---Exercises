package Exercise2_2;

public class MainSmartphones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Smartphones Apple = new Smartphones();
		Smartphones Samsung = new Smartphones();
		Smartphones Huawei = new Smartphones();
		Smartphones Oppo = new Smartphones();
		
		System.out.println("- APPLE SPECIFICATION -");
		System.out.println();
		Apple.phoneSpec("Apple", "iPhone 12 Pro Max", "Pacific blue", 6.7, 228, 4899, 'Y');
		System.out.println();
		Apple.totalPrice(6999, 2, "iPhone 12 Pro Max");
		Apple.chargingTime(3.687, 3, "iPhone 12 Pro Max");
		Apple.dimensions(160.8, 78.1, 7.4, "iPhone 12 Pro Max");
		Apple.weight(228, 2, "iPhone 12 Pro Max");
		System.out.println("_______________________________________________________________________");
		System.out.println();
		
		System.out.println("- SAMSUNG SPECIFICATION -");
		System.out.println();
		Samsung.phoneSpec("Samsung", "Samsung Galazy Z Flip", "Mirror purple", 6.7, 183, 3999, 'Y');
		System.out.println();
		Samsung.totalPrice(3999, 3, "Samsung Galazy Z Flip");
		Samsung.chargingTime(3.3, 3, "Samsung Galazy Z Flip");
		Samsung.dimensions(167.3, 73.6, 7.2, "Samsung Galazy Z Flip");
		Samsung.weight(183, 3, "Samsung Galazy Z Flip");
		System.out.println("_______________________________________________________________________");
		System.out.println();
		
		System.out.println("- HUAWEI SPECIFICATION -");
		System.out.println();
		Huawei.phoneSpec("Huawei", "Huawei Mate 40 Pro", "Mystic silver", 6.76, 212, 6999, 'Y');
		System.out.println();
		Huawei.totalPrice(6999, 4, "Huawei Mate 40 Pro");
		Huawei.chargingTime(4.4, 4.5, "Huawei Mate 40 Pro");
		Huawei.dimensions(162.9, 75.5, 9.1, "Huawei Mate 40 Pro");
		Apple.weight(212, 4, "Huawei Mate 40 Pro");
		System.out.println("_______________________________________________________________________");
		System.out.println();
		
		System.out.println("- OPPO SPECIFICATION -");
		System.out.println();
		Oppo.phoneSpec("Oppo", "Oppo Find X3 Pro", "Gloss black", 6.7, 193, 4299, 'Y');
		System.out.println();
		Oppo.totalPrice(4299, 5, "Oppo Find X3 Pro");
		Oppo.chargingTime(4.5, 4, "Oppo Find X3 Pro");
		Oppo.dimensions(163.6, 74, 8.3, "Oppo Find X3 Pro");
		Apple.weight(193, 5, "Oppo Find X3 Pro");
		System.out.println("_______________________________________________________________________");
		System.out.println();
		
	}

}
