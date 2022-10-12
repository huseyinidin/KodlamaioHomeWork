package interfaces1.src;

public class Main {

	public static void main(String[] args) {

		//ICustomerDal customerDal = new MySqlCustomerDal();
		//customerDal.add();
		
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		//customerManager.customerDal = new OracleCustomerDal(); first way
		customerManager.add();
	}

}
