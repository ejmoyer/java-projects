package assignmentThree;

public class PersonalMortgage extends Mortgage {
	
	public PersonalMortgage(int mortNum, String custName, double cost, double interest, int term) {
		super(mortNum, custName, cost, interest, term);
		interestRate = interestRate + 2.00;
	}
}
