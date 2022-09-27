
public class SayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[]{1,2,5,7,9,0};
		int aranacakSayi = 3;
		boolean varmi=false;
		
		for ( int sayi : sayilar) {
			if(sayi == aranacakSayi) {
				varmi = true;
			}
		}
		
		if( varmi == true) {
			System.out.println(aranacakSayi + " sayısı sayilar listesinde vardır.");
		}
		else {
			System.out.println(aranacakSayi + " sayısı sayılar listesinde yoktur.");
		}

	}

}
