package com.example.demo.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="user")
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int u_id;
	@Column
	private String password;
	@Column
	private String u_type;
	@Column
	private String salutation;
	@Column
	private String fname;
	@Column
	private String mname;
	@Column
	private String lname;
	@Column
	private String contact_no;
	@Column
	private String emailid;
	@Column
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	@Column
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date doj;
	@Column
	private String address;
	@Column
	private String gender;
	
	
	@JsonIgnoreProperties("u_id")
	@OneToMany(mappedBy = "u_id", cascade = CascadeType.ALL)
	List<Employee> emp = new ArrayList();
	
	@JsonIgnoreProperties("u_id")
	@OneToMany(mappedBy = "u_id", cascade = CascadeType.ALL)
	List<Hr> hr = new ArrayList();
	
	

	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public User(String password, String u_type, String salutation, String fname, String mname, String lname,
			String contact_no, String emailid, Date dob, Date doj, String address, String gender) {
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
	}



	public User(String password, String u_type, String salutation, String fname, String mname, String lname,
			String gender, String contact_no, String emailid, Date dob, Date doj, String address) {
		super();
		this.password = password;
		this.u_type = u_type;
		this.salutation = salutation;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.gender = gender;
		this.contact_no = contact_no;
		this.emailid = emailid;
		this.dob = dob;
		this.doj = doj;
		this.address = address;
	}

	
	

	public User(int u_id, String password, String u_type, String salutation, String fname, String mname, String lname,
			String gender, String contact_no, String emailid, Date dob, Date doj, String address, List<Employee> emp,
			List<Hr> hr) {
		super();
		this.u_id = u_id;
		this.password = password;
		this.u_type = u_type;
		this.salutation = salutation;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.gender = gender;
		this.contact_no = contact_no;
		this.emailid = emailid;
		this.dob = dob;
		this.doj = doj;
		this.address = address;
		this.emp = emp;
		this.hr = hr;
	}



	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	public List<Hr> getHr() {
		return hr;
	}

	public void setHr(List<Hr> hr) {
		this.hr = hr;
	}

	/*@Override
	public String toString() {
		return "User [u_id=" + u_id + ", password=" + password + ", u_type=" + u_type + ", salutation=" + salutation
				+ ", fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", gender=" + gender + ", contact_no="
				+ contact_no + ", emailid=" + emailid + ", dob=" + dob + ", doj=" + doj + ", address=" + address
				+ ", emp=" + emp + ", hr=" + hr + "]";
	}*/

	
}
