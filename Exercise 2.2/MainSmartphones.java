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
		Apple.phoneSpec("Apple", "iPhone 12 Pro Max", "Pacific blue", 6.7, 6999, 'Y');
		System.out.println();
		Apple.totalprice(6999, 2, "iPhone 12 Pro Max");
		Apple.PhoneCall("iPhone 12 Pro Max");
		Apple.SendMessage("iPhone 12 Pro Max");
		Apple.PlayingGame("iPhone 12 Pro Max");
		System.out.println("_______________________________________________________________________");
		System.out.println();
		
		System.out.println("- SAMSUNG SPECIFICATION -");
		System.out.println();
		Samsung.phoneSpec("Samsung", "Samsung Galazy Z Flip", "Mirror purple", 6.7, 3999, 'Y');
		System.out.println();
		Samsung.totalprice(3999, 3, "Samsung Galazy Z Flip");
		Samsung.PhoneCall("Samsung Galazy Z Flip");
		Samsung.SendMessage("Samsung Galazy Z Flip");
		Samsung.PlayingGame("Samsung Galazy Z Flip");
		System.out.println("_______________________________________________________________________");
		System.out.println();
		
		System.out.println("- HUAWEI SPECIFICATION -");
		System.out.println();
		Huawei.phoneSpec("Huawei", "Huawei Mate 40 Pro", "Mystic silver", 6.76, 6999, 'Y');
		System.out.println();
		Huawei.totalprice(6999, 4, "Huawei Mate 40 Pro");
		Huawei.PhoneCall("Huawei Mate 40 Pro");
		Huawei.SendMessage("Huawei Mate 40 Pro");
		Huawei.PlayingGame("Huawei Mate 40 Pro");
		System.out.println("_______________________________________________________________________");
		System.out.println();
		
		System.out.println("- OPPO SPECIFICATION -");
		System.out.println();
		Oppo.phoneSpec("Oppo", "Oppo Find X3 Pro", "Gloss black", 6.7, 4299, 'Y');
		System.out.println();
		Oppo.totalprice(4299, 5, "Oppo Find X3 Pro");
		Oppo.PhoneCall("Oppo Find X3 Pro");
		Oppo.SendMessage("Oppo Find X3 Pro");
		Oppo.PlayingGame("Oppo Find X3 Pro");
		System.out.println("_______________________________________________________________________");
		System.out.println();
		
	}

}
