package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

	FirefoxDriver wd;

	public ContactHelper contactHelper;
	private GroupHelper groupHelper;
	private NavigationHelper navigationHelper;
	private SessionHelper sessionHelper;

	public void init() {
		wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wd.get("http://192.168.63.138/addressbook/group.php");

		contactHelper = new ContactHelper(wd);
		groupHelper = new GroupHelper(wd);
		navigationHelper = new NavigationHelper(wd);
		sessionHelper = new SessionHelper(wd);

		sessionHelper.login("admin", "secret");
	}


	public void stop() {
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


	public GroupHelper getGroupHelper() {
		return groupHelper;
	}


	public ContactHelper getContactHelper() {
		return contactHelper;
	}

	public NavigationHelper getNavigationHelper() {
		return navigationHelper;
	}

	public SessionHelper getSessionHelper() {
		return sessionHelper;
	}


}
