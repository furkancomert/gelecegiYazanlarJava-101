package staticMetodlar;

public class Driver {

	public static void main(String[] args) {
		System.out.println(Math.PI);

		Math.pow(2, 3);
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.min(6, 3));
		System.out.println(Math.max(6, 3));

		float f = 1.50f;
		System.out.println(Math.ceil(f));
		System.out.println(Math.floor(f));
		System.out.println(Math.round(f));
		System.out.println(Math.random() * 10);
	}

}
