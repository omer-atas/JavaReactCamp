package JavaReactCampWork4;

public class Utils {
	public static void check(){
		if(PlayerManager.sayac > 0) {
			System.out.println("Ýslem gerceklestiriliyor..");
			
		}else if(PlayerManager.sayac <= 0){
			
			System.out.println("KUllanici bulanamadigi icin islem gerceklestirilemedi...");
			System.exit(0);
		}
	}
}
