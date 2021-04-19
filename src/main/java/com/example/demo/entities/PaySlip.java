package com.example.demo.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="payslip")
public class PaySlip 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int p_id;
	@Column
	private Date payslip_date;
	@Column
	private float payslip_salary;
	@Column
	private int payslip_workingdays;
	
	@JsonIgnoreProperties("p")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "salary_id")
	private Salary salary_id;
	
	@JsonIgnoreProperties("p")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_id")
	private Employee emp_id;
	
	/*@JsonIgnoreProperties("user1")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dept_id")
	private Department dept_id;*/

	public PaySlip() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaySlip(int p_id, Date payslip_date, float payslip_salary, int payslip_workingdays, Salary salary_id,
			Employee emp_id) {
		super();
		this.p_id = p_id;
		this.payslip_date = payslip_date;
		this.payslip_salary = payslip_salary;
		this.payslip_workingdays = payslip_workingdays;
		this.salary_id = salary_id;
		this.emp_id = emp_id;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public Date getPayslip_date() {
		return payslip_date;
	}

	public void setPayslip_date(Date payslip_date) {
		this.payslip_date = payslip_date;
	}

	public float getPayslip_salary() {
		return payslip_salary;
	}

	public void setPayslip_salary(float payslip_salary) {
		this.payslip_salary = payslip_salary;
	}

	public int getPayslip_workingdays() {
		return payslip_workingdays;
	}

	public void setPayslip_workingdays(int payslip_workingdays) {
		this.payslip_workingdays = payslip_workingdays;
	}

	public Salary getSalary_id() {
		return salary_id;
	}

	public void setSalary_id(Salary salary_id) {
		this.salary_id = salary_id;
	}

	public Employee getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(Employee emp_id) {
		this.emp_id = emp_id;
	}

	
}
