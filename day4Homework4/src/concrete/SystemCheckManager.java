package concrete;
import entities.BaseClass;
import interfaces.SystemCheckService;

public class SystemCheckManager implements SystemCheckService{

	@Override
	public boolean isItOnSystem(BaseClass base) 
	{
		if(base.isStatus())
			return true;
		return false;
	}

}
