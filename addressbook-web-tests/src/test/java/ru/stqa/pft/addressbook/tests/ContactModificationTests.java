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
			app.contact().create(new ContactData().withFirstName("Ivan").withLastName("Fedorof"), true);
			app.goTo().contactPage();
		}

		List<ContactData> before = app.contact().list();

		ContactData contact = new ContactData()
						.withId(before.get(before.size() - 1).getId())
						.withLastName("Fedorof").withFirstName("Ivan");

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
