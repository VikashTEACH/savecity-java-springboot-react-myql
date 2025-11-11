package com.app.savecity.wastissue.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "wastentity")
public class WastEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String wastType;
	private Double quantity;
	private String priority;
	private String additionalAdd;
	
	
	public WastEntity() {
		super();
	}
	
	public WastEntity(Long id, String wastType, Double quantity, String priority, String additionalAdd) {
		super();
		this.id = id;
		this.wastType = wastType;
		this.quantity = quantity;
		this.priority = priority;
		this.additionalAdd = additionalAdd;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getWastType() {
		return wastType;
	}
	public void setWastType(String wastType) {
		this.wastType = wastType;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getAdditionalAdd() {
		return additionalAdd;
	}
	public void setAdditionalAdd(String additionalAdd) {
		this.additionalAdd = additionalAdd;
	}

	@Override
	public String toString() {
		return "WastEntity [id=" + id + ", wastType=" + wastType + ", quantity=" + quantity + ", priority=" + priority
				+ ", additionalAdd=" + additionalAdd + "]";
	}
	
}
