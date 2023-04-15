package com.pnudev.springonlinedelivery;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Table(name = "OrderU")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OrderU {
	@Id
	public long id;
	public long userId;
	public double price;
	public Status status;
}
