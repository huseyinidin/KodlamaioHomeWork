package abstractClasses.src;

public class Main {

	public static void main(String[] args) {

		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.calculate();
		womanGameCalculator.gameOver();
		
		GameCalculator gameCalculator = new OlderGameCalculator() ;
		gameCalculator.calculate();
	}

}
