package reCapDemo2.src.reCapDemo2;

public class Main {
	
	public static void main(String[] args) {

		double[] myList = { 1.5, 2.2, 7.5, 4.6, 6.2 };
		double total = 0;
		double largest = myList[0];

		for (double number : myList) {
			if (largest < number) {
				largest = number;
			}
			System.out.println(number);
			total += number;

		}
		System.out.println("Total: " + total + " Largest: " + largest);
	}

}
