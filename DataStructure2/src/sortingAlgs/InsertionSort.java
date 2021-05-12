package sortingAlgs;

public class InsertionSort {
	
	public void insertionSort(int[] arr) {
		
		for (int i = 1; i < arr.length; i++) {
			int currentVal = arr[i]; // look forward
			int j = i - 1; // look backward/next item
			// while the previous value is bigger than the other values
			while (j >= 0 && arr[j] > currentVal) {
				arr[j + 1] = arr[j]; // move the bigger values over
				j = j - 1; // check a different item
			}
			arr[j + 1] = currentVal; // once you break out, go to the next
		}
	}
	
	public void displayArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
	
}
