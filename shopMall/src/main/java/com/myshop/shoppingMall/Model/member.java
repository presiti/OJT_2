package com.myshop.shoppingMall.Model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class member {
	@Id
	private Integer custno;
	
	@Column(length=20)
	private String custname;
	
	@Column(length=13)
	private String phone;
	
	@Column(length=60)
	private String address;
	
	@Column
	private Date joindate;
	
	@Column
	private char grade;
	
	@Column(length=2)
	private String city;
	
	@Builder
	public member(int custno, String custname, String phone, String address, Date joindate, char grade, String city) {
		this.custno = custno;
		this.custname = custname;
		this.phone = phone;
		this.address = address;
		this.joindate = joindate;
		this.grade = grade;
		this.city = city;
	}
	

}
