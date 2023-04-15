package com.pnudev.springonlinedelivery;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Entity
@Table(name = "MenuItem")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class MenuItem {
	@Id
	private long id;
	private String name;
	private String summary;
	private double size;
	private double price;
	
	@ManyToOne
	private MenuItemOrder menuItemOrder;	
}
