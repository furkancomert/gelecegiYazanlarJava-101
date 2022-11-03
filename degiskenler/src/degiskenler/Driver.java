package degiskenler;

public class Driver {

	public static void main(String[] args) {
		byte b; // bellekte 1 byte yer kaplar
		b = 10;
		System.out.println(b);
		short s = 20; // bellekte 2 byte yer kaplar
		System.out.println(s);
		int i = 30; // bellekte 4 byte yer kaplar
		System.out.println(i);
		long l = 40; // bellekte 8 byte yer kaplar
		System.out.println(l);
		float pi = 3.14f; // bellekte 4 byte yer kaplar
		System.out.println(pi);
		double d = 23.3232323;
		System.out.println(d); // bellekte 8 byte yer kaplar
		char c = 'a';
		System.out.println(c);
		boolean bool = false;
		System.out.println(bool);

		int $abc = 10; // değişken adları sayı ile başlayamaz '_','$' veya harf ile başlamalıdır

		// int pi = 314; // tek scop içerisinde aynı değişken ismi kullanılamaz

		// int yas;
		int yas = 34;
		System.out.println(yas); // local değişkenler ilk değerini verilmeden kullanılamaz

	}

}
