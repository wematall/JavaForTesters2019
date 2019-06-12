package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

	WebDriver wd;

	public ContactHelper contactHelper;
	private GroupHelper groupHelper;
	private NavigationHelper navigationHelper;
	private SessionHelper sessionHelper;
	private String browser;

	public ApplicationManager(String browser) {
		this.browser = browser;
	}

	public void init() {

		if (browser == BrowserType.FIREFOX) {
			wd = new FirefoxDriver();
		}
		else if (browser == BrowserType.CHROME) {
			wd = new ChromeDriver();
		}
		else if (browser == BrowserType.IE) {
			wd = new InternetExplorerDriver();
		}

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
