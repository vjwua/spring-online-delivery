package com.pnudev.springonlinedelivery;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class User {
	@Id
	public long id;
	public String first_name;
	public String last_name;
	public String email;
	public String mobile;
	public String password;
	public Role role;
	
	User(long id, String first_name, String last_name, String email, String mobile){
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.mobile = mobile;
	}
}
