package ru.stqa.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;


public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() throws Exception {
    app.getNavigationHelper().goToContactPage();

    List<ContactData> before = app.getContactHelper().getContactList();

    app.contactHelper.initContactCreation();
    ContactData contact = new ContactData("lastname", "firstname");
    app.contactHelper.fillContactForm(contact, true);
    app.contactHelper.submitContactForm();

    app.getNavigationHelper().goToContactPage();

    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() + 1);

    before.add(contact);
    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);

    //app.getSessionHelper().logout();

  }

}
