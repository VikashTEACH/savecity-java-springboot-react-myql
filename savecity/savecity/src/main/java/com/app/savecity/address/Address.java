package com.app.savecity.address;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name="UserAddress")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long addId;

	private String wordNo;

	private String villageName;

	private String postName;
	
	private String tehsilName;

	private String cityName;

	private String stateName;

	private Integer pinCodeNo;

	public Address() {
		super();
	}

	public Address(Long addId, String wordNo, String villageName, String postName, String tehsilName, String cityName,
			String stateName, Integer pinCodeNo) {
		super();
		this.addId = addId;
		this.wordNo = wordNo;
		this.villageName = villageName;
		this.postName = postName;
		this.tehsilName = tehsilName;
		this.cityName = cityName;
		this.stateName = stateName;
		this.pinCodeNo = pinCodeNo;
	}

	public Long getAddId() {
		return addId;
	}

	public void setAddId(Long addId) {
		this.addId = addId;
	}

	public String getWordNo() {
		return wordNo;
	}

	public void setWordNo(String wordNo) {
		this.wordNo = wordNo;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public String getTehsilName() {
		return tehsilName;
	}

	public void setTehsilName(String tehsilName) {
		this.tehsilName = tehsilName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Integer getPinCodeNo() {
		return pinCodeNo;
	}

	public void setPinCodeNo(Integer pinCodeNo) {
		this.pinCodeNo = pinCodeNo;
	}

	@Override
	public String toString() {
		return "Address [addId=" + addId + ", wordNo=" + wordNo + ", villageName=" + villageName + ", postName="
				+ postName + ", tehsilName=" + tehsilName + ", cityName=" + cityName + ", stateName=" + stateName
				+ ", pinCodeNo=" + pinCodeNo + "]";
	}
	
		
	
}
