package concrete;
import entities.Player;
import interfaces.PlayerCheckService;

public class PlayerCheckManager implements PlayerCheckService{

	@Override
	public boolean isItRealPerson(Player player) {
		if(player.getNationalityId().length() == 11)
			return true;
		return false;
		
	}

}
