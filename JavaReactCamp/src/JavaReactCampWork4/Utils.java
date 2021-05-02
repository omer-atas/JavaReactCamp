package JavaReactCampWork4;

public class Utils {
	public static void check(){
		if(PlayerManager.sayac > 0) {
			System.out.println("Ýslem gerceklestiriliyor..");
			
		}else if(PlayerManager.sayac <= 0){
			System.out.println("Ýslem gerceklestirilemedi...");
			System.exit(0);
		}else {
			System.out.println("Sistemde herhangi bir kullanici bulunmamaktadir..");
		}
	}
}
