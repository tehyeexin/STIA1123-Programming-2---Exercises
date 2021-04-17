package Exercise3;

import java.util.Scanner;

public class Bear {
	
	String breed;
	String color;
	String genus;
	String placeOfOrigin;
	double weightMale;
	double weightFemale;
	
	Scanner s = new Scanner(System.in);
	
	//Default constructor
	Bear() {
		System.out.print("Please enter the breed : ");
		this.breed = s.nextLine();
		System.out.print("Please enter the color : ");
		this.color = s.nextLine();
		System.out.print("Please enter the genus : ");
		this.genus = s.nextLine();
		System.out.print("Please enter the place of origin : ");
		this.placeOfOrigin = s.nextLine();
		System.out.print("Please enter the average weight of male bears (kg) : ");
		this.weightMale = s.nextDouble();
		System.out.print("Please enter the average weight of female bears (kg) : ");
		this.weightFemale = s.nextDouble();
	}
	
	//Parameterized constructor
	Bear(String b, String c, String g, String p, double wm, double wf) {
		this.breed = b;
		this.color = c;
		this.genus = g;
		this.placeOfOrigin = p;
		this.weightMale = wm;
		this.weightFemale = wf;
	}

}
