package searchAlgorithms;

public class BinarySearch {
	
	public void sorting(int[] arr) {
		boolean wasSwapped; // tells if something was swapped
		int valHolder; // holds a value temporarily, so we dont lose it when changing around values
		for (int j = 0; j < arr.length - 1; j++) {
			wasSwapped = false; // start at false each time
				
		for (int i = 0; i < arr.length - j - 1; i++) { // subtract j from our limit because we already know those parts are sorted
			// for however many spots we have left 
			if (arr[i] > arr[i + 1]) {
				valHolder = arr[i]; // hold this value
				arr[i] = arr[i + 1]; // swap smaller value left
				arr[i + 1] = valHolder; // swap where smaller value was with temp
				wasSwapped = true; // it was swapped
				}
			}
			// once we're done sorting, if it was never swapped, that means it sorted.
			if (wasSwapped == false) {
				break;
			}
		}
	}
	
	public int search(int[] arr, int value) {
		int start = 0;
		int end = arr.length - 1;
		// we have a start and an end value
		// we have a while loop to continue going over our possible values
		while (start <= end) {
			int middle = start + (end - 1) / 2;
			// need a middle value to check between the two
			
			// if the middle is our value, return it
			if (arr[middle] == value) {
				System.out.println("Your index is at: ");
				return middle;
			} 
			// if the value we're looking for is bigger than the middle value, we move the start up to the second half
			if (arr[middle] < value) {
				start = middle + 1;
			} else {
				// otherwise we look at the first half instead
				end = middle - 1;
			}
		}
		return -1;
	}
	
	public void displayArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
}
