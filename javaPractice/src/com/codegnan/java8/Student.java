package com.codegnan.java8;

import java.io.Serializable;

public class Student implements Serializable{
private int id;
private String name;
private String email;
private transient String password;
public Student(int id, String name, String email, String password) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.password = password;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
}
public void displayStudentDetails(){
	System.out.println(id);
	System.out.println(name);
	System.out.println(email);
	System.out.println(password);
	
	
}
}
