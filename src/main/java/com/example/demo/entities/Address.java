package com.example.demo.entities;

public class Address 
{
	String area;
	String city;
	String country;
	String pincode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String area, String city, String country, String pincode) {
		super();
		this.area = area;
		this.city = city;
		this.country = country;
		this.pincode = pincode;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
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

	/*@Override
	public String toString() {
		return "Address [area=" + area + ", city=" + city + ", country=" + country + ", pincode=" + pincode + "]";
	}*/
	
	
}
