package com.asses.core.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="flight1_info")
public class Flight implements Serializable
{
	@Id
	@GenericGenerator(name="auto_gen",strategy = "increment")
	@GeneratedValue(generator = "auto_gen")
	@Column(name="alt_key")
	private int alt_key;
	
	@Column(name="name")
	private  String name;
	
	@Column(name="num_of_seats")
	private String numOfSeats;
	
	@Column(name="price")
    private String price;
	
	@OneToMany(cascade = CascadeType.ALL)//@ManyToOne
	@JoinColumn(name="forigen_key")
	private List<AirHosterss> airhosterssList;

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

	public String getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(String numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public List<AirHosterss> getAirhosterssList() {
		return airhosterssList;
	}

	public void setAirhosterssList(List<AirHosterss> airhosterssList) {
		this.airhosterssList = airhosterssList;
	}

	
	
	
	

}
