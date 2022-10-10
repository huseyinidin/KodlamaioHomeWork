package vowels.src.vowels;

public class Main {
	
	public static void main(String[] args) {

		char letter = 'A';

		switch (letter) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Bold vowel");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("Thin vowel");
			break;
		default:
			System.out.println("You have entered an invalid letter.");
		}
	}

}
