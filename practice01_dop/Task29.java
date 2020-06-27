package by.jonlinr.practice01_dop;

// Найти в радианах, градусах, все углы треугольника со сторонами a, b, c.
public class Task29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a, b, c ,x, y, z;
		
		a = 7;
		b = 6;
		c = 4;
		
		x = Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c));
		System.out.println("x = " + x  + " радиан = " + (int) Math.toDegrees(x) + " градусов");
		
		y = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b));
		System.out.println("y = " + y + " радиан = " + (int) Math.toDegrees(y) + " градусов");
		
		z = Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * c * b));
		System.out.println("z = " + z  + " радиан = " + (int) Math.toDegrees(z) + " градусов");
	}

}
