package by.jonlinr.practice01_dop;
//x=(b + корень( b

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, b, c, x; // temp

		a = -2;
		b = 0.3;
		c = -1.3;

		// temp = Math.pow(b,2) + 4*a*c;
		// temp = Math.sqrt(temp);
		// temp = (temp + b) / (2*a) ;
		// x = temp - Math.pow(a,3)*c + Math.pow(b, -2) ;

		x = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

		System.out.println(x);
	}

}
