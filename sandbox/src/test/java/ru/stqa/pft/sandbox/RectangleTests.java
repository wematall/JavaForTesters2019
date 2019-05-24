package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTests {

	@Test
	public void testRectangle() {
		Rectangle r = new Rectangle(3, 5);

		Assert.assertEquals(r.area(), 15.0);
	}
}
