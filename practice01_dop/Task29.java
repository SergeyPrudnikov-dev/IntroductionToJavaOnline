package by.jonlinr.practice01_dop;

// ����� � ��������, ��������, ��� ���� ������������ �� ��������� a, b, c.
public class Task29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a, b, c ,x, y, z;
		
		a = 7;
		b = 6;
		c = 4;
		
		x = Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c));
		System.out.println("x = " + x  + " ������ = " + (int) Math.toDegrees(x) + " ��������");
		
		y = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b));
		System.out.println("y = " + y + " ������ = " + (int) Math.toDegrees(y) + " ��������");
		
		z = Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * c * b));
		System.out.println("z = " + z  + " ������ = " + (int) Math.toDegrees(z) + " ��������");
	}

}
