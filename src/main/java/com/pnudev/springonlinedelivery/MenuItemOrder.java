package com.pnudev.springonlinedelivery;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Table(name = "MenuItemOrder")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class MenuItemOrder {
	@Id
	public long menuItemId;
	public long orderId;
	public int quantity;
}
