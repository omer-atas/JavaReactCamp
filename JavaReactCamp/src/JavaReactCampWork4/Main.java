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
		
		Player player2 = new Player();
		player2.setId(2);
		player2.setIdentityNumber("999999999");
		player2.setFirstName("Yunus");
		player2.setLastName("Kilic");
		player2.setBirtDay("06.09.1999");
		
		PlayerManager playerManager2 = new PlayerManager();
		playerManager2.playerAdd(player2);
		
		Sale sale = new Sale(1,campaign,player);
		
		SaleManager saleManager = new SaleManager();
		saleManager.playerJoinCampaign(player, campaign);
		
		SaleManager saleManager2 = new SaleManager();
		saleManager2.playerOutCampaign(player2, campaign);
	}

}
