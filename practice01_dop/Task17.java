package by.jonlinr.practice01_dop;
// �����: x � y. ����� ������� �������������� ����� ���� ����� � ������� �������������� ������� ���� �����.
public class Task17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x, y, sa, sg;
		x = -5;
		y = 9;
		
		sa = (Math.pow (x,3) + Math.pow(y,3)) / 2;
		System.out.println("C������ �������������� = " + sa);
		
		sg = Math.sqrt((Math.abs(x) * Math.abs(y)));
		System.out.println("C������ �������������� = " + sg);

	}

}
