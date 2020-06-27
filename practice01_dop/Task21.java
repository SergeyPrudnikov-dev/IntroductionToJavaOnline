package by.jonlinr.practice01_dop;

// Число R типа nnn.kkk. Поменять местами дробную и целую части.
public class Task21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double r = 754.981;

		System.out.print(r * 1000 % 1000 + (int) r / 1000.0);
	}

}
