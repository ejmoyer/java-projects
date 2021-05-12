package sortingAlgs;
import java.util.Scanner;

public class BubbleSortDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BubbleSort bubblesort1 = new BubbleSort();
		
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("What is the next number in the array?");
			int aNumber = input.nextInt();
			arr[i] = aNumber;
		}
		System.out.println("The original array:");
		bubblesort1.displayArr(arr);
		bubblesort1.bubbleSort(arr);
		System.out.println("After the sort:");
		bubblesort1.displayArr(arr);
	}

}
