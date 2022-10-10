package perfectNumber.src.perfectNumber;

public class Main {
	
	public static void main(String[] args) {

		int number = 6;
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (sum == number) {
			System.out.println("Perfect number: " + sum);
		} else
			System.out.println("It's not a perfect number: " + sum);
	}

}
