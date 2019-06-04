package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
	private WebDriver wd;

	protected void init() {
		wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		wd.get("http://192.168.63.138/addressbook/group.php");
		login("admin", "secret");
	}

	private void login(String username, String password) {
		wd.findElement(By.name("user")).click();
		wd.findElement(By.name("user")).clear();
		wd.findElement(By.name("user")).sendKeys(username);
		wd.findElement(By.name("pass")).click();
		wd.findElement(By.name("pass")).clear();
		wd.findElement(By.name("pass")).sendKeys(password);
		wd.findElement(By.xpath("//input[@value='Login']")).click();
	}

	protected void logout() {
		wd.findElement(By.linkText("Logout")).click();
	}

	protected void submitGroupCreation() {
		wd.findElement(By.name("submit")).click();
	}

	protected void fillGroupForm(GroupData groupData) {
		wd.findElement(By.name("group_name")).click();
		wd.findElement(By.name("group_name")).clear();
		wd.findElement(By.name("group_name")).sendKeys(groupData.getGroupName());
		wd.findElement(By.name("group_header")).click();
		wd.findElement(By.name("group_header")).clear();
		wd.findElement(By.name("group_header")).sendKeys(groupData.getGroupHeader());
		wd.findElement(By.name("group_footer")).click();
		wd.findElement(By.name("group_footer")).clear();
		wd.findElement(By.name("group_footer")).sendKeys(groupData.getGroupFooter());
	}

	protected void initGroupCreation() {
		wd.findElement(By.name("new")).click();
	}

	protected void gotoGroupPage() {
		wd.findElement(By.linkText("groups")).click();
	}

	protected void stop() {
		wd.quit();
	}

	private boolean isElementPresent(By by) {
		try {
			wd.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			wd.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	protected void deleteSelectedGroup() {
		wd.findElement(By.name("delete")).click();
	}

	protected void selectGroup() {
		wd.findElement(By.name("selected[]")).click();
	}


	protected void submitContactForm() {
		wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
	}


	protected void initContactCreation() {
		wd.findElement(By.linkText("add new")).click();
	}


	protected void fillContactForm(ContactData contactData) {
		wd.findElement(By.name("firstname")).click();
		wd.findElement(By.name("firstname")).clear();
		wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstName());
		wd.findElement(By.name("middlename")).click();
		wd.findElement(By.name("middlename")).clear();
		wd.findElement(By.name("middlename")).sendKeys(contactData.getMiddleName());
		wd.findElement(By.name("lastname")).click();
		wd.findElement(By.name("lastname")).clear();
		wd.findElement(By.name("lastname")).sendKeys(contactData.getLastName());
		wd.findElement(By.name("nickname")).click();
		wd.findElement(By.name("nickname")).clear();
		wd.findElement(By.name("nickname")).sendKeys(contactData.getNickName());
		wd.findElement(By.name("title")).click();
		wd.findElement(By.name("title")).clear();
		wd.findElement(By.name("title")).sendKeys(contactData.getTitle());
		wd.findElement(By.name("company")).click();
		wd.findElement(By.name("company")).clear();
		wd.findElement(By.name("company")).sendKeys(contactData.getCompanyName());
		wd.findElement(By.name("address")).click();
		wd.findElement(By.name("address")).clear();
		wd.findElement(By.name("address")).sendKeys(contactData.getAddress());
		wd.findElement(By.name("home")).click();
		wd.findElement(By.name("home")).clear();
		wd.findElement(By.name("home")).sendKeys(contactData.getPhoneHome());
		wd.findElement(By.name("mobile")).click();
		wd.findElement(By.name("mobile")).clear();
		wd.findElement(By.name("mobile")).sendKeys(contactData.getPhoneMobile());
		wd.findElement(By.name("work")).click();
		wd.findElement(By.name("work")).clear();
		wd.findElement(By.name("work")).sendKeys(contactData.getPhoneWork());
		wd.findElement(By.name("fax")).click();
		wd.findElement(By.name("fax")).clear();
		wd.findElement(By.name("fax")).sendKeys(contactData.getFax());
		wd.findElement(By.name("email")).click();
		wd.findElement(By.name("email")).clear();
		wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
		wd.findElement(By.name("email2")).click();
		wd.findElement(By.name("email2")).clear();
		wd.findElement(By.name("email2")).sendKeys(contactData.getEmail2());
		wd.findElement(By.name("email3")).click();
		wd.findElement(By.name("email3")).clear();
		wd.findElement(By.name("email3")).sendKeys(contactData.getEmail3());
		wd.findElement(By.name("homepage")).click();
		wd.findElement(By.name("homepage")).clear();
		wd.findElement(By.name("homepage")).sendKeys(contactData.getWebPage());
		new Select(wd.findElement(By.name("bday"))).selectByVisibleText(contactData.getBirthDay());
		wd.findElement(By.name("bday")).click();
		new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(contactData.getBirthMonth());
		wd.findElement(By.name("bmonth")).click();
		wd.findElement(By.name("byear")).click();
		wd.findElement(By.name("byear")).clear();
		wd.findElement(By.name("byear")).sendKeys(contactData.getBirthYear());
		new Select(wd.findElement(By.name("aday"))).selectByVisibleText(contactData.getAnnyversaryDay());
		wd.findElement(By.name("aday")).click();
		new Select(wd.findElement(By.name("amonth"))).selectByVisibleText(contactData.getAnnyversaryMonth());
		wd.findElement(By.name("amonth")).click();
		wd.findElement(By.name("ayear")).click();
		wd.findElement(By.name("ayear")).clear();
		wd.findElement(By.name("ayear")).sendKeys(contactData.getAnnyversaryYear());
		wd.findElement(By.name("address2")).click();
		wd.findElement(By.name("address2")).clear();
		wd.findElement(By.name("address2")).sendKeys(contactData.getAddress2());
		wd.findElement(By.name("phone2")).click();
		wd.findElement(By.name("phone2")).clear();
		wd.findElement(By.name("phone2")).sendKeys(contactData.getPhoneHome2());
		wd.findElement(By.name("notes")).click();
		wd.findElement(By.name("notes")).clear();
		wd.findElement(By.name("notes")).sendKeys(contactData.getNotes());
	}
}
