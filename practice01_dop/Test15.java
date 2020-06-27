package by.jonlinr.practice01_dop;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] wordListOne = { "ћечтать", "—тавить цели", "ƒостигать цели" };
		String[] wordListTwo = { "учитьс€", "заниматьс€ любимым програмированием", "быть Senior Developer" };
		String[] wordListThree = { " - это круто!", " - это почетно!", " - это то, чего ты всегда хотел!" };

		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);

		String phrase = wordListOne[rand1] + " и " + wordListTwo[rand2] + "" + wordListThree[rand3];

		System.out.println(phrase);
	}

}
