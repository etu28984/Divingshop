package com.spring.henallux.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserEntity {
	
	@Id
	@Column(name="iduser", nullable=false)
	private int Id;
	
	@Column(name="login", nullable=false)
	private String login;
	
	@Column(name="password", nullable=false)
	private String password;
	
	@Column(name="lastname", nullable=false)
	private String lastName;
	
	@Column(name="firstname", nullable=false)
	private String firstName;
	
	@Column(name="adresse", nullable=false)
	private String adresse;
	
	@Column(name="email", nullable=false)
	private String email;
	
	@Column(name="mobilephone", nullable=false)
	private String mobilePhone;
	
	@Column(name="phonenumber", nullable=true)
	private String phoneNumber;

	
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
}
