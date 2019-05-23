package ru.stqa.pft.sandbox;

public class Point {

	double x1;
	double x2;
	double y1;
	double y2;

	public Point(double x1, double y1) {
		this.x1 = x1;
		this.y1 = y1;
	}

	public Point(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	public double distance() {
		double a = x1 - x2;
		double b = y1 - y2;
		double result = Math.sqrt((a*a) + (b*b));

		return result;
	}


}
