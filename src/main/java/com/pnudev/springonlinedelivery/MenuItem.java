package com.pnudev.springonlinedelivery;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Table(name = "MenuItem")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class MenuItem {
	@Id
	public long id;
	public String name;
	public String summary;
	public double size;
	public double price;
}
