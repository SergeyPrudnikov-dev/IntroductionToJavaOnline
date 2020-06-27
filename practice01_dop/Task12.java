package by.jonlinr.practice01_dop;

// найти расстояние "c" между (x1,y1) и (x2,y2).
public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x1, x2, y1, y2, a, b, c;

		x1 = -4;
		x2 = 3;
		y1 = -5;
		y2 = -2;

		a = Math.abs(x1 - x2);
		System.out.println("a = " + a);

		b = Math.abs(y1 - y2);
		System.out.println("b = " + b);

		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

		System.out.println("c = " + c);

	}

}
