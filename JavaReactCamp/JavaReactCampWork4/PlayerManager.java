package JavaReactCampWork4;

public class PlayerManager implements PlayerServices,UserValidator {
	static int sayac=0;
	@Override
	public void playerAdd(Player player) {
		Utils.check();
		System.out.println("Oyuncu sisteme kayit oluyor...");
		System.out.println(player.getFirstName() + " " + player.getLastName() + " isimli oyuncu sisteme kayit oldu ...");
		
	}

	@Override
	public void playerDelete(Player player) {
		Utils.check();
		System.out.println("Oyuncu sistemden siliniyor...");
		sayac--;
		System.out.println(player.getFirstName() + " " + player.getLastName() + " isimli oyucu sistemden �ikarildi..");
		
		
		if(sayac == 0) {
			System.out.println("Islem gerceklestirilemedi..");
			System.exit(0);
		}
		
		
	}

	@Override
	public void playerUpdate(Player player) {
		Utils.check();
		System.out.println("Oyuncu bilgilerini g�ncelliyor..");
		System.out.println(player.getFirstName() + " " + player.getLastName() + " isimli oyuncu bilgileri guncellendi ...");
		
	}

	@Override
	public void userValidation(Player player) {
		System.out.println("Do�rulama ger�ekle�tiriliyor..");
		System.out.println(player.getFirstName() + " " + player.getLastName() + " adli oyuncunun e-devlet �zerinde do�rulamas� yapildi.");
		sayac++;
		playerAdd(player);
	}

}