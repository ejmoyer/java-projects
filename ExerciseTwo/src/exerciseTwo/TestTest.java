package exerciseTwo;

public class TestTest {

	public static void main(String[] args) {
		Test test1 = new Test();
		for(int i = 0;i<5;i++) {
			System.out.println(test1.simulateQuestion(i));
			if (test1.checkAnswer(i, test1.inputAnswer()) == true) {
				System.out.println(test1.generateMessage("correct"));
			} else {
				System.out.println(test1.generateMessage("incorrect"));
			}
		}
		System.out.println("You got..." + test1.score + " " + "out of 5 correct!");
		double doubleScore = test1.score;
		double divisor = 5;
		double multiplier = 100;
		double result = (doubleScore / divisor) * multiplier;
		System.out.print("Your percentage was...");
		System.out.print(result);
		System.out.print("%");
	}
}
