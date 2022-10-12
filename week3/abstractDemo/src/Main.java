package abstractDemo.src;

public class Main {

	public static void main(String[] args) {


		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new OracleDatabaseManager();
		customerManager.getCustomers();
		customerManager.databaseManager = new SqlServesDatabaseManager();
		customerManager.getCustomers();
		customerManager.databaseManager = new MySqlDatabaseManager();
		customerManager.getCustomers();
	}

}
