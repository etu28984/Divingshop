package com.spring.henallux.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
		
	private int id;

	@NotNull
	@Size(min=4, max=15)
	private String login;
	
	@NotNull
	@Size(min=4, max=15)
	private String password;
	
	@NotNull
	@Size(min=4, max=15)
	private String confirmationPassword;

	@NotNull
	@Size(min=4, max=15)
	private String lastName;
	
	@NotNull
	@Size(min=2, max=15)
	private String firstName;
	
	@NotNull
	private String address;
	
	@NotNull
	private String email;
	
	@NotNull
	private String mobilePhoneNumber;
	
	private String phoneNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}

	public void setMobilePhoneNumber(String mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getConfirmationPassword() {
		return confirmationPassword;
	}

	public void setConfirmationPassword(String confirmationPassword) {
		this.confirmationPassword = confirmationPassword;
	}

	public User(int id, String login, String password, String lastName, String firstName, String address, String email,
			String mobilePhoneNumber, String phoneNumber) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.email = email;
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.phoneNumber = phoneNumber;
	}

	public User(String login, String password, String lastName, String firstName, String address, String email,
			String mobilePhoneNumber, String phoneNumber) {
		super();
		this.login = login;
		this.password = password;
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.email = email;
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.phoneNumber = phoneNumber;
	}
	
	public User(){
		this.login = new String();
		this.password = new String();
		this.confirmationPassword = new String();
		this.lastName = new String();
		this.firstName = new String();
		this.address = new String();
		this.email = new String();
		this.mobilePhoneNumber = "";
		this.phoneNumber = "";
	}
	
	
	
	
}
