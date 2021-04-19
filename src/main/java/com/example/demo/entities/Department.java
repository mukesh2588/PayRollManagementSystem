package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="department")
public class Department 
{
	@Id
	int dept_id;
	@Column
	String dept_name;
	
/*	@JsonIgnoreProperties("dept_id")
	@OneToMany(mappedBy = "dept_id",cascade = CascadeType.ALL)
	List<User> user = new ArrayList();*/
	
	/*@JsonIgnoreProperties("dept_id")
	@OneToMany(mappedBy = "dept_id",cascade = CascadeType.ALL)
	List<PaySlip> user1 = new ArrayList();*/

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int dept_id, String dept_name) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	/*public List<User> getUs() {
		return user;
	}

	public void setUs(List<User> us) {
		this.user = user;
	}*/
	
	
}
