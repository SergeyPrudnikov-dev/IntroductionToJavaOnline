package by.jonlinr.practice01_dop;

// ��� ������ �������� ��������� �������� ���������, ������� �������� true, ���� ����� � ������������ (x,y)
// ����������� ����������� ������� , � false - � ��������� ������.
public class Task38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x, y;

		x = 2;
		y = -4;

		// a). Y = 4 - (������) X
		if (y == 4 - Math.abs(x) && x >= -4 && x <= 4 && y >= 0 && y <= 4) {
			System.out.println("����� � ������������ (x,y) ����������� ����������� ������� a) " + true);
		} else {
			System.out.println("����� � ������������ (x,y) ����������� ����������� ������� a) " + false);
		}

		// b)
		if (y >= 0 && y <= 4 && x <= 2 && x >= -2 || y >= -3 && y <= 0 && x <= 4 && x >= -4) {
			System.out.println("����� � ������������ (x,y) ����������� ����������� ������� b) " + true);
		} else {
			System.out.println("����� � ������������ (x,y) ����������� ����������� ������� b) " + false);
		}

		// c) x2+y2=r2
		if (Math.pow(x, 2) + Math.pow(y, 2) <= 16 && 0 <= x && x <= 4 && 0 <= y && y <= 4
				|| Math.pow(x, 2) + Math.pow(y, 2) <= 25 && 0 <= x && x <= 5 && -5 <= y && y <= 0) {
			System.out.println("����� � ������������ (x,y) ����������� ����������� ������� c) " + true);
		} else {
			System.out.println("����� � ������������ (x,y) ����������� ����������� ������� c) " + false);
		}
	}

}
