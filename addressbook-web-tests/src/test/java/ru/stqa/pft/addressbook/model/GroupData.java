package ru.stqa.pft.addressbook.model;

//В этом классе описываются поля
//которые передаются в метод
//для заполнения полей формы группы в качестве параметров

import java.util.Objects;

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

	@Override
	public String toString() {
		return "GroupData{" +
						"groupName='" + groupName + '\'' +
						'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		GroupData groupData = (GroupData) o;

		return Objects.equals(groupName, groupData.groupName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(groupName);
	}
}
