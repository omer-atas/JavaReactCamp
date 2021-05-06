package JavaReactCampWork5.Concrete;

import JavaReactCampWork5.Abstract.BaseCustomerManager;
import JavaReactCampWork5.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager  {

	@Override
	public void Save(Customer customer) {
		System.out.println("Save to database for Nero: " + customer.getFirstName() + " " + customer.getLastName());
	}

}
