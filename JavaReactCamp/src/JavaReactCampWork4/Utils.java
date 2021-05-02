package JavaReactCampWork4;

public class Utils {
	public static void check(){
		if(PlayerManager.sayac != 0) {
			System.out.println("Ýslem gerceklestiriliyor..");
			PlayerManager.sayac = 0;
		}else if(PlayerManager.sayac == 0){
			System.out.println("Ýslem gerceklestirilemedi...");
			System.exit(0);
		}
	}
}
