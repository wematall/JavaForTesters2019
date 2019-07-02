package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class ContactData {

	@Override
	public String toString() {
		return "ContactData{" +
						"id=" + id +
						", middleName='" + middleName + '\'' +
						", lastName='" + lastName + '\'' +
						", nickName='" + nickName + '\'' +
						", title='" + title + '\'' +
						", companyName='" + companyName + '\'' +
						", address='" + address + '\'' +
						", phoneHome='" + phoneHome + '\'' +
						", phoneMobile='" + phoneMobile + '\'' +
						", phoneWork='" + phoneWork + '\'' +
						", fax='" + fax + '\'' +
						", email='" + email + '\'' +
						", firstName='" + firstName + '\'' +
						", email2='" + email2 + '\'' +
						", email3='" + email3 + '\'' +
						", webPage='" + webPage + '\'' +
						", birthDay='" + birthDay + '\'' +
						", birthMonth='" + birthMonth + '\'' +
						", birthYear='" + birthYear + '\'' +
						", annyversaryDay='" + annyversaryDay + '\'' +
						", annyversaryMonth='" + annyversaryMonth + '\'' +
						", annyversaryYear='" + annyversaryYear + '\'' +
						", address2='" + address2 + '\'' +
						", phoneHome2='" + phoneHome2 + '\'' +
						", notes='" + notes + '\'' +
						", group='" + group + '\'' +
						'}';
	}

	private int id = Integer.MAX_VALUE;
	private String middleName;
	private String lastName;
	private String nickName;
	private String title;
	private String companyName;
	private String address;
	private String phoneHome;
	private String phoneMobile;
	private String phoneWork;
	private String fax;
	private String email;
	private String firstName;
	private String email2;
	private String email3;
	private String webPage;
	private String birthDay;
	private String birthMonth;
	private String birthYear;
	private String annyversaryDay;
	private String annyversaryMonth;
	private String annyversaryYear;
	private String address2;
	private String phoneHome2;
	private String notes;
	private String group;



	public ContactData withId(int id) {
		this.id = id;
		return this;
	}

	public ContactData withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhoneHome(String phoneHome) {
		this.phoneHome = phoneHome;
	}

	public void setPhoneMobile(String phoneMobile) {
		this.phoneMobile = phoneMobile;
	}

	public void setPhoneWork(String phoneWork) {
		this.phoneWork = phoneWork;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ContactData withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public void setEmail3(String email3) {
		this.email3 = email3;
	}

	public void setWebPage(String webPage) {
		this.webPage = webPage;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public void setAnnyversaryDay(String annyversaryDay) {
		this.annyversaryDay = annyversaryDay;
	}

	public void setAnnyversaryMonth(String annyversaryMonth) {
		this.annyversaryMonth = annyversaryMonth;
	}

	public void setAnnyversaryYear(String annyversaryYear) {
		this.annyversaryYear = annyversaryYear;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public void setPhoneHome2(String phoneHome2) {
		this.phoneHome2 = phoneHome2;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ContactData that = (ContactData) o;
		return Objects.equals(lastName, that.lastName) &&
						Objects.equals(firstName, that.firstName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lastName, firstName);
	}



	public int getId() {
		return id;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public String getTitle() {
		return title;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneHome() {
		return phoneHome;
	}

	public String getPhoneMobile() {
		return phoneMobile;
	}

	public String getPhoneWork() {
		return phoneWork;
	}

	public String getFax() {
		return fax;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getEmail2() {
		return email2;
	}

	public String getEmail3() {
		return email3;
	}

	public String getWebPage() {
		return webPage;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public String getBirthMonth() {
		return birthMonth;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public String getAnnyversaryDay() {
		return annyversaryDay;
	}

	public String getAnnyversaryMonth() {
		return annyversaryMonth;
	}

	public String getAnnyversaryYear() {
		return annyversaryYear;
	}

	public String getAddress2() {
		return address2;
	}

	public String getPhoneHome2() {
		return phoneHome2;
	}

	public String getNotes() {
		return notes;
	}

	public String getGroup() { return group;}

}
