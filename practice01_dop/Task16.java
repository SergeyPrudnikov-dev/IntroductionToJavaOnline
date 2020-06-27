package by.jonlinr.practice01_dop;

// Найти произведение цифр четырехзначного числа.
public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, pr;
		x = 1234;

		pr = x % 10 * (x / 10 % 10) * (x / 100 % 10) * (x / 1000 % 10);
		System.out.println(pr);

	}

}
