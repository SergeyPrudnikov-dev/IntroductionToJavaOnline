package by.jonlinr.practice01_dop;

// Найти частное произведений четных и нечетных цифр 4хзначного числа.
public class Task36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x, prchet, prnechet, a1, a2, a3, a4;

		x = 9347;

		a1 = (int) x % 10; // находим цифры заданного числа
		a2 = (int) x / 10 % 10;
		a3 = (int) x / 100 % 10;
		a4 = (int) x / 1000 % 10;

		// System.out.println("a1 " + a1 + " a2 " + a2 + " a3 " + a3 + " a4 " + a4);

		// prchet = a1 *a2 * a3 * a4;
		// prnechet = b1 *b2 * b3 * b4;

		if (a1 % 2 == 0) {
			prchet = a1;
			prnechet = 1;
		} else {
			prchet = 1;
			prnechet = a1;
		}

		
		if (a2 % 2 == 0) {
			prchet = prchet * a2;
			prnechet = prnechet * 1;
		} else {
			prchet = prchet * 1;
			prnechet = prnechet * a2;
		}

		if (a3 % 2 == 0) {
			prchet = prchet * a3;
			prnechet = prnechet * 1;
		} else {
			prchet = prchet * 1;
			prnechet = prnechet * a3;
		}

		if (a4 % 2 == 0) {
			prchet = prchet * a4;
			prnechet = prnechet * 1;
		} else {
			prchet = prchet * 1;
			prnechet = prnechet * a4;
		}

		System.out.println("Частное произведений четных и нечетных цифр 4-хзначного числа = " + (prchet / prnechet));

	}

}
