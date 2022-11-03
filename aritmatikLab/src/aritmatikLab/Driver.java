package aritmatikLab;

public class Driver {

	public static void main(String[] args) {
		/*int x = 10;
		float y = 20f;

		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(5 % 2);
		
		System.out.println("----");
		
		int a = 10;
//		a = a + 2;
		a += 2;
		System.out.println(a);

		System.out.println("----");
		
		int q = 12;
		System.out.println(q++);
		System.out.println(q);

		System.out.println("----");
		
		int p = 12;
		System.out.println(++p);
		System.out.println(p);*/
		
		int i = 10; // 00000000 00000000 00000000 00001010
		int x = 4; // 00000000 00000000 00000000 00000100
		
		System.out.println(~i); // 11111111 11111111 11111111 11110101
		
		System.out.println(i & x); // 00000000 00000000 00000000 00000000 
							      // 0 & 0 --> 0
							      // 0 & 1 --> 0
							      // 1 & 0 --> 0
							      // 1 & 1 --> 1
		
		System.out.println(i | x); // 00000000 00000000 00000000 00001110 
							      // 0 | 0 --> 0
							      // 0 | 1 --> 1
							      // 1 | 0 --> 1
							      // 1 | 1 --> 1
		
		System.out.println(x >> 1); // 00000000 00000000 00000000 00000010
		
		System.out.println(x << 1); // 0000000 00000000 00000000 000000100
		
	}

}
