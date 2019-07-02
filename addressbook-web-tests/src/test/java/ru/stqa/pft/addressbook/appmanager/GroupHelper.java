package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static ru.stqa.pft.addressbook.tests.TestBase.app;

public class GroupHelper extends HelperBase {

	public GroupHelper(WebDriver wd) {
		super(wd);
	}

	public void submitGroupCreation() {
		click(By.name("submit"));
	}

	public void fillGroupForm(GroupData groupData) {
		type(By.name("group_name"), groupData.getGroupName());
		type(By.name("group_header"), groupData.getGroupHeader());
		type(By.name("group_footer"), groupData.getGroupFooter());
	}

	public void initGroupCreation() {
		click(By.name("new"));
	}

	public void deleteSelectedGroup() {
		click(By.name("delete"));
	}

	public void selectGroupById(int id) {
		wd.findElement(By.cssSelector("input[value='" + id + "']")).click();
	}

	public void initGroupModification() {
		click(By.name("edit"));
	}

	public void submitGroupModification() {
		click(By.name("update"));
	}

	public void create(GroupData group) {
		initGroupCreation();
		fillGroupForm(group);
		submitGroupCreation();
		app.goTo().groupPage();
	}


	public void modify(GroupData group) {
		selectGroupById(group.getId());
		initGroupModification();
		fillGroupForm(group);
		submitGroupModification();
		app.goTo().groupPage();
	}



	public void delete(GroupData group) {
		selectGroupById(group.getId());
		deleteSelectedGroup();
		app.goTo().groupPage();
	}

	public boolean isThereGroup() {
		return isElementPresent(By.name("selected[]"));
	}

	public int getGroupCount() {

		return wd.findElements(By.name("selected[]")).size();

	}

	public List<GroupData> list () {
		List<GroupData> groups = new ArrayList<GroupData>();
		List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
		for(WebElement element : elements) {
			String name = element.getText();
			int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
			GroupData group = new GroupData().withId(id).withGroupName(name);
			groups.add(group);
		}
		return groups;
	}

	public Set<GroupData> all () {
		Set<GroupData> groups = new HashSet<GroupData>();
		List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
		for(WebElement element : elements) {
			String name = element.getText();
			int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
			GroupData group = new GroupData().withId(id).withGroupName(name);
			groups.add(group);
		}
		return groups;
	}


}
