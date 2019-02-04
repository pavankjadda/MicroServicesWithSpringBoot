package com.microservices;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Data
@Table(name = "account")
public class Account implements Serializable
{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Long id;

	@Column(name = "number")
	protected Long number;

	@Column(name = "owner")
	protected String owner;

	@Column(name = "balance")
	protected Double balance;



}
