package by.jonlinr.practice01_dop;

import java.util.Scanner;

// a байт, перевести в более крупные ед измерения информации.
public class Task34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a;

		@SuppressWarnings("resource") // говорит компилятору, что я осознаано не закрываю Scanner
		Scanner sc = new Scanner(System.in);

		@SuppressWarnings("unused")
		String str;

		System.out.print(">>");
		while (!sc.hasNextDouble()) { // sc.hasNextInt() == false
										// !true = false сокращенный вариант написания
			str = sc.nextLine();
			System.out.print(">> ");
		}

		a = sc.nextDouble(); // метод nextInt читает из потока ввода целое число
								// метод nextLine читает из потока ввода всю строку целиком

		if (a < 0) {
			System.out.println("некорректный ввод данных");
		}

		else if (a >= 0 && a < 1024) {
			System.out.println(a + " b");
		}

		else if (a >= 1024 && a < 1024000) {

			System.out.println(a / 1024 + " Kb");
		}

		else if (a >= 1024 * Math.pow(10, 3) && a < 1024 * Math.pow(10, 6)) {

			System.out.println(a / (1024 * Math.pow(10, 3)) + " Mb");
		}

		else if (a >= 1024 * Math.pow(10, 6) && a < 1024 * Math.pow(10, 9)) {

			System.out.println(a / (1024 * Math.pow(10, 6)) + " Gb");
		} else {

			System.out.println(a / (1024 * Math.pow(10, 9)) + " Tb");
		}

	}

}
