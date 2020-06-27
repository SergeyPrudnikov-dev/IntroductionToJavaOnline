package by.jonlinr.practice01_dop;
// задача про молоко n маленьких бидонов 80 л,n больших бидонов х литров. vb = vm+12, х-?

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, vb, vm, x;

		n = 1;
		vm = 80 / n;
		vb = vm + 12;
		x = vb * n;

		System.out.println(x);

	}

}
