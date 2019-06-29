package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTests extends TestBase {

	@Test
	public void testContactDeletion () {
		app.goTo().goToContactPage();

		if (! app.getContactHelper().isThereContact()) {
			app.getContactHelper().createContact(new ContactData("testMiddleName", "testLastName", "testNickname", "mr", "testCompany", "testCity, st. testStreet, 11", "11111111111", "22222222222", "22222222222", "33333333333", "testmail@mail.test", "testFirstName", "testmai2@mail.test", "testmail3@mail.test", "www.somewebpage.test", "7", "August", "1988", "11", "December", "2011", "test 1","testCity2, st. testStreet, 111", "internet virtual home", "some notes, some comments here"), true);
			app.goTo().goToContactPage();
		}

		List<ContactData> before = app.getContactHelper().getContactList();

		app.getContactHelper().selectContact(before.size() - 1);
		app.getContactHelper().deleteSelectedContact();
		app.getContactHelper().submitContactDeletion();
		app.goTo().goToContactPage();

		List<ContactData> after = app.getContactHelper().getContactList();

		Assert.assertEquals(after.size(), before.size() - 1);

		before.remove(before.size() - 1);

		Assert.assertEquals(after, before);
	}
}
