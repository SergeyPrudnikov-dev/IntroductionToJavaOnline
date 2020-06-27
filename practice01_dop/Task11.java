package by.jonlinr.practice01_dop;

// катеты a и b. P, S треугольника -?
public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a, b, c, s, p;
		
		a = 4;
		b = 7;
		c = Math.sqrt( Math.pow(a, 2) + Math.pow(b, 2));
		
		p = a + b + c;
		
		s = a * b / 2;
		
		System.out.println("p = " + p);
		System.out.println ("s = " + s);
		
	}

}
