package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentAddressDto {

	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	private String houseNumber;
	private String villageName;
	private String mandalName;
	private String districtName;
	private String pincode;
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getVillageName() {
		return villageName;
	}
	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}
	public String getMandalName() {
		return mandalName;
	}
	public void setMandalName(String mandalName) {
		this.mandalName = mandalName;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "StudentAddressBean [houseNumber=" + houseNumber + ", villageName=" + villageName + ", mandalName="
				+ mandalName + ", districtName=" + districtName + ", pincode=" + pincode + ", getHouseNumber()="
				+ getHouseNumber() + ", getVillageName()=" + getVillageName() + ", getMandalName()=" + getMandalName()
				+ ", getDistrictName()=" + getDistrictName() + ", getPincode()=" + getPincode() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
