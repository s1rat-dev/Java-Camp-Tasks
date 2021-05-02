package concrete;

import entities.Customer;
import interfaces.CustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService)
	{
		this.customerCheckService = customerCheckService;
	}
	
	public void save(Customer customer)
	{
		if(this.customerCheckService.checkIfRealPerson(customer))
			super.save(customer);
		else
			System.out.println("Not a valid person.");
			
	}

}
