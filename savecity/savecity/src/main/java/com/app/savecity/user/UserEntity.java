package com.app.savecity.user;

import com.app.savecity.address.Address;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;



@Entity(name = "user_entity")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;

	
	private String fullName;	
	
	private String email;
	private Long mobailNo;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "address_id")
	private Address address;
	
	private byte age;

	public UserEntity() {
		super();
	}

	public UserEntity(Long userId, String fullName, String email, Long mobailNo, Address address, byte age) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.email = email;
		this.mobailNo = mobailNo;
		this.address = address;
		this.age = age;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobailNo() {
		return mobailNo;
	}

	public void setMobailNo(Long mobailNo) {
		this.mobailNo = mobailNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", fullName=" + fullName + ", email=" + email + ", mobailNo=" + mobailNo
				+ ", address=" + address + ", age=" + age + "]";
	}
	
}
