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
		System.out.println(player.getFirstName() + " " + player.getLastName() + " isimli oyucu sistemden çikarildi..");
		
		
	}

	@Override
	public void playerUpdate(Player player) {
		Utils.check();
		System.out.println("Oyuncubilgilerini güncelliyor..");
		System.out.println(player.getFirstName() + " " + player.getLastName() + " isimli oyuncu bilgileri guncellendi ...");
		
	}

	@Override
	public void userValidation(Player player) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " adli oyuncunun e-devlet üzerinde doðrulamasý yapildi.");
		sayac = sayac+1;
		
	}

}
