package by.jonlinr.practice01_dop;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x1, x2, x3, y1, y2, y3, p, p2, s, s2;
		double  a, a1, a2, b, b1, b2, c, c1, c2;
		
		x1 = -4;
		x2 = 3;
		x3 = -6;
		y1 = -5;
		y2 = -2;
		y3 = 12;
		
		a1 = Math.abs(x1 -x2);				
		a2 = Math.abs(y1 -y2);
		a = Math.sqrt( Math.pow(a1, 2) + Math.pow(a2, 2));
		
		System.out.println ("a = " + a);
		
		b1 = Math.abs(x1 -x3);				
		b2 = Math.abs(y1 -y3);
		b = Math.sqrt( Math.pow(b1, 2) + Math.pow(b2, 2));
		
		System.out.println ("b = " + b);
		
		c1 = Math.abs(x2 -x3);				
		c2 = Math.abs(y2 -y3);
		c = Math.sqrt( Math.pow(c1, 2) + Math.pow(c2, 2));
		
		System.out.println ("c = " + c);
		
		p = a + b + c;
		System.out.println ("p = " + p);
		
		p2 = p/2;
		
		s2 = p2*(p2-a)*(p2-b)*(p2-c);
		
		s = Math.sqrt(s2);
		System.out.println("s = " + s);
	}

}
