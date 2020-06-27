package by.jonlinr.practice01_dop;

// S треугольника -? стороны a и b, угол между ними y.
public class Task26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, b, y, s;

		a = 9;
		b = 6;
		y = Math.PI / 6;

		s = a * b * Math.sin(y) / 2;
		System.out.println(s);
	}

}
