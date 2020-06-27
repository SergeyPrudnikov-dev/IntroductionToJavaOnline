package by.jonlinr.practice01_dop;
// вывести первые 4 степени числа пи. 

public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double pi;

		// pi1 = Math.pow(Math.PI , 1);
		// System.out.println(pi1);

		// pi2 = Math.pow(Math.PI , 2);
		// System.out.println(pi2);

		// pi3 = Math.pow(Math.PI , 3);
		// System.out.println(pi3);

		// pi4 = Math.pow(Math.PI , 4);
		// System.out.println(pi4);

		pi = 1;

		while (pi < Math.pow(Math.PI, 4)) {

			pi = pi * Math.PI;

			System.out.println(" pi в степени " + pi);
		}

	}

}
