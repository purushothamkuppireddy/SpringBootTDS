package com.capg.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tds_master")
public class TdsMaster {
	@Id
	private int id;
	private String deductorName;
	private String deductorPan;
	private int tdsDeposited;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeductorName() {
		return deductorName;
	}
	public void setDeductorName(String deductorName) {
		this.deductorName = deductorName;
	}
	public String getDeductorPan() {
		return deductorPan;
	}
	public void setDeductorPan(String deductorPan) {
		this.deductorPan = deductorPan;
	}
	public int getTdsDeposited() {
		return tdsDeposited;
	}
	public void setTdsDeposited(int tdsDeposited) {
		this.tdsDeposited = tdsDeposited;
	}
	
	
}
