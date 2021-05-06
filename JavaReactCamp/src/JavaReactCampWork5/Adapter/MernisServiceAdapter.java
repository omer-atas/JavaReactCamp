package JavaReactCampWork5.Adapter;
import tr.gov.nvi.tckimlik.WS.*;

import java.rmi.RemoteException;

import JavaReactCampWork5.Abstract.CustomerCheckService;
import JavaReactCampWork5.Entities.Customer;;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return true;
		
	}
	


}
