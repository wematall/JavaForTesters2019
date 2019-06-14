package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupDeletionTests extends TestBase {


  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().gotoGroupPage();

    int before = app.getGroupHelper().getGroupCount();

    if (! app.getGroupHelper().isThereGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test 1", null, null));
      app.getNavigationHelper().gotoGroupPage();
    }

    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroup();
    app.getNavigationHelper().gotoGroupPage();

    int after = app.getGroupHelper().getGroupCount();

    Assert.assertEquals(after, before - 1);
  }

}
