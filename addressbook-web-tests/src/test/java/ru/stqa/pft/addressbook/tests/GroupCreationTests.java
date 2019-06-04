package ru.stqa.pft.addressbook;

import org.testng.annotations.*;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("test 1", "test header logo", "test footer comment"));
    app.submitGroupCreation();
    app.gotoGroupPage();
    app.logout();
  }

}
