package by.jonlinr.practice01_dop;

//Найти площадь кольца, внутренний радиус которого равен - r, внешний - R (R>r).  
public class Task23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double R, r, s; // предполагаю, что сечение кольца круглой формы.

		R = 5;
		r = 4;

		s = Math.PI * (Math.pow(R, 2) - Math.pow(r, 2));
		System.out.println(s);

	}

}
