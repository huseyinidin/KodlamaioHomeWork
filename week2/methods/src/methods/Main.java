package methods.src.methods;

public class Main {

	public static void main(String[] args) {
		findNumber();
	}

	public static void findNumber() {

		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int wanted = 5;
		boolean isTrue = false;

		for (int number : numbers) {
			if (number == wanted) {
				isTrue = true;
				break;
			}
		}

		if (isTrue) {
			message("Number is available: " + wanted);
			// System.out.println("Number is available");
		} else {
			message("Number isn't available: " + wanted);
			// System.out.println("Number isn't available.");
		}

	}

	public static void message(String message) {
		System.out.println(message);
	}

}
