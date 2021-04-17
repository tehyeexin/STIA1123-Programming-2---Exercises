package Exercise3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bear panda = new Bear();
		System.out.println("\n___________________ GIANT PANDA ___________________");
		System.out.println("\nBreed\t\t\t\t: " + panda.breed
							+ "\nColor\t\t\t\t: " + panda.color
							+ "\nGenus\t\t\t\t: " + panda.genus
							+ "\nPlace of origin\t\t\t: " + panda.placeOfOrigin
							+ "\nAverage weight of male bears    : " + panda.weightMale + "kg"
							+ "\nAverage weight of female bears  : " + panda.weightFemale + "kg");
		System.out.println();
		
		Bear polar = new Bear("Polar Bear", "White", "Ursus", "Arctic", 500, 300);
		System.out.println("\n___________________ POLAR BEAR ____________________");
		System.out.println("\nBreed\t\t\t\t: " + polar.breed
							+ "\nColor\t\t\t\t: " + polar.color
							+ "\nGenus\t\t\t\t: " + polar.genus
							+ "\nPlace of origin\t\t\t: " + polar.placeOfOrigin
							+ "\nAverage weight of male bears    : " + polar.weightMale + "kg"
							+ "\nAverage weight of female bears  : " + polar.weightFemale + "kg");
		System.out.println();
		
		Bear sun = new Bear("Sun Bear", "Black and orange", "Helarctos", "Southeast Asia", 38.5, 46);
		System.out.println("\n____________________ SUN BEAR _____________________");
		System.out.println("\nBreed\t\t\t\t: " + sun.breed
							+ "\nColor\t\t\t\t: " + sun.color
							+ "\nGenus\t\t\t\t: " + sun.genus
							+ "\nPlace of origin\t\t\t: " + sun.placeOfOrigin
							+ "\nAverage weight of male bears    : " + sun.weightMale + "kg"
							+ "\nAverage weight of female bears  : " + sun.weightFemale + "kg");

	}

}
