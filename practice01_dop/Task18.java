package by.jonlinr.practice01_dop;

// Ребро куба a. S грани, S куба, V куба - ?
public class Task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, s1, s, v;
		a = 7;

		s1 = Math.pow(a, 2);

		System.out.println("Площадь грани = " + s1);

		s = s1 * 6;
		System.out.println("Площадь куба = " + s);

		v = Math.pow(a, 3);

		System.out.println("Объем куба = " + v);

	}

}
