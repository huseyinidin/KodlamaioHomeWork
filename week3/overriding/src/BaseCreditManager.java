package overriding.src;

public class BaseCreditManager {

		// Final Keyword can't be overriding. =>
	public final double calculate(double price) {
		return price * 1.18;
	}
}
