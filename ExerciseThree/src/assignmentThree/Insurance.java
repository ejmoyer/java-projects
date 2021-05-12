package assignmentThree;

public abstract class Insurance {
	
	String insuranceType;
	Double monthlyCost;
	
	public Insurance (String insurType) {
		insuranceType = insurType;
	}
	
	public abstract void setInsuranceCost(double newCost);
	
	public abstract void displayInfo();
	
	public String getInsuranceType() {
		return insuranceType;
	}
	
	public Double getMonthlyCost() {
		return monthlyCost;
	}
}