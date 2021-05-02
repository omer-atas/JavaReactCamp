package JavaReactCampWork4;

public class Main {

	public static void main(String[] args) {
		
		Player player = new Player();
		
		player.setId(1);
		player.setFirstName("Emre");
		player.setLastName("DOGAN");
		player.setBirtDay("08-05-1996");
		player.setIdentityNumber("11111111111");

		PlayerManager playerManager = new PlayerManager();
		
		playerManager.userValidation(player);
		playerManager.playerUpdate(player);
		
		Game game = new Game();
		game.setId(1);
		game.setName("Valorant");
		game.setAmount(100);
		
		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setName("Super Mayis Indirimleri");
		campaign.setDiscountAmount(20);
		
		SaleManager saleManager = new SaleManager();
		saleManager.playerJoinCampaign(player, campaign, game);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.campaignAdd(player, game, campaign);
		campaignManager.campaignUpdate(player, game, campaign, 10);
		
		saleManager.playerOutCampaign(player, campaign, game);
	}

}
