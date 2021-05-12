package assignmentThree;

public class Health extends Insurance {
	
	public Health() {
		super("Health");
	}
	
	public void setInsuranceCost(double newCost) {
		monthlyCost = newCost;
	}
	
	public void displayInfo() {
		System.out.println("This is health insurance.");
		System.out.println("Your monthly cost for health insurance is:" + monthlyCost.toString());
	}
}
