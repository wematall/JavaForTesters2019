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

	public ContactData(String lastName, String firstName) {
  	this.id = Integer.MAX_VALUE;
	  this.lastName  = lastName;
	  this.firstName = firstName;
}

	public ContactData(int id, String lastName, String firstName) {
		this.id        = id;
		this.lastName  = lastName;
		this.firstName = firstName;
	}

/*public ContactData (int id, String lastName, String firstName) {
		this.id        = id;
		this.lastName  = lastName;
		this.firstName = firstName;

		this.middleName  = null;
		this.nickName    = null;
		this.title       = null;
		this.companyName = null;
		this.address     = null;
		this.phoneHome   = null;
		this.phoneMobile = null;
		this.phoneWork   = null;
		this.fax         = null;
		this.email       = null;

		this.email2      = null;
		this.email3      = null;
		this.webPage     = null;
		this.birthDay    = null;
		this.birthMonth  = null;
		this.birthYear   = null;
		this.annyversaryDay = null;
		this.annyversaryMonth = null;
		this.annyversaryYear  = null;
		this.address2         = null;
		this.phoneHome2       = null;
		this.notes            = null;
		this.group       = null;
	}

 */

/*	public ContactData(int id, String middleName, String lastName, String nickName, String title, String companyName, String address, String phoneHome, String phoneMobile, String phoneWork, String fax, String email, String firstName, String email2, String email3, String webPage, String birthDay, String birthMonth, String birthYear, String annyversaryDay, String annyversaryMonth, String annyversaryYear, String group, String address2, String phoneHome2, String notes) {
		this.id = Integer.MAX_VALUE;
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
*/

	public void setId(int id) {
		this.id = id;
	}

	public ContactData(String middleName, String lastName, String nickName, String title, String companyName, String address, String phoneHome, String phoneMobile, String phoneWork, String fax, String email, String firstName, String email2, String email3, String webPage, String birthDay, String birthMonth, String birthYear, String annyversaryDay, String annyversaryMonth, String annyversaryYear, String group, String address2, String phoneHome2, String notes) {
		//this.id = Integer.MAX_VALUE;
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
