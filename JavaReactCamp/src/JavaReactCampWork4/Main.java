package JavaReactCampWork4;

public class Main {

	public static void main(String[] args) {


		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setCampaignName("Super Mayis Firsatlari");
		campaign.setCampaignInfo("Oyun pinlerinde %70'e varan indirimler");
		
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.campaignAdd(campaign);
		
		
		Player player = new Player();
		player.setId(1);
		player.setIdentityNumber("11111111111");
		player.setFirstName("Engin");
		player.setLastName("Demir");
		player.setBirtDay("02.05.1995");
		
		PlayerManager playerManager = new PlayerManager();
		playerManager.userValidation(player);
		playerManager.playerAdd(player);
		
	
		Sale sale = new Sale(1,campaign,player);
		
		SaleManager saleManager = new SaleManager();
		saleManager.playerJoinCampaign(player, campaign);
		
	}

}
