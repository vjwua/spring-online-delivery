package com.pnudev.springonlinedelivery;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class Menu_Item {
	@Id
	public long id;
	public String name;
	public String summary;
	public double size;
	public double price;
	
	Menu_Item(long id, String name, String summary, double size, double price){
		this.id = id;
		this.name = name;
		this.summary = summary;
		this.size = size;
		this.price = price;
	}
}
