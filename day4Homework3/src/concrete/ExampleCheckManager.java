package concrete;
import entities.Customer;
import interfaces.CustomerCheckService;

public class ExampleCheckManager implements CustomerCheckService
{
	
	// Baþka bir deneme versiyonu. Bunun yerine baþka bir fonksiyon baþka bir 'check' etme modülü yazýlabilir.
	// Fakat farklý bir check sistemi olacaksa da ayrý bir class olarak tanýmlanmasý gerekir.
	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		if(customer.nationalitId.length() < 11)
		{
			return false;
		}
		return true;
		
	}

}
