package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="hr")
public class Hr 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int hr_id;
	
	@JsonIgnoreProperties("hr")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="u_id")
	User u_id;
	
	public Hr() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Hr(int hr_id, User u_id) {
		super();
		this.hr_id = hr_id;
		this.u_id = u_id;
	}

	public int getHr_id() {
		return hr_id;
	}
	public void setHr_id(int hr_id) {
		this.hr_id = hr_id;
	}
	public User getU_id() {
		return u_id;
	}
	public void setU_id(User u_id) {
		this.u_id = u_id;
	}

	/*@Override
	public String toString() {
		return "Hr [hr_id=" + hr_id + ", u_id=" + u_id + "]";
	}*/
	
	
	
	
}
