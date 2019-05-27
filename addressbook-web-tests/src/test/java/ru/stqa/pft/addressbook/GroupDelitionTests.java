package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

import org.openqa.selenium.*;


public class GroupDelitionTests extends TestBase {


  @Test
  public void testGroupDelition() throws Exception {
    gotoGroupPage();
    selectGroup();
    deleteSelectedGroup();
    gotoGroupPage();
  }

}
