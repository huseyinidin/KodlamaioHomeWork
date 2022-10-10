package classesWithAttributes2.src.classesWithAttributes;

public class ProductManager {
	public void add(Product product) {

		System.out.println("Product added: " + product.getDescription());
	}
	
	/* The single responsibility doesn't match the principle.
	
	public void add2(int id, String name, String description, double price, int stockAmount, String color) {
		
	}
	*/
	
	

}
