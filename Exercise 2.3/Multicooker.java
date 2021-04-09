package Exercise2_3;

import java.util.Scanner;

public class Multicooker {
	
	Scanner s = new Scanner(System.in);
	
	void brand() {
		System.out.println("1. BRAND AND MODEL");
		System.out.println("Please enter the brand and model you want to purchase: ");
		String brand = s.nextLine();
		String model = s.nextLine();
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println();
	}
	
	void price() {
		System.out.println("2. PRICE AND QUANTITY");
		System.out.println("Please enter the price and quantity of your selected prodcut : ");
		System.out.println("* Promotion! Buy 2 and above get 30% off! *");
		double price = s.nextDouble();
		int quantity = s.nextInt();
		System.out.println("Price    : RM" + price);
		System.out.println("Quantity : " + quantity);
		double totalPrice = (price * quantity) - ((price * quantity) * 30 /100);
		System.out.printf("Your total purchase is RM%.2f." , totalPrice);
		System.out.println();
	}
	
	void cookingTime() {
		System.out.println();
		System.out.println("3. COOKING TIME");
		System.out.println("You can check the cooking time for every cooking function. "
							+ "\n(It is suitable for all types of multicookers.)"
							+ "\nPlease select the following function to proceed."
							+ "\n1.Stew \n2.Rice \n3.Soup \n4.Meat");
		String function = s.next();
		switch (function) {
		case "Stew" :
			System.out.println("Please enter serving size (example : 1) : ");
			int serving1 = s.nextInt();
			int cookingTime1 = serving1 * 30;
			System.out.println("The cooking time is " + cookingTime1 + " mins.");
			System.out.println();
			break;
		
		case "Rice" :
			System.out.println("Please enter serving size (example : 1) : ");
			int serving2 = s.nextInt();
			int cookingTime2 = serving2 * 7;
			System.out.println("The cooking time is " + cookingTime2 + " mins.");
			System.out.println();
			break;
		
		case "Soup" :
			System.out.println("Please enter serving size (example : 1) : ");
			int serving3 = s.nextInt();
			int cookingTime3 = serving3 * 10;
			System.out.println("The cooking time is " + cookingTime3 + " mins.");
			System.out.println();
			break;
		
		case "Meat" :
			System.out.println("Please enter serving size (example : 1) : ");
			int serving4 = s.nextInt();
			int cookingTime4 = serving4 * 8;
			System.out.println("The cooking time is " + cookingTime4 + " mins.");
			System.out.println();
			break;
		}
	}
	
	void waterHeatingTime() {
		System.out.println("4. WATER HEATING TIME");
		System.out.println("You can check the water heating time."
							+ "\nPlease enter the following details to continue."
							+ "\n- Volume (litres) \n- Energy (watts) \n- Start temperature (degree celcius) "
							+ "\n- End temperature (degree celcius) \n- Efficiency (%)");
		int volume = s.nextInt();
		int energy = s.nextInt();
		int startT = s.nextInt();
		int endT = s.nextInt();
		int efficiency = s.nextInt();
		
		double heatingTime = (volume * efficiency * (endT - startT) / energy);
		System.out.println("The heating time for water is " + heatingTime + " mins.");
		System.out.println();
	}
	
	void payment() {
		System.out.println("5. PAYMENT");
		System.out.println("Do you want to pay in one lump sum or pay by instalments? ");
		System.out.println("Please enter 'O' for one lump sum and 'I' for instalments.");
		char payment = s.next().charAt(0);
		if (payment == 'O' || payment == 'o') {
			System.out.println("Payment : One lump sum");
			System.out.println("Thank you for your purchase. Please proceed to the counter for payment.");
		}
		if (payment == 'I' || payment == 'i') {
			System.out.println("Payment : Instalments \n* You will be charged 10% interest every month. *");
			System.out.println("How many months do you want to pay in installments? : ");
			int months = s.nextInt();
			System.out.println("Please enter your total purchase : ");
			double totalpurchase = s.nextDouble();
			System.out.println("Months\t\t: " + months);
			System.out.println("Total purchase  : RM" + totalpurchase);
			double monthlyPayment = totalpurchase / months;
			double monthlyInterest = totalpurchase * 10 /100;
			double totalPayment = monthlyPayment + monthlyInterest;
			System.out.printf("The amount of your monthly payment is RM%.2f" , totalPayment);
			System.out.println("\nThank you for your purchase. Please proceed to the counter for payment.");
		}
	}
	
	

}
