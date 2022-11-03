package staticDegiskenler;

import static java.lang.Math.PI;

public class Driver {// static metotlar sadece static değişkenlere erişebilir

	static int i;

	static {// static block : ilgili sınıfın instance'ı alınmadan otomatik olarak çağırılır
		i = 20;
	}

	public static void main(String[] args) {
		System.out.println(i);

//		Driver.i = 20;
//		System.out.println(Driver.i);

//		System.out.println(Math.PI);
		System.out.println(PI);
// Math sınıfından instance almadan PI değişkenini birçok yerde çağırmak istenirse static kullanılarak import etmek yeterlidir
	}

}
