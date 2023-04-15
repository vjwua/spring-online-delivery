package com.pnudev.springonlinedelivery;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Table(name = "User")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {
	@Id
	public long id;
	@Pattern(regexp = "^[A-Za-z ,.'-]+$")
	public String firstName;
	@Pattern(regexp = "^[A-Za-z ,.'-]+$")
	public String lastName;
	@Email
	public String email;
	@Pattern(regexp = "/^(\\+\\d{1,3}[- ]?)?\\d{10}$/")
	public String mobile;
	public String password;
	public Role role;
}
