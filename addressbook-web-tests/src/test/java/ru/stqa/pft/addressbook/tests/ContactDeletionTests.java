package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {

	@Test
	public void testContactDeletion () {
		app.getNavigationHelper().goToContactPage();

		int before = app.getContactHelper().getContactCount();

		if (! app.getContactHelper().isThereContact()) {
			app.getContactHelper().createContact(new ContactData("testMiddleName", "testLastName", "testNickname", "mr", "testCompany", "testCity, st. testStreet, 11", "11111111111", "22222222222", "22222222222", "33333333333", "testmail@mail.test", "testFirstName", "testmai2@mail.test", "testmail3@mail.test", "www.somewebpage.test", "7", "August", "1988", "11", "December", "2011", "test 1","testCity2, st. testStreet, 111", "internet virtual home", "some notes, some comments here"), true);
			app.getNavigationHelper().goToContactPage();
		}
		app.getContactHelper().selectContact(before - 1);
		app.getContactHelper().deleteSelectedContact();
		app.getContactHelper().submitContactDeletion();
		app.getNavigationHelper().goToContactPage();

		int after = app.getContactHelper().getContactCount();

		Assert.assertEquals(after, before - 1);
	}
}
