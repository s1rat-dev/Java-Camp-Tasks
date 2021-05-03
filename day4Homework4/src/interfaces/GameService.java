package interfaces;
import entities.*;


public interface GameService {
	
	public void sellToPlayer(Player player,Game game);
	public void sellToPlayer(Player player,Game game,Campaign campaign);
	
}
