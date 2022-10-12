package staticDemo.src;

public class Main {

	public static void main(String[] args) {

		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.name = "";
		product.price = 15;
		
		manager.add(product);
		
		// inner class
		//DatabaseHelper.connection.createConnection();
	}

}
