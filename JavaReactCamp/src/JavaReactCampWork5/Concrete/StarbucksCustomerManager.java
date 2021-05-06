package JavaReactCampWork5.Concrete;

import JavaReactCampWork5.Abstract.*;
import JavaReactCampWork5.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Save to database for Starbucks: " + 
					customer.getFirstName() + " " + customer.getLastName());
			super.Save(customer);
		}else {
			System.out.println("Not a valid person");
		}
	}
}
