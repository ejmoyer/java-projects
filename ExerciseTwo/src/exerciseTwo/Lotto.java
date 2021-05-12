package exerciseTwo;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Lotto {
	
	Random rand = new Random();
	
	int[] lottoArr = new int[1];
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			Lotto lotto = new Lotto();
			int total = lotto.lottoArr[0] + lotto.lottoArr[1] + lotto.lottoArr[2];
			
			System.out.println("What is your guess?");
			int x = input.nextInt();
			
			if (x == total) {
				System.out.println("You won the lotto!");
				System.exit(0);
				break;
			}
		}
		System.out.println("You lose!");
		System.exit(0);
	}
	
	Lotto() {
		int random1 = rand.nextInt(10);
		
		lottoArr[0] = random1;
		
		int random2 = rand.nextInt(10);
		
		lottoArr = Arrays.copyOf(lottoArr, lottoArr.length + 1);
		lottoArr[lottoArr.length - 1] = random2;
		
		int random3 = rand.nextInt(10);
		
		lottoArr = Arrays.copyOf(lottoArr, lottoArr.length + 1);
		lottoArr[lottoArr.length - 1] = random3;
	}
	
	public int[] returnLotto() {
		return lottoArr;
	}
}
