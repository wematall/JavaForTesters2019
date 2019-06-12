package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

	@Test
	public void testContactModification () {
		app.getNavigationHelper().goToContactPage();
		app.getContactHelper().selectContact();
		app.getContactHelper().initContactModification();
		app.getContactHelper().fillContactForm(new ContactData("testNewMiddleName", "testNewLastName", "testNewNickname", "mr", "testCompany", "testCity, st. testStreet, 11", "11111111111", "22222222222", "22222222222", "33333333333", "testmail@mail.test", "testFirstName", "testmai2@mail.test", "testmail3@mail.test", "www.somewebpage.test", "7", "August", "1988", "11", "December", "2011", null,"testCity2, st. testStreet, 111", "internet virtual home", "some notes, some comments here"), false);
		app.getContactHelper().submitContactModification();
		app.getNavigationHelper().goToContactPage();
	}
}
