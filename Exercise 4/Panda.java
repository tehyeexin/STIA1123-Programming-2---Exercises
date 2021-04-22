package Exercise3_2;

public class Panda extends Bear {
	
	private double weightMale;
	private double weightFemale;
	
	Panda(String b, String c, String g, String p, double wm, double wf) {
		super(b, c, g, p);
		weightMale = wm;
		weightFemale = wf;
	}
	
	public double getWeightMale() {
		return weightMale;
	}
	
	public double getWeightFemale() {
		return weightFemale;
	}
	
	public double totalWeight() {
		return weightMale + weightFemale;
	}
	
	public String toString() {
		return super.toString() + "\nAverage weight of male bears    : " + weightMale + "kg"
				+ "\nAverage weight of female bears  : " + weightFemale + "kg"
				+ "\nTotal average weight\t\t: " + totalWeight() + "kg";
	}

}
