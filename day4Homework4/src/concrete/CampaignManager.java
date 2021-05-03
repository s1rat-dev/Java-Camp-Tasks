package concrete;
import entities.Campaign;
import interfaces.CampaignService;
import interfaces.SystemCheckService;

public class CampaignManager extends BaseManager implements CampaignService{
	
	SystemCheckService SystemCheckService;
	
	public CampaignManager(SystemCheckService systemCheckService) {
		this.SystemCheckService = systemCheckService;
	}
	
	@Override
	public void updateDiscount(Campaign campaign,double newDiscount) {
		if(SystemCheckService.isItOnSystem(campaign))
		{
			campaign.setDiscount(newDiscount);
			System.out.println("Successfully updated.");
		}
		else
			System.out.println("There is not this campaign on system.");
	}	

}
