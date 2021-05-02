package concrete;
import entities.Customer;
import interfaces.CustomerCheckService;

public class ExampleCheckManager implements CustomerCheckService
{
	
	// Ba�ka bir deneme versiyonu. Bunun yerine ba�ka bir fonksiyon ba�ka bir 'check' etme mod�l� yaz�labilir.
	// Fakat farkl� bir check sistemi olacaksa da ayr� bir class olarak tan�mlanmas� gerekir.
	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		if(customer.nationalitId.length() < 11)
		{
			return false;
		}
		return true;
		
	}

}
