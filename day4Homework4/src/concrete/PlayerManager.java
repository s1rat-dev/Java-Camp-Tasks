package concrete;
import entities.Game;
import entities.Player;
import interfaces.PlayerCheckService;
import interfaces.PlayerService;
import interfaces.SystemCheckService;

public class PlayerManager extends BaseManager implements PlayerService{
	
	SystemCheckService systemCheckService;
	PlayerCheckService playerCheckService;
	
	
	public PlayerManager(SystemCheckService systemCheckService, PlayerCheckService playerCheckService)
	{
		this.systemCheckService = systemCheckService;
		this.playerCheckService = playerCheckService;
	}
	
	

	public void add(Player player)
	{
		if(playerCheckService.isItRealPerson(player))
			super.add(player);
		else
			System.out.println("Not a valid player.");
	}


	@Override
	public void updateNickname(Player player, String newNickname) {
		
		if(systemCheckService.isItOnSystem(player))
		{
			player.setNickname(newNickname);
			System.out.println("Updated successfully.");
		}
		else
			System.out.println("There is not this player on system.");
		
	}


	@Override
	public void updateEmail(Player player, String newEmail) {
		
		if(systemCheckService.isItOnSystem(player))
		{
			player.setEmail(newEmail);
			System.out.println("Updated successfully.");
		}
		else
			System.out.println("There is not this player on system.");
		
	}


	@Override
	public void showGames(Player player) {
		
		if(systemCheckService.isItOnSystem(player))
		{
			for(Game game : player.getGameLibrary())
			{
				if(game != null)
					System.out.println(game.getGameName());
			}
		}
		else
			System.out.println("There is not this player on system.");
	}
}
