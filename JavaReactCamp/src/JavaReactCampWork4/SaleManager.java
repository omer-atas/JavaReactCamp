package JavaReactCampWork4;

public class SaleManager implements SalesServices {

	@Override
	public void playerJoinCampaign(Player player,Campaign campaign) {
		
		Utils.check();
		System.out.println(player.getFirstName() + " " + player.getLastName() + " isimli oyuncu "+ campaign.getCampaignName() +" kampanyasýndan "+ campaign.getCampaignInfo() + " adlý oyunu satýn aldý..");
		
		
		
	}

	@Override
	public void playerOutCampaign(Player player,Campaign campaign){
		Utils.check();
		System.out.println(player.getFirstName() + " " + player.getLastName() + " isimli oyuncu "+ campaign.getCampaignName() +" kampanyasýndan "+ campaign.getCampaignInfo() + " adlý oyunu iade etti..");
		
	}

}
