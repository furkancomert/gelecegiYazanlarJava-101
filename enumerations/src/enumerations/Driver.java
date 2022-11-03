package enumerations;

import java.time.DayOfWeek;
import java.time.Month;

public class Driver {

	public static void main(String[] args) {
		Aylar ay = Aylar.OCAK;
		System.out.println(ay);

		ay = Aylar.EKIM;
		System.out.println(ay);

		System.out.println("------------");

		Aylar[] values = Aylar.values();
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

		System.out.println("------------");

		Aylar valueOf = Aylar.valueOf("SUBAT");
		System.out.println(valueOf);

		System.out.println("------------");

		DayOfWeek sunday = DayOfWeek.SUNDAY;
		System.out.println(sunday);

		DayOfWeek of = DayOfWeek.of(3);
		System.out.println(of);

		Month february = Month.FEBRUARY;
		System.out.println(february);

	}

}
