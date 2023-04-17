package com.pnudev.springonlinedelivery;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Entity
@Table(name = "orderU")	
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
	@JoinColumn(name = "menu_item_id", nullable = false)
	private MenuItem menuItem;	
}
