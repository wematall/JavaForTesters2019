package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

	@Test
	public void testGroupModification () {
		app.getNavigationHelper().gotoGroupPage();

		if (! app.getGroupHelper().isThereGroup()) {
			app.getGroupHelper().createGroup(new GroupData("test 2", null, null));
			app.getNavigationHelper().gotoGroupPage();
		}

		app.getGroupHelper().selectGroup();
		app.getGroupHelper().initGroupModification();
		app.getGroupHelper().fillGroupForm(new GroupData("changedGroupName", "changedHeader", "changedFooter"));
		app.getGroupHelper().submitGroupModification();
		app.getNavigationHelper().gotoGroupPage();

	}
}
