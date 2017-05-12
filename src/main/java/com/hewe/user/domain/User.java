package com.hewe.user.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.hewe.sys.domain.BasicUser;

@Entity
@Table(name = "share_user")
public class User extends BasicUser {
	private String name;
	private int gender;
	private String email;
	private String phone;

	@Column(length = 40, unique = true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(nullable = false)
	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	@Column(length = 50)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(length = 50)
	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", gender=" + gender + ", email=" + email + ", phone=" + phone + "]";
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
