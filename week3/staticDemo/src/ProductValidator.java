package staticDemo.src;

public class ProductValidator {

	static {
		System.out.println("Static constructor worked");
	}

	public ProductValidator() {
		System.out.println("Constructor worked");
	}

	// static = when the method is static, it is called the class name.
	public static boolean isValid(Product product) {

		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}

	public void another() {
		// Constructor
	}

	/*// inner class
	public class anotherClass {
		public static void delete() {

		}
	*/

}
