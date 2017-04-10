package com.vuong.common.model;

import java.time.LocalDate;

import com.vuong.common.Gender;

public class Student {
	private Long id;
	private String firstName;
	private String lastName;
	private String address;
	private LocalDate dateOfBirth;
	private Gender gender;

	public Long getId() {
		return id;
	}

	public Student setId(Long id) {
		this.id = id;
		return this;
	}

	public String getFirstName() {
		return firstName;
	}

	public Student setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public Student setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public Student setAddress(String address) {
		this.address = address;
		return this;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public Student setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		return this;
	}

	public Gender getGender() {
		return gender;
	}

	public Student setGender(Gender gender) {
		this.gender = gender;
		return this;
	}

}
