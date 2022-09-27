
public class Methods {

	public static void main(String[] args) {
		sayiBulmaca();

	}
	
	//camel casing
	public static void sayiBulmaca() {
		int[] sayilar = new int[]{1,2,5,7,9,0};
		int aranacakSayi = 7;
		boolean varmi=false;
		
		for ( int sayi : sayilar) {
			if(sayi == aranacakSayi) {
				varmi = true;
			}
		}
		
		String mesaj = "";
		if( varmi == true) {
			mesaj = aranacakSayi + " sayısı sayilar listesinde vardır.";
			mesajVerme(mesaj);
		}
		else {
			mesajVerme(aranacakSayi + " sayısı sayılar listesinde yoktur.");
		}
	}
	public static void mesajVerme(String mesaj) {
		System.out.println(mesaj);
	}

}
