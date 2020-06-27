package by.jonlinr.practice01_dop;

// Составить программу перевода радианной меры угла в градусы, минуты и секунды.
public class Task28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double r, g, m, s;
		
		r = 0.3;
		
		g = r*180 / Math.PI;
		m = g * 60;
		s = m * 60;
		
		System.out.println("r = " + r + " g = " + g + " m = " + m + " s = " + s);
	}

}
