package by.jonlinr.practice01_dop;
 
//Натуральные числа M и N. Вывести старшую цифру дробной части и младшую цифру целой части M/N.

public class Task35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double l, m, n;
		m = 9740;
		n = 99;
			
		l = m / n;
		
		//System.out.println(l);
		
		System.out.println("Cтаршая цифра дробной части " + (int) (l * 10 % 10) );
		
		System.out.println("Младшая цифра целой части " + (int) l % 10 );

		
	    }
	}


