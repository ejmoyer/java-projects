package assignmentThree;

public class PartTimeGameTester extends GameTester {

	int workHours;
	
	public PartTimeGameTester(String aName, Boolean isFullTime) {
		super(aName, isFullTime);
	}
	
	public void determineSalary() {
		salary = 20.00;
	}
	
	public void setHours(int numHours) {
		workHours = numHours;
	}
}
