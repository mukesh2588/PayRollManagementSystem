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

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="leaves")
public class Leave 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int l_id;
	@Column
	private String reason;
	@Column
	private String sick_leave;
	@Column
	private String casual_leave;
	
	@Column
	@CreatedDate
    @JsonFormat(pattern="yyyy-MM-dd")
	private Date start_date;
	
	@Column
	@CreatedDate
    @JsonFormat(pattern="yyyy-MM-dd")
	private Date end_date;
	
	@JsonIgnoreProperties("l")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="emp_id")
	Employee emp_id;

	public Leave() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Leave(String reason, String sick_leave, String casual_leave, Date start_date, Date end_date,
			Employee emp_id) {
		super();
		this.reason = reason;
		this.sick_leave = sick_leave;
		this.casual_leave = casual_leave;
		this.start_date = start_date;
		this.end_date = end_date;
		this.emp_id = emp_id;
	}

	public int getL_id() {
		return l_id;
	}

	public void setL_id(int l_id) {
		this.l_id = l_id;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getSick_leave() {
		return sick_leave;
	}

	public void setSick_leave(String sick_leave) {
		this.sick_leave = sick_leave;
	}

	public String getCasual_leave() {
		return casual_leave;
	}

	public void setCasual_leave(String casual_leave) {
		this.casual_leave = casual_leave;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public Employee getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(Employee emp_id) {
		this.emp_id = emp_id;
	}

	
}
