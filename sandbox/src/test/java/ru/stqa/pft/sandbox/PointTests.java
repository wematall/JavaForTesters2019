package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

	@Test
	public void testDistance1() {
		Point p1 = new Point(2, 4);
		Point p2 = new Point(3, 6);

		Assert.assertEquals(p1.getdistance(p2), 2.23606797749979);
	}

	@Test
	public void testDistance2() {
		Point p1 = new Point(-2, 4);
		Point p2 = new Point(-3, 6);
		Assert.assertEquals(p1.getdistance(p2), 2.23606797749979);
	}

	@Test
	public void testDistance3() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 0);
		Assert.assertEquals(p1.getdistance(p2), 0.0);
	}


}
