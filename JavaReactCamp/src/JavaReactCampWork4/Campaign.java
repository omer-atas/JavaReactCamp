package JavaReactCampWork4;

public class Campaign {
	private int id;
	private String campaignName;
	private String campaignInfo;
	
	public Campaign() {}
	
	public Campaign(int id, String campaignName, String campaignInfo) {
		this.id = id;
		this.campaignName = campaignName;
		this.campaignInfo = campaignInfo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getCampaignInfo() {
		return campaignInfo;
	}

	public void setCampaignInfo(String campaignInfo) {
		this.campaignInfo = campaignInfo;
	}
	
	
}
