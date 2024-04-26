package com.asses.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="airhosterss1_info")
public class AirHosterss implements Serializable
{
	@Id
	@GenericGenerator(name="auto_gen",strategy = "increment")
	@GeneratedValue(generator = "auto_gen")
	@Column(name="alt_key")
    private int alt_key;
	
	@Column(name="name")
    private String name;
	
	@Column(name="age")
    private int age;

	public int getAlt_key() {
		return alt_key;
	}

	public void setAlt_key(int alt_key) {
		this.alt_key = alt_key;
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

}
