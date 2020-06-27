package by.jonlinr.practice01_dop;
// равносторонний треугольник, есть сторона a, найти s, h, r1  вписанной и r2 описанной окружности- ?
public class Task19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, s, h, r1, r2;
		
		a = 5;
		
		h = a * Math.sqrt(3) / 2;
		System.out.println("h = " + h);
		
		r1 = a * Math.sqrt(3) / 6;
		System.out.println("r1 = " + r1);
		
		r2 = 2 * r1;
		System.out.println("r2 = " + r2);
		
		s = Math.pow(a,2) * Math.sqrt(3) / 4;
		System.out.println("s = " + s);
		
		
	}

}
