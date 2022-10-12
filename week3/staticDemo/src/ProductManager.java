package staticDemo.src;

public class ProductManager {

	public void add(Product product) {
		
		//static = when the method is static, it is called the class name. 
		//ProductValidator validator = new ProductValidator();
		//Static 
		if (ProductValidator.isValid(product)) {
			System.out.println("Product added.");
		} else {
			System.out.println("Product information is invalid.");
		}
		
		//Constructor
		//ProductValidator productValidator = new ProductValidator();
		//.another();

	}

}
