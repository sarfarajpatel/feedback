package com.svp.feedback.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FeedbackEntity {
	@Id
	private int id;
	private String name;
	private String email;
	private String reg;
	private String code;
	private int rating;	
	private String msg;
	
	public FeedbackEntity() {
		
	}
	
	public FeedbackEntity(String name, String email, String reg, String code, int rating, String msg) {
		super();
		this.name = name;
		this.email = email;
		this.reg = reg;
		this.code = code;
		this.rating = rating;
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "FeedbackEntity [name=" + name + ", email=" + email + ", reg=" + reg + ", code=" + code + ", rating="
				+ rating + ", msg=" + msg + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getReg() {
		return reg;
	}
	public void setReg(String reg) {
		this.reg = reg;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
