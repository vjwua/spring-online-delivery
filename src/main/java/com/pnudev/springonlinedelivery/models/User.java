package com.pnudev.springonlinedelivery.models;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class User implements UserDetails {

	@Id
	private long id;
	//@Pattern(regexp = "^[A-Za-z-]+$")
	private String firstName;
	//@Pattern(regexp = "^[A-Za-z-]+$")
	private String lastName;
	@Email
	private String email;
	//@Pattern(regexp = "^(\\+\\d{1,3}[- ]?)?\\d{10}$")
	private String mobile;
	private String password;
	@Enumerated(EnumType.STRING)
	private Role role;
	private boolean active;

	@OneToMany(mappedBy="user")
	private Set<Order> orders;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(new SimpleGrantedAuthority(role.name()));
	}

	@Override
	public String getUsername() {
		return email;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return active;
	}
}
