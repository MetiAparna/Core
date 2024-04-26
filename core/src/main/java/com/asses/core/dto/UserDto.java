package com.asses.core.dto;//lowercase Numbers only in use create package

import java.io.Serializable;

public class UserDto  implements Serializable
{
	private long alt_key;
	
    private String name;
    
   // private String email;
    
  //  private String contactNumber;
    
  //  private String password;
    
    private String city;
    
    private String country;
    
    private String pincode;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public long getAlt_key() {
		return alt_key;
	}

	public void setAlt_key(long alt_key) {
		this.alt_key = alt_key;
	}

	
	


}


	