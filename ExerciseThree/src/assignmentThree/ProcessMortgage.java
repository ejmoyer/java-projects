package assignmentThree;
import java.util.Scanner;

public class ProcessMortgage {
	
	public static void main(String[] args) {
		Mortgage[] mortgages;
		mortgages = new Mortgage[3];
		Scanner input = new Scanner(System.in);
		for (int x = 0; x < 3; x++) {
			System.out.println("What is the current interest rate?");
			Double currentInterest = input.nextDouble();
			System.out.println("What type of mortgage are you applying for?");
			String mortgageType = input.nextLine();
			System.out.println("What is the name of the Mortgage owner?");
			String aName = input.nextLine();
			System.out.println("What is the cost of the Mortgage in question?");
			double aCost = input.nextDouble();
			System.out.println("What is the term for this Mortgage?");
			int aTerm = input.nextInt();
			if (mortgageType.equals("personal")) {
				mortgages[x] = new PersonalMortgage(x, aName, aCost, currentInterest, aTerm);
			} else if (mortgageType.equals("business")) {
				mortgages[x] = new BusinessMortgage(x, aName, aCost, currentInterest, aTerm);
			} else {
				System.out.println("Please select personal or business.");
				System.exit(0);
			}
		}
		
		for (int x = 0; x < 3; x++) {
			mortgages[x].getMortgageInfo();
		}
		
	}
}