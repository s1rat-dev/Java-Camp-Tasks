package main;

import entities.*;
import concrete.*;

public class Main {

	public static void main(String[] args) {
		
		Game ageOf2 = new Game(0, "Age of Empires 2", 31.50);
		Campaign yazIndirimi = new Campaign(1, "Yaz Indirimi", 25);
		Player s1rat = new Player(2,"Sýrat", "Çöp", "s1rat", "siratsemih@gmail.com", "12345678910", 2000);
		
		PlayerManager playerManager = new PlayerManager(new SystemCheckManager(),new PlayerCheckManager());
		GameManager gameManager = new GameManager(new SystemCheckManager());
		CampaignManager campaignManager = new CampaignManager(new SystemCheckManager());
		
		
		playerManager.add(s1rat);
		playerManager.updateNickname(s1rat, "s1rat37");
		System.out.println(s1rat.getNickname()); 
		
		
		campaignManager.add(yazIndirimi);
		campaignManager.updateDiscount(yazIndirimi, 10);
		
		
		gameManager.add(ageOf2);
		gameManager.sellToPlayer(s1rat, ageOf2, yazIndirimi);
		playerManager.showGames(s1rat);
		
	}
}
