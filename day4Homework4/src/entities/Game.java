package entities;

public class Game extends BaseClass {
	
	private String gameName;
	private double unitPrice;
	
	public Game(int id,String gameName, double unitPrice) {
		super(id);
		this.setGameName(gameName);
		this.setUnitPrice(unitPrice);
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
	
}
