package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;



public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    int before = app.getGroupHelper().getGroupCount();

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("test 1", null, null));
    app.getNavigationHelper().gotoGroupPage();

    int after = app.getGroupHelper().getGroupCount();

    Assert.assertEquals(after, before + 1);
  }

}
