package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;
import java.util.Set;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {

    app.goTo().groupPage();

    Set<GroupData> before = app.getGroupHelper().all();

    GroupData group = new GroupData().withGroupName("test 1");

    app.getGroupHelper().createGroup(group);
    app.goTo().groupPage();

    Set<GroupData> after = app.getGroupHelper().all();

    Assert.assertEquals(after.size(), before.size() + 1);

    group.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt());
    before.add(group);
    Assert.assertEquals(before, after);
  }

}
