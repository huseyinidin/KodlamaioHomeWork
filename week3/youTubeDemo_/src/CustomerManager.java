package youTubeDemo_.src;

public class CustomerManager {

	private Customer customer;
	private CreditService creditService;

	// Constructor 							  // interface Reference Type
	public CustomerManager(Customer customer, CreditService creditService) {

		this.customer = customer;
		this.creditService = creditService;

	}

	public void save() {

		creditService.save();
		System.out.println("Customer saved.");
	}

	public void delete() {

		System.out.println("Customer deleted: ");
	}

	public void giveCredit() {

		creditService.calculate();
		System.out.println("Credit gived.");
	}

	/*
	 * ENCAPCULATION - Send the customer object as a parameter // MAIN CODE LINE 21
	 * -25 public void save(Customer customer) {
	 * 
	 * System.out.println("Customer saved"); }
	 */

}
