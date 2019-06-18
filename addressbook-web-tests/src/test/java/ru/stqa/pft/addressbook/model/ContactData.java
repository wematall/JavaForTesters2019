package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class ContactData {
	private final String middleName;
	private final String lastName;
	private final String nickName;
	private final String title;
	private final String companyName;
	private final String address;
	private final String phoneHome;
	private final String phoneMobile;
	private final String phoneWork;
	private final String fax;
	private final String email;
	private final String firstName;
	private final String email2;
	private final String email3;
	private final String webPage;
	private final String birthDay;
	private final String birthMonth;
	private final String birthYear;
	private final String annyversaryDay;
	private final String annyversaryMonth;
	private final String annyversaryYear;
	private final String address2;
	private final String phoneHome2;
	private final String notes;
	private final String group;

/*	public ContactData(String firstName, String phoneHome, String email) {
		this.firstName = firstName;
		this.phoneHome = phoneHome;
		this.email     = email;
	}*/

/*	public ContactData(String firstName, String lastName, String group){
		this.firstName = firstName;
		this.lastName  = lastName;
		this.group     = group;
	}*/

	public ContactData(String middleName, String lastName, String nickName, String title, String companyName, String address, String phoneHome, String phoneMobile, String phoneWork, String fax, String email, String firstName, String email2, String email3, String webPage, String birthDay, String birthMonth, String birthYear, String annyversaryDay, String annyversaryMonth, String annyversaryYear, String group, String address2, String phoneHome2, String notes) {
		this.middleName = middleName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.title = title;
		this.companyName = companyName;
		this.address = address;
		this.phoneHome = phoneHome;
		this.phoneMobile = phoneMobile;
		this.phoneWork = phoneWork;
		this.fax = fax;
		this.email = email;
		this.firstName = firstName;
		this.email2 = email2;
		this.email3 = email3;
		this.webPage = webPage;
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
		this.birthYear = birthYear;
		this.annyversaryDay = annyversaryDay;
		this.annyversaryMonth = annyversaryMonth;
		this.annyversaryYear = annyversaryYear;
		this.group = group;
		this.address2 = address2;
		this.phoneHome2 = phoneHome2;
		this.notes = notes;
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

	@Override
	public String toString() {
		return "ContactData{" +
						"middleName='" + middleName + '\'' +
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ContactData that = (ContactData) o;
		return Objects.equals(middleName, that.middleName) &&
						Objects.equals(lastName, that.lastName) &&
						Objects.equals(nickName, that.nickName) &&
						Objects.equals(title, that.title) &&
						Objects.equals(companyName, that.companyName) &&
						Objects.equals(address, that.address) &&
						Objects.equals(phoneHome, that.phoneHome) &&
						Objects.equals(phoneMobile, that.phoneMobile) &&
						Objects.equals(phoneWork, that.phoneWork) &&
						Objects.equals(fax, that.fax) &&
						Objects.equals(email, that.email) &&
						Objects.equals(firstName, that.firstName) &&
						Objects.equals(email2, that.email2) &&
						Objects.equals(email3, that.email3) &&
						Objects.equals(webPage, that.webPage) &&
						Objects.equals(birthDay, that.birthDay) &&
						Objects.equals(birthMonth, that.birthMonth) &&
						Objects.equals(birthYear, that.birthYear) &&
						Objects.equals(annyversaryDay, that.annyversaryDay) &&
						Objects.equals(annyversaryMonth, that.annyversaryMonth) &&
						Objects.equals(annyversaryYear, that.annyversaryYear) &&
						Objects.equals(address2, that.address2) &&
						Objects.equals(phoneHome2, that.phoneHome2) &&
						Objects.equals(notes, that.notes) &&
						Objects.equals(group, that.group);
	}

	@Override
	public int hashCode() {
		return Objects.hash(middleName, lastName, nickName, title, companyName, address, phoneHome, phoneMobile, phoneWork, fax, email, firstName, email2, email3, webPage, birthDay, birthMonth, birthYear, annyversaryDay, annyversaryMonth, annyversaryYear, address2, phoneHome2, notes, group);
	}
}
