package sortingAlgs;
import java.util.Scanner;

public class InsertionSortDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		InsertionSort insertionSort1 = new InsertionSort();

		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("What is the next number in the array?");
			int aNumber = input.nextInt();
			arr[i] = aNumber;
		}
		
		System.out.println("The original array:");
		insertionSort1.displayArr(arr);
		insertionSort1.insertionSort(arr);
		System.out.println("After the sort:");
		insertionSort1.displayArr(arr);
	}

}
