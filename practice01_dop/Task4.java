package by.jonlinr.practice01_dop;

//z = ((a - 3)*b/2) + c
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c; // z
		a = 1;
		b = 2;
		c = 3;
		// z = ((a - 3)*b/2) + c;

		double temp;
		temp = a - 3;
		temp = temp * b;
		temp = temp / 2;
		temp = temp + c;

		System.out.println("z = " + temp);
	}

}
