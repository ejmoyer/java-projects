package assignmentThree;
import java.util.Scanner;

public class InsuranceDriver {

	public static void main(String[] args) {
		Insurance[] insurances;
		insurances = new Insurance[2];
		Scanner input = new Scanner(System.in);
		// enter type of insurance into scanner
		// then write an if for what they type
		for (int x = 0; x < 2; x++) {
			System.out.println("What type of insurance are you applying for?");
			String newInput = input.nextLine();
			if (newInput.equals("health")) {
				insurances[x] = new Health();
				System.out.println("What will your monthly fee be?");
				insurances[x].setInsuranceCost(input.nextDouble());
			} else if (newInput.equals("life")) {
				insurances[x] = new Life();
				System.out.println("What will your monthly fee be?");
				insurances[x].setInsuranceCost(input.nextDouble());
			} else {
				System.out.println("Please input \'health\' or \'life\' for your insurance.");
				System.exit(0);
			}
		}
		
		for (int x = 0; x < 2; x++) {
			System.out.println("What would your new insurance cost be?");
			double newCost = input.nextDouble();
			insurances[x].setInsuranceCost(newCost);
			insurances[x].displayInfo();
		}
	}
}
