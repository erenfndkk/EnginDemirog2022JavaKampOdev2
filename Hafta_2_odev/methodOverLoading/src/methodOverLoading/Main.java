package methodOverLoading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int a = dortIslem.topla(3, 423);
		System.out.println(a);
		
		int b = dortIslem.topla(3, 423,523);
		System.out.println(b);
	}

}
