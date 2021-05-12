package assignmentThree;

public abstract class Mortgage {
	
	int mortgageNum;
	String customerName;
	double mortgageCost;
	double interestRate;
	int mortgageTerm;
	
	public Mortgage(int mortNum, String custName, double cost, double interest, int term) {
		mortgageNum = mortNum;
		customerName = custName;
		mortgageCost = cost;
		interestRate = interest;
		mortgageTerm = term;
	}
	
	public void MortgageConstants() {
		final int shortTerm = 1;
		final int mediumTerm = 3;
		final int longTerm = 5;
		final String bankName = "City Bank";
		final Double mortgageLimit = 300000.00;
	}
	
	public void getMortgageInfo() {
		System.out.println(customerName);
		System.out.println(mortgageCost);
		System.out.println(interestRate);
		System.out.println(mortgageTerm);
	}
}