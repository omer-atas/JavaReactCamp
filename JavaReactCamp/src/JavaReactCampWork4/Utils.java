package JavaReactCampWork4;

public class Utils {
	public static void check(){
		if(PlayerManager.sayac != 0) {
			System.out.println("�slem gerceklestiriliyor..");
			PlayerManager.sayac = 0;
		}else if(PlayerManager.sayac == 0){
			System.out.println("�slem gerceklestirilemedi...");
			System.exit(0);
		}
	}
}
