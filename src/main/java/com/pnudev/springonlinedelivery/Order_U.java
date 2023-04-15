package com.pnudev.springonlinedelivery;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;

@Entity
public class Order_U {
	@Id
	public long id;
	public long user_id;
	public double price;
	//public enum status;
}
