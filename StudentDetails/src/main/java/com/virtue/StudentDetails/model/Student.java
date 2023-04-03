package com.virtue.StudentDetails.model;

import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "studentDetail")
public class Student {
	private String id;
	private String name;
	private String fatherName;
	private String motherName;
	private String rollNumber;
	private String schoolName;
	private String phoneNumber;
	private String email;
	private Map<String,Integer> subjects;
	private double percentage;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Map<String, Integer> getSubjects() {
		return subjects;
	}
	public void setSubjects(Map<String, Integer> subjects) {
		this.subjects = subjects;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public Student(String id, String name, String fatherName, String motherName, String rollNumber, String schoolName,
			String phoneNumber, String email, Map<String, Integer> subjects, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.rollNumber = rollNumber;
		this.schoolName = schoolName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.subjects = subjects;
		this.percentage = percentage;
	}

}
