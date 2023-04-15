package com.pnudev.springonlinedelivery;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Entity
@Table(name = "OrderU")	
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OrderU {
	@Id
	private long id;
	@Column(name = "user_id", insertable=false, updatable=false)
	private long userId;
	private double price;
	private Status status;
	
	@ManyToOne
	private User user;
	@ManyToOne
	private MenuItemOrder menuItemOrder;	
}
