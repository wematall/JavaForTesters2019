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
		if (! app.getGroupHelper().isThereGroup()) {
			app.getGroupHelper().createGroup(new GroupData().withGroupName(" test 1")
							.withGroupHeader(" test header").withGroupFooter("test footer"));
			app.goTo().groupPage();
		}
	}


	@Test
	public void testGroupModification () {

		Set<GroupData> before = app.getGroupHelper().all();
		GroupData modifiedGroup = before.iterator().next();
		GroupData group = new GroupData()
						.withId(modifiedGroup.getId()).withGroupName("changedGroupName");


		app.getGroupHelper().modifyGroup(group);
		Set<GroupData> after = app.getGroupHelper().all();
		Assert.assertEquals(after.size(), before.size());

		before.remove(modifiedGroup);
		before.add(modifiedGroup);

		Assert.assertEquals(before, after);
	}

}
