package ru.stqa.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() throws Exception {
    app.getNavigationHelper().goToContactPage();

    int before = app.getContactHelper().getContactCount();

    app.contactHelper.initContactCreation();
    app.contactHelper.fillContactForm(new ContactData("testMiddleName", "testLastName", "testNickname", "mr", "testCompany", "testCity, st. testStreet, 11", "11111111111", "22222222222", "22222222222", "33333333333", "testmail@mail.test", "testFirstName", "testmai2@mail.test", "testmail3@mail.test", "www.somewebpage.test", "7", "August", "1988", "11", "December", "2011", "test 1","testCity2, st. testStreet, 111", "internet virtual home", "some notes, some comments here"), true);
    app.contactHelper.submitContactForm();

    app.getNavigationHelper().goToContactPage();

    int after = app.getContactHelper().getContactCount();

    Assert.assertEquals(after, before + 1);

    //app.getSessionHelper().logout();

  }

}
