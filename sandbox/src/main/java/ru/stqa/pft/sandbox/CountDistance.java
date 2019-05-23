package ru.stqa.pft.sandbox;

public class CountDistance {

	public static void main(String[] args) {

		Point p1 = new Point(2, 1);
		Point p2 = new Point(4, 6);

		System.out.println(distance(p1, p2));

	}

	public static double distance(Point p1, Point p2) {
		double a = p1.x1 - p2.x1;
		double b = p1.y1 - p2.y1;
		double result = Math.sqrt((a * a) + (b * b));

		return result;
	}
}
