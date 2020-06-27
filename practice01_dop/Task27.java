package by.jonlinr.practice01_dop;

// Дано значение a. не используя никаких функций и никаких оппераций, кроме умножения, 
//получить значение a(8) за 3 опперации и a(10) за 4 опперации.
public class Task27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, a2, a4, a8, a10;
		a = 3;

		a2 = a * a;
		a4 = a2 * a2;

		a8 = a4 * a4;
		System.out.println("a8 = " + a8);

		a10 = a8 * a2;
		System.out.println("a10 = " + a10);

	}

}
