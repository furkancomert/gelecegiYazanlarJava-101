package operatorVeIfadeler;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		/*
		 * int x; // Expression x = 10; // Decleration // x++; // postfix // x = x + 1;
		 * System.out.println(x++); // postfix System.out.println(x);
		 * 
		 * System.out.println(--x); // prefix
		 * 
		 * System.out.println(5 % 2); // modulus
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Lütfen bir sayı giriniz: "); int a = scanner.nextInt();
		 * System.out.println(a % 2 == 0 ? "Çift sayı" : "Tek sayı"); //ternary if
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen parolanızı giriniz: ");
		String password = scanner.nextLine();
		boolean isOk = password.equals("1234");
		System.out.println(isOk ? "Tebrikler.Giriş Yaptınız" : "Hatalı Parolaé");

	}

}
