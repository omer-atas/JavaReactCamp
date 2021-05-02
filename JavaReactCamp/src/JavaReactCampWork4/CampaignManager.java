package JavaReactCampWork4;

public class CampaignManager implements CampaignServices{

	@Override
	public void campaignAdd(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " adli kampanya olusturuldu.");
		System.out.println("Kampanya bilgisi : " + campaign.getCampaignInfo());
	}

	@Override
	public void campaignDelete(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " adli kampanya kaldirildi.");
		System.out.println("Kampanya bilgisi : " + campaign.getCampaignInfo());
	}

	@Override
	public void campaignUpdate(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " adli kampanya guncelledi.");
		System.out.println("Kampanya bilgisi : " + campaign.getCampaignInfo());
	}


}
