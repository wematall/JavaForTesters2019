package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

	@Test
	public void testDistance1() {
		Point p = new Point(2, 4, 3, 6);

		Assert.assertEquals(p.distance(), 2.23606797749979);
	}

	@Test
	public void testDistance2() {
		Point p = new Point(-2, 4, -3, 6);
		Assert.assertEquals(p.distance(), 2.23606797749979);
	}

	@Test
	public void testDistance3() {
		Point p = new Point(0, 0, 0, 0);
		Assert.assertEquals(p.distance(), 0.0);
	}


}
