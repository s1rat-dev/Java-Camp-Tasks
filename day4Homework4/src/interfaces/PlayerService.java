package interfaces;
import entities.Player;

public interface PlayerService {
	
	public void updateNickname(Player player, String newNickname);
	public void updateEmail(Player player, String newEmail);
	public void showGames(Player player);
	
}
