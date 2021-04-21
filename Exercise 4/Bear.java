package Exercise3_2;

import java.util.Scanner;

public class Bear {
	
	private String breed;
	private String color;
	private String genus;
	private String placeOfOrigin;
	
	Scanner s = new Scanner(System.in);
	
	public Bear () {
		System.out.print("Please enter the breed : ");
		breed = s.nextLine();
		System.out.print("Please enter the color : ");
		color = s.nextLine();
		System.out.print("Please enter the genus : ");
		genus = s.nextLine();
		System.out.print("Please enter the place of origin : ");
		placeOfOrigin = s.nextLine();
	}
	
	public Bear (String b, String c, String g, String p) {
		breed = b;
		color = c;
		genus = g;
		placeOfOrigin = p;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getGenus() {
		return genus;
	}
	
	public String getPlaceOfOrigin() {
		return placeOfOrigin;
	}
	
	public String toString() {
		return "Breed\t\t\t\t: " + breed + "\nColor\t\t\t\t: " + color + 
				"\nGenus\t\t\t\t: " + genus + "\nPlace of origin\t\t\t: " + placeOfOrigin;
	}

}
