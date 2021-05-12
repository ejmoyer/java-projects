package exerciseFour;

public class LargestElement {
	
	public void checkLargest(int[] arr) {
		int middle = (arr.length - 1) / 2;
		if (arr[0] > arr[middle] && arr[0] > arr[arr.length - 1]) {
			System.out.println("The first element in the array is the largest!");
		} else if (arr[0] < arr[middle] && arr[middle] > arr[arr.length - 1]) {
			System.out.println("The middle element is the largest.");
		} else if (arr[arr.length - 1] > arr[middle] && arr[arr.length - 1] > arr[0]) {
			System.out.println("The last element is the largest.");
		} else {
			System.out.println("None of them are the largest.");
		}
	}
}
