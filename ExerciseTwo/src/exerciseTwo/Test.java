package exerciseTwo;
import java.util.Scanner;
import java.util.Random;
public class Test {
	Random rand = new Random();
	Scanner input = new Scanner(System.in);
	int score = 0;
	
	public String simulateQuestion(int questionNum) {
		String[] arr = new String[5];
		arr[0] = "What does the private keyword do?\n1. Prevent use of the keyword reciever outside its own class.\n2. Make a class unable to be used.\n3. Make a function unable to be called again.\n4. Prevent others from seeing your code.";
		arr[1] = "What sort of class do we use to interact with the user and create objects?\n1. Supervisor Class\n2. Tester Class\n3. Manager Class\n4. Driver Class";
		arr[2] = "How do we implement built in java packages?\n1. Calling them directly.\n2. The import keyword.\n3. Writing them ourselves.\n4. Make a Java class and call them from there.";
		arr[3] = "How do we output something to the console?\n1. console.log()\n2. print()\n3. System.out.println()\n4. out()";
		arr[4] = "What do constructors do?\n1. They allow for the population or creation of objects.\n2. Create classes.\n3. They write code for you.\n4. Start new methods.";
		return arr[questionNum];
	}
	
	public String generateMessage(String result) {
		int randomNum = rand.nextInt(3);
		String message = "";
		if (result == "correct") {
			switch (randomNum) {
			case 1: randomNum = 0;
			message = "Correct";
			break;
			case 2: randomNum = 1;
			message = "Right answer!";
			break;
			case 3: randomNum = 2;
			message = "Great job!";
			break;
			case 4: randomNum = 3;
			message = "Great! Keep going!";
			break;
			}
		} else {
			switch (randomNum) {
			case 1: randomNum = 0;
			message = "Incorrect.";
			break;
			case 2: randomNum = 1;
			message = "Wrong, try again.";
			break;
			case 3: randomNum = 2;
			message = "Keep trying.";
			break;
			case 4: randomNum = 3;
			message = "Try again!";
			break;
			}
		}
		return message;
	}
	
	public int inputAnswer() {
		System.out.println("Choose an answer.");
		return input.nextInt();
	}
	
	public Boolean checkAnswer(int questionNum, int answer) {
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 4;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 1;
		
		if (arr[questionNum] == answer) {
			score = score + 1;
			return true;
		} else {
			return false;
		}
	}
}
