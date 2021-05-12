package assignmentThree;

public abstract class GameTester {
	
	String testerName;
	Boolean isFullTime;
	Double salary;
	
	public GameTester(String aName, Boolean fullTime) {
		testerName = aName;
		isFullTime = fullTime;
	}
	
	public abstract void determineSalary();
}