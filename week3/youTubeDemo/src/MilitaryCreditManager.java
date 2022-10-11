package youTubeDemo.src;

public class MilitaryCreditManager extends BaseCreditManager implements CreditService {

	@Override
	public void calculate() {
		System.out.println("The military loan has been calculated.");
	}

}
