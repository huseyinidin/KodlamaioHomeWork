package youTubeDemo_.src;

public class CreditManager implements CreditService {

	@Override
	public void calculate() {
		System.out.println("Calculated");
	}

	@Override
	public void save() {
		System.out.println("Is given credit");

	}

}
