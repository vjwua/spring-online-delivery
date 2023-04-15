package com.pnudev.springonlinedelivery;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Entity
@Table(name = "MenuItemOrder")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class MenuItemOrder {
	@Id
	private long menuItemId;
	private long orderId;
	private int quantity;
	
	@OneToMany(mappedBy="menuItemOrder")
	private Set<OrderU> orders;	
	@OneToMany(mappedBy="menuItemOrder")
	private Set<MenuItem> menuItems;		
}
