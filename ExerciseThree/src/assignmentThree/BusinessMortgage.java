package assignmentThree;

public class BusinessMortgage extends Mortgage {

	public BusinessMortgage(int mortNum, String custName, double cost, double interest, int term) {
		super(mortNum, custName, cost, interest, term);
		interestRate = interestRate + 1.00;
	}
}
