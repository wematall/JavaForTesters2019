package ru.stqa.pft.addressbook;

//В этом классе описываются поля
//которые передаются в метод
//для заполнения полей формы группы в качестве параметров

public class GroupData {
	private final String groupName;
	private final String groupHeader;
	private final String groupFooter;

	public GroupData(String groupName, String groupHeader, String groupFooter) {
		this.groupName = groupName;
		this.groupHeader = groupHeader;
		this.groupFooter = groupFooter;
	}

	public String getGroupName() {
		return groupName;
	}

	public String getGroupHeader() {
		return groupHeader;
	}

	public String getGroupFooter() {
		return groupFooter;
	}
}
