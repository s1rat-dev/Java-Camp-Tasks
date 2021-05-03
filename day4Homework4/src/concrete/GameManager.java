package concrete;
import entities.Campaign;
import entities.Game;
import entities.Player;
import interfaces.GameService;
import interfaces.SystemCheckService;

public class GameManager extends BaseManager implements GameService{

	SystemCheckService systemCheckService;
	
	
	public GameManager(SystemCheckService systemCheckService)
	{
		this.systemCheckService = systemCheckService;
	}
	
	
	@Override
	public void sellToPlayer(Player player, Game game) {
		// Sistemde var mý diye kontrol edilir.
		if(systemCheckService.isItOnSystem(game) && systemCheckService.isItOnSystem(player))
		{
			System.out.println("Trying to selling game.");
			System.out.println("Game price: " + game.getUnitPrice());
			player.addToLibrary(game);
		}
		else
			System.out.println("There is a value that not included by system.");
		
		
	}

	@Override
	public void sellToPlayer(Player player, Game game, Campaign campaign) {
		if(systemCheckService.isItOnSystem(game) && systemCheckService.isItOnSystem(player) && systemCheckService.isItOnSystem(campaign))
		{
			System.out.println("Trying to selling game with campaign");
			System.out.println("Game price: " + (game.getUnitPrice() - game.getUnitPrice() * (campaign.getDiscount() / 100)));
			player.addToLibrary(game);
		}
		else
			System.out.println("There is a value that not included by system.");
	}
	
	
	
}
