package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTests extends TestBase {

	@Test
	public void testContactDeletion () {
		app.goTo().contactPage();

		if (app.contact().list().size() == 0) {
			app.contact().create(new ContactData().withFirstName("Ivan").withLastName("Fedorof"), true);
			app.goTo().contactPage();
		}

		List<ContactData> before = app.contact().list();
		int index = before.size() - 1;
		app.contact().delete(index);
		app.goTo().contactPage();

		List<ContactData> after = app.contact().list();

		Assert.assertEquals(after.size(), before.size() - 1);

		before.remove(index);

		Assert.assertEquals(after, before);
	}

}
