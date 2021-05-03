package entities;

public class Campaign extends BaseClass {
	
	private String campaignName;
	private double discount;
	
	public Campaign(int id, String campaignName, double discount) {
		super(id);
		this.campaignName = campaignName;
		this.discount = discount;
	}
	
	public void setCampaignName(String campaignName)
	{
		this.campaignName = campaignName;
	}
	
	public String getCampaignName()
	{
		return this.campaignName;
	}
	
	public void setDiscount(double discount)
	{
		this.discount = discount;
	}
	
	public double getDiscount()
	{
		return discount;
	}
	
}
