package by.jonlinr.practice01_dop;
// Дано: длина окружности. Найти площадь круга описанного окружностью.

public class Task20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double s, l, r;

		l = 200;

		r = l / (2 * Math.PI);

		s = Math.PI * Math.pow(r, 2) / 2;

		System.out.print(s);
	}

}
