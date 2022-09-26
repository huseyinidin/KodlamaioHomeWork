package methodOverloading;

public class Main {

	public static void main(String[] args) {

		FourOperations fourOperations = new FourOperations();
		System.out.println(fourOperations.sum(1, 2));
		System.out.println(fourOperations.sum(1, 2, 3));
	}

}
