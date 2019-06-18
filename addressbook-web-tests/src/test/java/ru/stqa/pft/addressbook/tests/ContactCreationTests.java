package ru.stqa.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.HashSet;
import java.util.List;


public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() throws Exception {
    app.getNavigationHelper().goToContactPage();

    List<ContactData> before = app.getContactHelper().getContactList();

    app.contactHelper.initContactCreation();
    ContactData contact = new ContactData("testMiddleName", "testLastName", "testNickname", "mr", "testCompany", "testCity, st. testStreet, 11", "11111111111", "22222222222", "22222222222", "33333333333", "testmail@mail.test", "testFirstName", "testmai2@mail.test", "testmail3@mail.test", "www.somewebpage.test", "7", "August", "1988", "11", "December", "2011", "test 1","testCity2, st. testStreet, 111", "internet virtual home", "some notes, some comments here");
    app.contactHelper.fillContactForm(contact, true);
    app.contactHelper.submitContactForm();

    app.getNavigationHelper().goToContactPage();

    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() + 1);


    int max = after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId();
    contact.setId(max);
    before.add(contact);
    Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));

    //app.getSessionHelper().logout();

  }

}
