package exerciseFour;

public class IncreasingAdjacent {
	
	public void checkAdjacent(int[] arr) {
		
		for (int x = 0; x < arr.length - 2; x++) {
			if (arr[x] + 1 == arr[x+1] && arr[x+1] + 1 == arr[x+2]) {
				System.out.println("This array has three increasing adjacent values.");
				System.exit(0);
			} else if (arr[x] - 1 == arr[x+1] && arr[x+1] - 1 == arr[x+2]) {
				System.out.println("This array has three increasing adjacent values.");
				System.exit(0);
			} else {
				System.out.println("This array does not have three increasing adjacent values.");
				System.exit(0);
			}
		}
	}
}
