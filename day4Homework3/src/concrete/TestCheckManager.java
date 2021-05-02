package concrete;

import entities.Customer;
import interfaces.CustomerCheckService;

public class TestCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}
	
}
