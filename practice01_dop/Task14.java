package by.jonlinr.practice01_dop;

// l,s -? круг радиусом r
public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double r, l, s;

		r = 5;

		l = 2 * 3.14 * r;
		System.out.println("l = " + l);

		s = 3.14 * Math.pow(r, 2) / 2;
		System.out.println("s = " + s);
	}

}
