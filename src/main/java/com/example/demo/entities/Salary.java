package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="salary")
public class Salary 
{
	@Id
	private int salary_id;
	
	@JsonIgnoreProperties("sal")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="emp_id")
	Employee emp_id;
	
	@Column
	private float salary_Monthly_sal;
	
	@Column
	private float salary_pf;
	
	@Column
	private float salary_proftax;
	
	@JsonIgnoreProperties("salary_id")
	@OneToMany(mappedBy = "salary_id", cascade = CascadeType.ALL)
	List<PaySlip> p = new ArrayList();

	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Salary(Employee emp_id, float salary_Monthly_sal) {
		super();
		this.emp_id = emp_id;
		this.salary_Monthly_sal = salary_Monthly_sal;
	}



	public Salary(Employee emp_id, float salary_Monthly_sal, float salary_pf, float salary_proftax) {
		super();
		this.emp_id = emp_id;
		this.salary_Monthly_sal = salary_Monthly_sal;
		this.salary_pf = salary_pf;
		this.salary_proftax = salary_proftax;
	}



	public int getSalary_id() {
		return salary_id;
	}

	public void setSalary_id(int salary_id) {
		this.salary_id = salary_id;
	}

	public Employee getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(Employee emp_id) {
		this.emp_id = emp_id;
	}

	public float getSalary_Monthly_sal() {
		return salary_Monthly_sal;
	}

	public void setSalary_Monthly_sal(float salary_Monthly_sal) {
		this.salary_Monthly_sal = salary_Monthly_sal;
	}

	public float getSalary_pf() {
		return salary_pf;
	}

	public void setSalary_pf(float salary_pf) {
		this.salary_pf = salary_pf;
	}

	public float getSalary_proftax() {
		return salary_proftax;
	}

	public void setSalary_proftax(float salary_proftax) {
		this.salary_proftax = salary_proftax;
	}

	/*@Override
	public String toString() {
		return "Salary [salary_id=" + salary_id + ", emp_id=" + emp_id + ", salary_Monthly_sal=" + salary_Monthly_sal
				+ ", salary_pf=" + salary_pf + ", salary_proftax=" + salary_proftax + "]";
	}*/

	
}
