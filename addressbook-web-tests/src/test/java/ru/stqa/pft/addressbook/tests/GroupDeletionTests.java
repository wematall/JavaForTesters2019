package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;
import java.util.List;


public class GroupDeletionTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    app.getNavigationHelper().gotoGroupPage();
    if (! app.getGroupHelper().isThereGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test 2", null, null));
      app.getNavigationHelper().gotoGroupPage();
    }
  }

  @Test
  public void testGroupDeletion() throws Exception {

    List<GroupData> before = app.getGroupHelper().getGroupList();
    int index = before.size() - 1;
    app.getGroupHelper().selectGroup(index);
    app.getGroupHelper().deleteSelectedGroup();
    app.getNavigationHelper().gotoGroupPage();

    List<GroupData> after = app.getGroupHelper().getGroupList();

    Assert.assertEquals(after.size(), before.size() - 1);

    before.remove(index);
    Assert.assertEquals(after, before);
  }

}
