package ru.stqa.pft.addressbook.model;

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
}
