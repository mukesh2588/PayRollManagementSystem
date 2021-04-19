package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="employee")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emp_id;
	@Column
	private String occupation;
	@Column
	private String designation;
	@Column
	private String account_no;
	
	@JsonIgnoreProperties("emp_id")
	@OneToMany(mappedBy = "emp_id",cascade = CascadeType.ALL)
	List<Salary> sal = new ArrayList();
	
	@JsonIgnoreProperties("emp_id")
	@OneToMany(mappedBy = "emp_id",cascade = CascadeType.ALL)
	List<Leave> l = new ArrayList();
	
	@JsonIgnoreProperties("emp_id")
	@OneToMany(mappedBy = "emp_id",cascade = CascadeType.ALL)
	List<PaySlip> p = new ArrayList();
	
	@JsonIgnoreProperties("emp")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="u_id")
	User u_id;
	
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String occupation, String designation, String account_no, User u_id) {
		super();
		this.occupation = occupation;
		this.designation = designation;
		this.account_no = account_no;
		this.u_id = u_id;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAccount_no() {
		return account_no;
	}

	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}

	public User getU_id() {
		return u_id;
	}

	public void setU_id(User u_id) {
		this.u_id = u_id;
	}

	
}
