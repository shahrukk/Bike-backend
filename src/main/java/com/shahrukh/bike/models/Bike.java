package com.shahrukh.bike.models;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bike")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bike {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "phone", nullable = false)
	private String phone;

	@Column(name = "model", nullable = false)
	private String model;

	@Column(name = "serialNumber", nullable = false)
	private String serialNumber;

	@Column(name = "purchasePrice", nullable = false)
	private BigDecimal purchasePrice;

	@Column(name = "purchaseDate", nullable = false)
	@JsonFormat(shape = JsonFormat.Shape.STRING ,pattern = "MM-dd-yyyy")
	private Date purchaseDate;

	@Column(name = "contect", nullable = false)
	private boolean contect;

}
