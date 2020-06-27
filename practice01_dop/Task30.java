package by.jonlinr.practice01_dop;

// Три сопративления R1, R2, R3 соеденены параллельно, Найти общее сопративление.
public class Task30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double r1, r2, r3, r;
		
		r1 = 4;
		r2 = 9;
		r3 = 12;
		
		r = r1 * r2 * r3 / (r1 * r2 + r1 * r3 + r2* r3);
		System.out.println("r = " + r + " Ом");
		
	}

}
