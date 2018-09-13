package com.example.demo.domain;

public class City {

	private String Id;
	private String Name;
	private String CountryCode;
	private String District;
	private String Population;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getPopulation() {
		return Population;
	}
	public void setPopulation(String population) {
		Population = population;
	}
	@Override
	public String toString() {
		return "City [Id=" + Id + ", Name=" + Name + ", CountryCode=" + CountryCode + ", District=" + District
				+ ", Population=" + Population + "]";
	}
	
	
	
}
