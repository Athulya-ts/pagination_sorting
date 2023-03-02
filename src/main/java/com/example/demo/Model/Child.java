
package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Child")

public class Child {
	@Id
	@Column(name="babyId")
	private int babyId;
	@Column(name="babyFirstName")
	private String babyFirstName;
	@Column(name="babyLastName")
	private String babyLastName;
	@Column(name="fatherName")
	private String fatherName;
	@Column(name="motherName")
	private String motherName;
	@Column(name="address")
	private String address;
	public int getBabyId() {
		return babyId;
	}
	public void setBabyId(int babyId) {
		this.babyId = babyId;
	}
	public String getBabyFirstName() {
		return babyFirstName;
	}
	public void setBabyFirstName(String babyFirstName) {
		this.babyFirstName = babyFirstName;
	}
	public String getBabyLastName() {
		return babyLastName;
	}
	public void setBabyLastName(String babyLastName) {
		this.babyLastName = babyLastName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Child(int babyId, String babyFirstName, String babyLastName, String fatherName, String motherName,
			String address) {
		super();
		this.babyId = babyId;
		this.babyFirstName = babyFirstName;
		this.babyLastName = babyLastName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.address = address;
	}
	public Child() {

	}
	
}
