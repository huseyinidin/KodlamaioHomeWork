package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {

		FourOperations fourOperations = new FourOperations();

		int result = fourOperations.sum(10, 10);
		System.out.println(result);

		System.out.println(fourOperations.minus(25, 5));
		System.out.println(fourOperations.multiplication(5, 4));
		System.out.println(fourOperations.devision(100, 5));

	}

}
