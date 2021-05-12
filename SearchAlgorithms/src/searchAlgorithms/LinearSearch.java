package searchAlgorithms;

public class LinearSearch {
	
	public int search(int[] arr, int value) {
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] == value) {
				System.out.println("The index is:");
				return x;
			}
		}
		System.out.println("Index wasn't found.");
		return -1;
	}
}
