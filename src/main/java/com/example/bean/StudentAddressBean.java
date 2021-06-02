package com.example.bean;

public class StudentAddressBean {

	private int houseNumber;
	private String villageName;
	private String mandalName;
	private String districtName;
	private String pincode;
	
	
	
	
	
	public StudentAddressBean(int houseNumber, String villageName, String mandalName) {
		super();
		this.houseNumber = houseNumber;
		this.villageName = villageName;
		this.mandalName = mandalName;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
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
