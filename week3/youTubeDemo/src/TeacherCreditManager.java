package youTubeDemo.src;

public class TeacherCreditManager extends BaseCreditManager implements CreditService {

	@Override
	public void calculate() {
		System.out.println("The teacher loan has been calculated.");
	}

}
