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
@Table(name="brand_info")
public class Brand implements Serializable
{
	
	

	@Id
	@GenericGenerator(name="auto_gen",strategy = "increment")
	@GeneratedValue(generator = "auto_gen")
	@Column(name="alt_key")
	private int alt_key;
	
	
	
	@Column(name="brand_name")
	private String brand;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="brand_product")
	private List<Product> product;
	public Brand()
	{
		super();
	}
	public Brand(String brand, List<Product> product) {
		super();
		this.brand = brand;
		this.product = product;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public int getAlt_key() {
		return alt_key;
	}
	public void setAlt_key(int alt_key) {
		this.alt_key = alt_key;
	}

	

}
