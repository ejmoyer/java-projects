package assignmentThree;

public class Life extends Insurance {
	
	public Life() {
		super("Life");
	}
	
	public void setInsuranceCost(double newCost) {
		monthlyCost = newCost;
	}
	
	public void displayInfo() {
		System.out.println("This is life insurance.");
		System.out.println("Your monthly cost for life insurance is:" + monthlyCost.toString());
	}
}
