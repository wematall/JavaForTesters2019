package ru.stqa.pft.addressbook.model;

//В этом классе описываются поля
//которые передаются в метод
//для заполнения полей формы группы в качестве параметров

import java.util.Objects;

public class GroupData {
	private int id = Integer.MAX_VALUE;
	private String groupName;
	private String groupHeader;
	private String groupFooter;

	@Override
	public String toString() {
		return "GroupData{" +
						"id=" + id +
						", groupName='" + groupName + '\'' +
						", groupHeader='" + groupHeader + '\'' +
						", groupFooter='" + groupFooter + '\'' +
						'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		GroupData groupData = (GroupData) o;
		return Objects.equals(groupName, groupData.groupName) &&
						Objects.equals(groupHeader, groupData.groupHeader) &&
						Objects.equals(groupFooter, groupData.groupFooter);
	}

	@Override
	public int hashCode() {
		return Objects.hash(groupName, groupHeader, groupFooter);
	}


	public int getId() {
		return id;
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



	public GroupData withGroupName(String groupName) {
		this.groupName = groupName;
		return this;
	}

	public GroupData withGroupHeader(String groupHeader) {
		this.groupHeader = groupHeader;
		return this;
	}

	public GroupData withGroupFooter(String groupFooter) {
		this.groupFooter = groupFooter;
		return this;
	}

	public GroupData withId(int id) {
		this.id = id;
		return this;
	}

}
