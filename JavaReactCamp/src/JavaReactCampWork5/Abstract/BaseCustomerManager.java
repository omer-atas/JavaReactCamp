package JavaReactCampWork5.Abstract;

import JavaReactCampWork5.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void Save(Customer customer) {
		System.out.println("Saved to db : " + customer.getFirstName());
	}

}
