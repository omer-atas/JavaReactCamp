package JavaReactCampWork4;

public class Sale {
	private int id;
	private Campaign campaign;
	private Player player;
	
	public Sale() {}
	
	public Sale(int id, Campaign campaign, Player player) {
		this.id = id;
		this.campaign = campaign;
		this.player = player;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Campaign getCampaign() {
		System.out.println(campaign.getCampaignName());
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	
	
	
	
	
}
