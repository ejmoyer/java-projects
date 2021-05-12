package exerciseTwo;

public class Overloads {

	public static void main(String[] args) {
		System.out.printf("Int Addition: %d%n", addition(1,1));
		System.out.printf("Float Addition: %f%n", addition(1.5,1.5));
		System.out.printf("Double Addition: %f%n", addition(12.6664287277627762, 12.6664287277627762));
	}
	
	public static int addition(int val1, int val2) {
		System.out.println("Called int addition method.");
		return val1 + val2;
	}
	
	public static float addition(float val1, float val2) {
		System.out.println("Called float addition method.");
		return val1 + val2;
	}
	
	public static double addition(double val1, double val2) {
		System.out.println("Called double addition method.");
		return val1 + val2;
	}
}
