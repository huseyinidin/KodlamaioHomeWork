package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
				// new Product => The empty constructor runs the method.
		/*
		Product product = new Product(); 
		product.setId(1);
		product.setName("Asus");
		product.setDescription("Notebook");
		product.setPrice(5000);
		product.setStockAmount(3);
		product.setColor("Blue");
		product.getCode();
		*/
		
		Product product = new Product(1, "Asus", "Notebook", 5000, 3, "Blue");
		
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		System.out.println(product.getCode());

		
		/* The single responsibility doesn't match the principle.
		
		productManager.add2(1, "Asus", "Notebook", 500, 3, "");
		productManager.add2(2, "HP", "Notebook", 100, 10,"" );
		productManager.add2(3, "Lenova", "Notebook", 700, 8,"" );
		productManager.add2(4, "Toshiba", "Notebook", 800, 6,"" );
		productManager.add2(5, "Monster", "Notebook", 1000, 1,"" )
		*/
	}

}
