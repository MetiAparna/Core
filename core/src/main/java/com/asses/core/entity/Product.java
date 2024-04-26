package com.asses.core.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="product_info")
public class Product implements Serializable
{
//	private long alt_key;
	public Product()
	{
		super();
	}
	

	@Id
	@GenericGenerator(name="auto_gen",strategy = "increment")
	@GeneratedValue(generator = "auto_gen")
	@Column(name="alt_key")
	private int alt_key;
	
	
	@Column(name="product_name")
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="product_brand")
	private List<Brand>  brands;

	public Product(String name, List<Brand> brands) {
		super();
		this.name = name;
		this.brands = brands;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Brand> getBrands() {
		return brands;
	}

	public void setBrands(List<Brand> brands) {
		this.brands = brands;
	}

	public int getAlt_key() {
		return alt_key;
	}

	public void setAlt_key(int alt_key) {
		this.alt_key = alt_key;
	}
	

}
