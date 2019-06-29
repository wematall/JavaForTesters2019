package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;
import java.util.Set;


public class GroupDeletionTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    app.goTo().groupPage();
    if (! app.getGroupHelper().isThereGroup()) {
      app.getGroupHelper().createGroup(new GroupData().withGroupName("test 1").withGroupHeader("test Header").withGroupFooter("test footer"));
      app.goTo().groupPage();
    }
  }

  @Test
  public void testGroupDeletion() throws Exception {

    Set<GroupData> before = app.getGroupHelper().all();
    GroupData deletedGroup = before.iterator().next();
    app.getGroupHelper().delete(deletedGroup);

    Set<GroupData> after = app.getGroupHelper().all();

    Assert.assertEquals(after.size(), before.size() - 1);

    before.remove(deletedGroup);
    Assert.assertEquals(after, before);
  }


}
