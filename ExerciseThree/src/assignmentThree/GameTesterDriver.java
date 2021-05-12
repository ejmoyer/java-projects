package assignmentThree;

import java.util.Scanner;
//import Scanner class
//Let user type which type that want to have
//allow user to enter number of hours for part time testers
public class GameTesterDriver {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What type of Game Tester has been hired? Full Time or Part Time?");
		String newInput = input.nextLine();
		if (newInput.equals("full time")) {
			System.out.println("What is their name?");
			newInput = input.nextLine();
			FullTimeGameTester fulltime1 = new FullTimeGameTester(newInput, true);
			System.out.println(fulltime1.testerName);
			System.out.println("Full Time? " + fulltime1.isFullTime.toString());
		} else if (newInput.equals("part time")) {
			System.out.println("What is their name?");
			newInput = input.nextLine();
			PartTimeGameTester parttime1 = new PartTimeGameTester(newInput, false);
			System.out.println("How many hours should " + newInput + " work?");
			int numHours = input.nextInt();
			parttime1.setHours(numHours);
			System.out.println(parttime1.testerName);
			System.out.println("Full Time? " + parttime1.isFullTime.toString());
			System.out.println("Number of Hours this week: " + parttime1.workHours);
		} else {
			System.out.println("Please pick \'full time\' or \'part time\'.");
			System.exit(0);
		}
	}
}