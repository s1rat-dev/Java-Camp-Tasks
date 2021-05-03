package concrete;
import entities.BaseClass;
import interfaces.BaseManagementService;

public class BaseManager implements BaseManagementService{

	@Override
	public void add(BaseClass base) {
		if(!base.isStatus())
		{
			System.out.println("Added to system: " + base.getId());
			base.setStatus(true);
		}	
		else
			System.out.println("It has already been added to the system.");
			
	}

	@Override
	public void delete(BaseClass base) {
		if(base.isStatus())
		{	
			System.out.println("Deleted from system: " + base.getId());
			base.setStatus(false);
		}	
		else
			System.out.println("Already not in the system.");
	}
	
}
