package com.pnudev.springonlinedelivery;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class Menu_Item_Order {
	@Id
	public long menu_item_id;
	//@Id
	public long order_id;
	public int quantity;
	
	Menu_Item_Order(long menu_item_id, long order_id, int quantity){
		this.menu_item_id = menu_item_id;
		this.order_id = order_id;
		this.quantity = quantity;
	}
}
