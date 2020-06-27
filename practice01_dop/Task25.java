package by.jonlinr.practice01_dop;

// Ќайти корни квадратного уравнени€ ax(2)+bx +c =0 (a != 0; дискриминант уравнени€ неотрицателен).
public class Task25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x1, x2, a, b, c, d;

		a = - 4;
		b = 5;
		c = 7;

		d = Math.pow(b, 2) - 4 * a * c;
		System.out.println("d = " + d); 
		if (d > 0) {

			x1 = (-b + Math.sqrt(d)) / (2 * a);
			System.out.println(x1);

			x2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println(x2);
		}

		else if (d == 0) {

			x1 = (-b + Math.sqrt(d)) / (2 * a);
			System.out.println(x1);
		}

		else if (d < 0) {
		
			System.out.println(" орней нет.");
		}

	}

}
