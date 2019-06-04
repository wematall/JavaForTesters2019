package ru.stqa.pft.addressbook;


import org.testng.annotations.*;


public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() throws Exception {

    app.initContactCreation();
    app.fillContactForm(new ContactData("testMiddleName", "testLastName", "testNickname", "mr", "testCompany", "testCity, st. testStreet, 11", "11111111111", "22222222222", "22222222222", "33333333333", "testmail@mail.test", "testName", "testmai2@mail.test", "testmail3@mail.test", "www.somewebpage.test", "7", "August", "1988", "11", "December", "2011", "testCity2, st. testStreet, 111", "internet virtual home", "some notes, some comments here"));
    app.submitContactForm();
    app.logout();

  }

}
