package by.jonlinr.practice01_dop;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x, x1, xr, y, y1, yr, q, q1, q2, q3, q4, z;

		x = 0.523599;
		y = 0.785398;
		x1 = 30; // 0.523 рад
		y1 = 45; // 0.785 рад

		q1 = Math.sin(x) + Math.cos(y);
		q2 = Math.cos(x) - Math.sin(y);
		q3 = Math.tan(x * y);
		q4 = q1 / q2 * q3;

		System.out.println("q4 = " + q4);

		q = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * (Math.tan(x * y));
		System.out.println(" q = " + q);

		xr = Math.toRadians(x1);
		yr = Math.toRadians(y1);
		z = (Math.sin(xr) + Math.cos(yr)) / (Math.cos(xr) - Math.sin(yr)) * (Math.tan(xr * yr));

		System.out.println(" z = " + z);

	}

}
