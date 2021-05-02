package JavaReactCampWork4;

public class Main {

	public static void main(String[] args) {


		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setCampaignName("Super Mayis Firsatlari");
		campaign.setCampaignInfo("Valorant");
		
		
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
		playerManager.playerUpdate(player);
		
		SaleManager saleManager = new SaleManager();
		saleManager.playerJoinCampaign(player, campaign);
		saleManager.playerOutCampaign(player, campaign);
		
	}

}
