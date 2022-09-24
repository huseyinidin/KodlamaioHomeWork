package switchDemo;

public class Main {
	
	public static void main(String[] args) {

		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Perfect : You passed.");
			break;
		case 'B':
			System.out.println("Very well : You passed.");
			break;
		case 'C':
			System.out.println("Good : You passed.");
			break;
		case 'D':
			System.out.println("Not bad : You passed.");
			break;
		case 'F':
			System.out.println("You didn't pass the class.");
			break;
		default:
			System.out.println("You entered an invalid grade.");
		}
	}

}
