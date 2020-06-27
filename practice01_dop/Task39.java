package by.jonlinr.practice01_dop;

// x - действительное число. Пользуясь только умножением, сложением и вычитанием,
// вычислить за минимальное число оппераций 2x^4 - 3x^3 + 4x^2 - 5x + 6
public class Task39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x, y;
		x = 4;
		// преобразуем выражение в след вид

		y = x * (x * (x * (2 * x - 3) + 4) - 5) + 6;
		System.out.println(y);
	}

}
