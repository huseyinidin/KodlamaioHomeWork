package interfaces1.src;

public class CustomerManager {

	// ICustomerDal customerDal; first way
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() { // BUSSINES COD
		
		// customerDal.add(); //first way
		customerDal.add();
	}

}
