package com.pnudev.springonlinedelivery.models;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {
	@Id
	private long id;
	@Pattern(regexp = "^[A-Za-z-]+$")
	private String firstName;
	@Pattern(regexp = "^[A-Za-z-]+$")
	private String lastName;
	@Email
	private String email;
	@Pattern(regexp = "^(\\+\\d{1,3}[- ]?)?\\d{10}$")
	private String mobile;
	private String password;
	private Role role;
	
	@OneToMany(mappedBy="user")
	private Set<Order> orders;
}
