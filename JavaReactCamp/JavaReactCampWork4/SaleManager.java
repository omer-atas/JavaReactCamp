package JavaReactCampWork4;

public class SaleManager implements SalesServices {
	static boolean control;
	@Override
	public void playerJoinCampaign(Player player,Campaign campaign,Game game) {
		control = true;
		Utils.check();
		System.out.println(player.getFirstName() + " " + player.getLastName() + " isimli oyuncu "+ campaign.getName() +" kampanyas�ndan " +
										game.getName() + " adl� oyunu sat�n al�yor..");
		
	}

	@Override
	public void playerOutCampaign(Player player,Campaign campaign,Game game){
		control = false;
		Utils.check();
		System.out.println(player.getFirstName() + " " + player.getLastName() + " isimli oyuncu "+ campaign.getName() + 
										" kampanyas�ndan "+ game.getName() + " adl� oyunu iade etti..");
		System.out.println("�ade edilen tutar : " + game.getAmount());
		
	}

}
