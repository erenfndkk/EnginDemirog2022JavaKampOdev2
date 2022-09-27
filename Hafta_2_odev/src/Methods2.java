
public class Methods2 {

	public static void main(String[] args) {
		String mesaj = "asfsjfşklgjfzmklşdfndzf";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(234,546);
		System.out.println(sayi);
		
		int toplam = topla2(2,5,7,4,35,58,56,678,423,34);
		System.out.println(toplam);
	}

	public static void ekle() {
		System.out.println("eklendi");
	}

	public static void sil() {
		System.out.println("silindi");
	}

	public static void guncelle() {
		System.out.println("güncellendi");
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for(int sayi : sayilar) {
			toplam = toplam + sayi;
			
		}
		return toplam;
	}
	
	public static String sehirVer() {
		return "Çankırı";
	}

}
