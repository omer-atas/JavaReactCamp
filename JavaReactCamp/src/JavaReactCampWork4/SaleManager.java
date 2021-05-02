package JavaReactCampWork4;

public class SaleManager implements SalesServices {
	static boolean control;
	@Override
	public void playerJoinCampaign(Player player,Campaign campaign,Game game) {
		control = true;
		Utils.check();
		System.out.println(player.getFirstName() + " " + player.getLastName() + " isimli oyuncu "+ campaign.getName() +" kampanyasýndan " +
										game.getName() + " adlý oyunu satýn alýyor..");
		
	}

	@Override
	public void playerOutCampaign(Player player,Campaign campaign,Game game){
		control = false;
		Utils.check();
		System.out.println(player.getFirstName() + " " + player.getLastName() + " isimli oyuncu "+ campaign.getName() + 
										" kampanyasýndan "+ game.getName() + " adlý oyunu iade etti..");
		System.out.println("Ýade edilen tutar : " + game.getAmount());
		
	}

}
