package kosulOperatoruLab;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		int x = 30;
		int y = 20;
//		if (x > y) {
//			System.out.println("x y'den büyüktür.");
//		} else {
//			System.out.println("x y'den küçüktür.");
//		}
//		
		// System.out.println(x > y ? "x y'den büyüktür." : "x y'den küçüktür.");

		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		System.out.println(x > i ? "x i den buyuktur" : "x kucuktur i");
	}

}
