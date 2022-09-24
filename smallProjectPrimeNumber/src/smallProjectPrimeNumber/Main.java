package smallProjectPrimeNumber;

public class Main {
	
	public static void main(String[] args) {

		int number = 100, check;

		for (int i = 2; i <= 100; i++) {

			check = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					check = 1;
					break;
				}
			}
			if (check == 0) {
				System.out.println("Prime number: " + i);
				number++;
			} else {
				System.out.println("It isn't prime number: " + i);
			}
		}
	}

}
