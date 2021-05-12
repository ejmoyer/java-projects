package searchAlgorithms;

public class BinarySearchDriver {

	public static void main(String[] args) {
		BinarySearch search = new BinarySearch();
		int[] arr = {5, 2, 4, 1, 3};
		
		search.sorting(arr);
		search.displayArr(arr);
		System.out.println(search.search(arr, 4));
	}

}
