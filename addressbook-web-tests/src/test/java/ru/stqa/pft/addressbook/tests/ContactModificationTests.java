package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactModificationTests extends TestBase {

	@Test
	public void testContactModification () {
		app.goTo().contactPage();

		if (app.contact().list().size() == 0) {
			app.contact().create(new ContactData("testMiddleName", "testLastName", "testNickname", "mr", "testCompany", "testCity, st. testStreet, 11", "11111111111", "22222222222", "22222222222", "33333333333", "testmail@mail.test", "testFirstName", "testmai2@mail.test", "testmail3@mail.test", "www.somewebpage.test", "7", "August", "1988", "11", "December", "2011", "test 1","testCity2, st. testStreet, 111", "internet virtual home", "some notes, some comments here"), true);
			app.goTo().contactPage();
		}

		List<ContactData> before = app.contact().list();

		ContactData contact = new ContactData(before.get(before.size() - 1).getId(), "changedlastname", "changedfirstname");

		app.contact().modify(before.size() - 1);



		app.contact().fillContactForm(contact, false);
		app.contact().submitContactModification();
		app.goTo().contactPage();

		List<ContactData> after = app.contact().list();

		Assert.assertEquals(after.size(), before.size());

		 before.remove(before.size() - 1);
		 before.add(contact);

		Comparator<? super ContactData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
		before.sort(byId);
		after.sort(byId);
		Assert.assertEquals(before, after);
	}
}
