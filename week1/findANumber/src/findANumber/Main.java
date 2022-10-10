package findANumber.src.findANumber;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int wanted = 10;
		boolean isTrue = false;

		for (int number : numbers) {
			if (number == wanted) {
				isTrue = true;
				break;
			}
		}

		if (isTrue) {
			System.out.println("Number is available");
		} else {
			System.out.println("Number isn't available.");
		}
	}
}
