package by.jonlinr.practice01_dop;

// ������� ������� �������������� �������� � ����������� a � b � ����� x ��� ������� ��������� a.
public class Task24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, a1, b, h, x, s;

		a = 9;
		b = 6;
		x = Math.PI / 3;

		a1 = (a - b) / 2;
		h = a1 * Math.tan(x);

		s = (a + b) * h / 2;
		System.out.println(s);
	}

}
