package by.jonlinr.practice01_dop;

// ѕуть L -?, скорость в сто€чей воде v, скорость течени€ реки v1, врем€ движени€ по озеру t1
// против течени€ реки t2.
public class Task31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double v, v1, t1, t2, l;

		v = 19;
		v1 = 7;
		t1 = 0.5;
		t2 = 1;

		l = v * t1 + (v - v1) * t2;
		System.out.println("l = " + l + " км");
	}

}
