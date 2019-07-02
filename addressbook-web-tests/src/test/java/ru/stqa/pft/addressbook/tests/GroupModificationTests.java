package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import java.util.Set;

public class GroupModificationTests extends TestBase {

	@BeforeMethod
	public void ensurePreconditions() {
		app.goTo().groupPage();
		if (app.group().list().size() == 0) {
			app.group().create(new GroupData().withGroupName(" test 1")
							.withGroupHeader(" test header").withGroupFooter("test footer"));
			app.goTo().groupPage();
		}
	}


	@Test
	public void testGroupModification () {

		Set<GroupData> before = app.group().all();
		//int index = before.size() - 1;
		GroupData modifiedGroup = before.iterator().next();
		GroupData group = new GroupData()
						.withId(modifiedGroup.getId()).withGroupName("changedGroupName");


		app.group().modify(group);
		Set<GroupData> after = app.group().all();
		Assert.assertEquals(after.size(), before.size());

		before.remove(modifiedGroup);
		before.add(modifiedGroup);

		Assert.assertEquals(before, after);
	}

}
