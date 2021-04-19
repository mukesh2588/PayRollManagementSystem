package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Column;

public class EmployeeRegister {
	private String password;
	private String u_type;
	private String salutation;
	private String fname;
	private String mname;
	private String lname;
	private String contact_no;
	private String emailid;
	private Date dob;
	private Date doj;
	private String address;
	private String gender;
	private String designation;
	private String occupation;
	private String account_no;
	private float salary_monthly_sal;
	private float salary_pf;
	private float salary_proftax;
	
	public EmployeeRegister() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeRegister(String password, String u_type, String salutation, String fname, String mname, String lname,
			String contact_no, String emailid, Date dob, Date doj, String address, String gender, String designation,
			String occupation, String account_no) {
		super();
		this.password = password;
		this.u_type = u_type;
		this.salutation = salutation;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.contact_no = contact_no;
		this.emailid = emailid;
		this.dob = dob;
		this.doj = doj;
		this.address = address;
		this.gender = gender;
		this.designation = designation;
		this.occupation = occupation;
		this.account_no = account_no;
		
	}
	
	

	public EmployeeRegister(String password, String u_type, String salutation, String fname, String mname, String lname,
			String contact_no, String emailid, Date dob, Date doj, String address, String gender, String designation,
			String occupation, String account_no, float salary_monthly_sal, float salary_pf, float salary_proftax) {
		super();
		this.password = password;
		this.u_type = u_type;
		this.salutation = salutation;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.contact_no = contact_no;
		this.emailid = emailid;
		this.dob = dob;
		this.doj = doj;
		this.address = address;
		this.gender = gender;
		this.designation = designation;
		this.occupation = occupation;
		this.account_no = account_no;
		this.salary_monthly_sal = salary_monthly_sal;
		this.salary_pf = salary_pf;
		this.salary_proftax = salary_proftax;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getU_type() {
		return u_type;
	}

	public void setU_type(String u_type) {
		this.u_type = u_type;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getAccount_no() {
		return account_no;
	}

	public void setAccount_no(String account_no) {
		this.account_no = account_no;
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

	public float getSalary_monthly_sal() {
		return salary_monthly_sal;
	}

	public void setSalary_monthly_sal(float salary_monthly_sal) {
		this.salary_monthly_sal = salary_monthly_sal;
	}

	@Override
	public String toString() {
		return "EmployeeRegister [password=" + password + ", u_type=" + u_type + ", salutation=" + salutation
				+ ", fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", contact_no=" + contact_no
				+ ", emailid=" + emailid + ", dob=" + dob + ", doj=" + doj + ", address=" + address + ", gender="
				+ gender + ", designation=" + designation + ", occupation=" + occupation + ", account_no=" + account_no
				+ "]";
	}

	
	
	

	
}
