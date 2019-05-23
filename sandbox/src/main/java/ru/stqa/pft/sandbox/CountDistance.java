package ru.stqa.pft.sandbox;

public class CountDistance {

	public static void main(String[] args) {

		Point d1 = new Point(2, 4, 3, 6);
		Point d2 = new Point(-2, 4, -3, 6);
		Point d3 = new Point(0, 0, 0, 0);

		System.out.println(d1.distance());
		System.out.println(d2.distance());
		System.out.println(d3.distance());

	}

}
