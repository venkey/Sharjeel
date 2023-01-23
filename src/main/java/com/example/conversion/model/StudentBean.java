package com.example.conversion.model;

import javax.xml.bind.annotation.XmlAttribute;

public class StudentBean {
	String firstname = "";
	String id = "";
	String lastname = "";
	String marks = "";
	String subject = "";

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@XmlAttribute(name = "firstname")
	public String getFirstname() {
		return firstname;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XmlAttribute(name = "id")
	public String getId() {
		return id;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@XmlAttribute(name = "lastname")
	public String getLastname() {
		return lastname;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	@XmlAttribute(name = "marks")
	public String getMarks() {
		return marks;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@XmlAttribute(name = "subject")
	public String getSubject() {
		return subject;
	}

}