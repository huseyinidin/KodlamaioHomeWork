package reCapDemo1.src.reCapDemo1;

public class Main {
	
	public static void main(String[] args) {

		int number1 = 20;
		int number2 = 25;
		int number3 = 15;
		int largest = number1;
		
		if (largest<number2) {
			largest = number2;
		}
		
		if (largest<number3) {
			largest = number3;
		}
		System.out.println("Largest : " + largest);
	}

}
