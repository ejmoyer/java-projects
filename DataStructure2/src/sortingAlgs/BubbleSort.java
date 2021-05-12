package sortingAlgs;

public class BubbleSort {
	
	public void bubbleSort(int arr[]) {
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
	// goes over each value of the array and prints it out
	public void displayArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
}
