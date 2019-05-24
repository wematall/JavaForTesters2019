package ru.stqa.pft.sandbox;

public class Point {

	double x;
	double y;


	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getdistance(double x, double y) {
		double sx = this.x - x;
		double sy = this.y - y;

		return Math.sqrt((sx*sx) + (sy*sy));
	}

	public double getdistance(Point p) {
		return getdistance(p.x, p.y);
	}



}
