package interfaces1.src;

public class MySqlCustomerDal implements ICustomerDal, IRepository{

	@Override
	public void add() {

		System.out.println("My Sql added");
	}

}
