package com.asses.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="captain_info")
public class captain  implements Serializable
{
	@Id
    @GenericGenerator(name="auto_gen", strategy="increment")
    @GeneratedValue(generator="auto_gen")
    @Column(name="alt_key")
    private long altkey;
	
	@Column(name="captain_name")
	private String captain_name;
	
	@Column(name="age")
	private String age;
	
	@Column(name="email")
	private String email;

	public long getAltkey() {
		return altkey;
	}

	public void setAltkey(long altkey) {
		this.altkey = altkey;
	}

	public String getCaptain_name() {
		return captain_name;
	}

	public void setCaptain_name(String captain_name) {
	 this.captain_name = captain_name;
	}

	public String getAge() {
		return age;
	}

	public String setAge(String age) {
		return this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	

	

}
