package com.gabriel.hrpayroll.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonPropertyOrder({ "id", "name", "dailyIncome" })
public class Worker implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private double dailyIncome;
}
