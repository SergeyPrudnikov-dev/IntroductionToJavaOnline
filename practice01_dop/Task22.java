package by.jonlinr.practice01_dop;

// ����������� ����� T - ������������ ���������� ������� � ��������.
// ������� �������� � ���� �����: ��� ����� SS�

public class Task22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t, h, m, s;

		t = 10001;

		s = t % 60;
		m = t / 60 % 60;
		h = t / 3600;

		System.out.print(h + "� " + m + "��� " + s + "�");

	}

}
