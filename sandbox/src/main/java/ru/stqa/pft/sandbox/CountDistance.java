package ru.stqa.pft.sandbox;

public class CountDistance {

	public static void main(String[] args) {

		Point p1 = new Point(2, 4);
		Point p2 = new Point(3, 6);
		Point p3 = new Point(-2, 4);
		Point p4 = new Point(-3, 6);
		Point p5 = new Point(0, 0);
		Point p6 = new Point(0, 0);

		System.out.println(p1.getdistance(p2));
		System.out.println(p3.getdistance(p4));
		System.out.println(p5.getdistance(p6));

	}

}
