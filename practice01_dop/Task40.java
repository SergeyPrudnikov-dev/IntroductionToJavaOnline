package by.jonlinr.practice01_dop;

//���� x.  �������� �������� -2x +3x^2-4x^3 �  1+2x+3x^2+4x^3. ������������ �� �������� ���������.
public class Task40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x, y, y1;
		x = 5;

		y = x * (-2 + x * (3 - 4 * x));
		y1 = 1 + x * (2 + x * (3 + 4 * x));

		System.out.println("y = " + y + " y1 = " + y1);

	}

}
