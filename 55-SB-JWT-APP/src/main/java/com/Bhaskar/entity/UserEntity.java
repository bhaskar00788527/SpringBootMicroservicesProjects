package com.Bhaskar.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User_tbl")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String Uname;
	private String Upwd;
	private Long Phnno;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public String getUpwd() {
		return Upwd;
	}
	public void setUpwd(String upwd) {
		Upwd = upwd;
	}
	public Long getPhnno() {
		return Phnno;
	}
	public void setPhnno(Long phnno) {
		Phnno = phnno;
	}
	
	
	
}
