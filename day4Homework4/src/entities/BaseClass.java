package entities;
import interfaces.BaseClassService;

public class BaseClass implements BaseClassService{
	private int id;
	private boolean status;
	
	public BaseClass(int id)
	{
		this.setId(id);
		this.setStatus(false);
	}
	
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public boolean isStatus() {
		return status;
	}
	
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
	
}
