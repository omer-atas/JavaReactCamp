package JavaReactCampWork4;

public class CampaignManager implements CampaignServices{
	
	@Override
	public void campaignAdd(Player player,Game game,Campaign campaign) {
		Utils.check();
		
		if(SaleManager.control == true) {
			int a = game.getAmount();
			int b = campaign.getDiscountAmount();
			int newAmount;
			
			System.out.println(player.getFirstName()+" isimli kullanicisi icin "+ campaign.getName()+" kampanyasi uygulanýyor...");
			System.out.println("Kampanya uygulanmadan onceki fiyat : " + a);
			
			newAmount = (a - (a*b)/100);
			game.setAmount(newAmount);
			
			System.out.println("Kampanya uygulandý...");
			System.out.println("Oyunun yeni fiyati : " + newAmount);
			
		}else {
			System.exit(0);
		}
		
		
	}


	@Override
	public void campaignUpdate(Player player,Game game,Campaign campaign,int update) {
		Utils.check();
		
		int a = game.getAmount();
		campaign.setDiscountAmount(update);
		int b = campaign.getDiscountAmount();
		int newAmount;
		
		System.out.println("Kampanya miktari guncelleniyor...");
		System.out.println("Kampanya guncellenmeden onceki fiyat : " + a);
		
		newAmount = (a - (a*b)/100);
		game.setAmount(newAmount);
		
		System.out.println("Kampanya uygulandý...");
		System.out.println("Oyunun fiyati : " + newAmount);
	}


}
