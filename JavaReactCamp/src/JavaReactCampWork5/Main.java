package JavaReactCampWork5;

import java.time.LocalDate;

import JavaReactCampWork5.Abstract.BaseCustomerManager;
import JavaReactCampWork5.Adapter.MernisServiceAdapter;
import JavaReactCampWork5.Concrete.NeroCustomerManager;
import JavaReactCampWork5.Concrete.StarbucksCustomerManager;
import JavaReactCampWork5.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(1985, 1, 6);
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Yusuf");
		customer.setLastName("DOGAN");
		customer.setDateOfBirth(date);
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(customer);
		

	}

}
