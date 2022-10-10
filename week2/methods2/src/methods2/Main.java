package methods2.src.methods2;

public class Main {

	public static void main(String[] args) {

		String message = "The weather is very nice today.";
		System.out.println(message.substring(0, 3));

		String newMessage = cityAdd();
		System.out.println(newMessage);

		int num = sum(5, 7);
		System.out.println(num);

		int total = sum2(2, 3, 5, 6, 3);
		System.out.println("integer array = " + total);

	}

	public static void add() {
		System.out.println("Added.");
	}

	public static void delete() {
		System.out.println("Deleted.");

	}

	public static void update() {
		System.out.println("Updated.");

	}

	public static int sum(int number1, int number2) {
		return number1 + number2;
	}

	// ... Veriable Arguments -> integer Array
	public static int sum2(int... numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return total;
	}

	public static String cityAdd() {
		return "Ankara";
	}

}
