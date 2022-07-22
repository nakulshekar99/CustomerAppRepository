package com.springboot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
@Id
@GeneratedValue
@Column(name="id")
private Integer	id;
@Column(name="name")
private String name;
@Column(name="age")
private int	age;
@Column(name="gender")
private String gender;
public Customer() {
	
}
public Customer(Integer id, String name, int age, String gender) {
	
	this.id = id;
	this.name = name;
	this.age = age;
	this.gender = gender;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
}




}
