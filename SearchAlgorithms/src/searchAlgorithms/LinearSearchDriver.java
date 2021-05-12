package searchAlgorithms;

public class LinearSearchDriver {

	public static void main(String[] args) {
		LinearSearch search = new LinearSearch();
		int[] arr = {0, 1, 3, 5, 2, 7};
		System.out.println(search.search(arr, 5));
	}

}
