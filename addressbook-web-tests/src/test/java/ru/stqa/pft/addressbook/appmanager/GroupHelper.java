package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupData;

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

	public void selectGroup(int index) {
		wd.findElements(By.name("selected[]")).get(index).click();
	}

	public void initGroupModification() {
		click(By.name("edit"));
	}

	public void submitGroupModification() {
		click(By.name("update"));
	}

	public void createGroup(GroupData group) {
		initGroupCreation();
		fillGroupForm(group);
		submitGroupCreation();
		//app.getNavigationHelper().gotoGroupPage();
	}

	public boolean isThereGroup() {
		return isElementPresent(By.name("selected[]"));
	}

	public int getGroupCount() {

		return wd.findElements(By.name("selected[]")).size();

	}
}
