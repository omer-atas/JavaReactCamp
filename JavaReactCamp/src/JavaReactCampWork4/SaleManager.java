package JavaReactCampWork4;

public class SaleManager implements SalesServices {

	@Override
	public void playerJoinCampaign(Player player,Campaign campaign) {
		
		Utils.check();
		System.out.println(player.getFirstName() + " " + player.getLastName() + " isimli oyuncu "+ campaign.getCampaignName() +" kampanyas�ndan "+ campaign.getCampaignInfo() + " adl� oyunu sat�n ald�..");
		
		
		
	}

	@Override
	public void playerOutCampaign(Player player,Campaign campaign){
		Utils.check();
		System.out.println(player.getFirstName() + " " + player.getLastName() + " isimli oyuncu "+ campaign.getCampaignName() +" kampanyas�ndan "+ campaign.getCampaignInfo() + " adl� oyunu iade etti..");
		
	}

}
