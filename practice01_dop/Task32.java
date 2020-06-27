package by.jonlinr.practice01_dop;

// „асы m ч, n мин, k сек.  акое врем€ будут показывать часы через p ч и q мин и r с?
public class Task32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m, m1, m2, n, n1, n2, k, k1, k2, p, q, r;

		m1 = 19;
		n1 = 57;
		k1 = 12;

		p = 21;
		q = 58;
		r = 40;

		k = k1 + r;

		if (k <= 59) {
			k2 = k;
			System.out.println(k2 + " с");
		}

		else {
			k2 = k % 60;
			System.out.println(k2 + " с");
		}

		n = n1 + q + (k / 60);
		;

		if (n <= 59) {
			n2 = n;
			System.out.println(n2 + " мин");
		}

		else {
			n2 = n % 60;
			System.out.println(n2 + " мин");
		}

		m = m1 + p + (n / 60);

		if (m <= 23) {
			m2 = m;
			System.out.println(m2 + " ч");
		}

		else {
			m2 = m % 24;
			System.out.println(m2 + " ч");
		}

	}

}
