package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase{

	public ContactHelper (WebDriver wd) {
		super(wd);
	}


	public void submitContactForm() {
		click(By.xpath("(//input[@name='submit'])[2]"));
	}

	public void initContactCreation() {
		click(By.linkText("add new"));
	}

	public void fillContactForm(ContactData contactData, boolean creation) {
		type(By.name("firstname"), contactData.getFirstName());
	//	type(By.name("middlename"), contactData.getMiddleName());
		type(By.name("lastname"), contactData.getLastName());
	//	type(By.name("nickname"), contactData.getNickName());
		//type(By.name("title"), contactData.getTitle());
		//type(By.name("company"), contactData.getCompanyName());
		//type(By.name("address"), contactData.getAddress());
		//type(By.name("home"), contactData.getPhoneHome());
		//type(By.name("mobile"), contactData.getPhoneMobile());
		//type(By.name("work"), contactData.getPhoneWork());
		//type(By.name("fax"), contactData.getFax());
		//type(By.name("email"), contactData.getEmail());
		//type(By.name("email2"), contactData.getEmail2());
		//type(By.name("email3"), contactData.getEmail3());
		//type(By.name("homepage"), contactData.getWebPage());

		//пока не знаю что с этим делать
		//по идее нужно создание этих объектов
		//перенести в другое место
		//new Select(wd.findElement(By.name("bday"))).selectByVisibleText(contactData.getBirthDay());
		//wd.findElement(By.name("bday")).click();

	//	new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(contactData.getBirthMonth());
	//	wd.findElement(By.name("bmonth")).click();

		//type(By.name("byear"), contactData.getBirthYear());

	//	new Select(wd.findElement(By.name("aday"))).selectByVisibleText(contactData.getAnnyversaryDay());
		//wd.findElement(By.name("aday")).click();

		//new Select(wd.findElement(By.name("amonth"))).selectByVisibleText(contactData.getAnnyversaryMonth());
		//wd.findElement(By.name("amonth")).click();


		//type(By.name("ayear"), contactData.getAnnyversaryYear());


	//	if (creation) {
	//		new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
	//	}
	//	else {
	//		Assert.assertFalse(isElementPresent(By.name("new_group")));
		//}

		//type(By.name("address2"), contactData.getAddress2());
		//type(By.name("phone2"), contactData.getPhoneHome2());
		//type(By.name("notes"), contactData.getNotes());

	}

	public void selectContact(int index) {
		wd.findElements(By.name("selected[]")).get(index).click();
	}

	public void modify(int index) {
		wd.findElements(By.xpath("//img[@alt='Edit']")).get(index).click();
	}

	public void create(ContactData contact) {
		initContactCreation();
		fillContactForm(contact, true);
		submitContactForm();
	}


	public void delete(int index) {
		selectContact(index);
		deleteSelectedContact();
		submitContactDeletion();
	}

	public void submitContactModification() {
		click(By.name("update"));
	}

	public void deleteSelectedContact() {
		click(By.xpath("//input[@value='Delete']"));
	}

	public void submitContactDeletion() {
		wd.switchTo().alert().accept();
	}

	public void create(ContactData contact, boolean creation) {
		initContactCreation();
		fillContactForm(contact, creation);
		submitContactForm();
	}


	public boolean isThereContact() {
		return isElementPresent(By.name("selected[]"));
	}

	public int getContactCount() {
		return wd.findElements(By.name("selected[]")).size();
	}

	public List<ContactData> list () {
		List<ContactData> contacts = new ArrayList<ContactData>();
		List<WebElement>  elements = wd.findElements(By.name("entry"));
		for(WebElement element : elements) {
			List<WebElement> cells = element.findElements(By.tagName("td"));


			int id              = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
			String lastname     = cells.get(1).getText();
			String firstname    = cells.get(2).getText();
			ContactData contact = new ContactData(id, lastname, firstname);
			contacts.add(contact);
		}
		return contacts;
	}
}
