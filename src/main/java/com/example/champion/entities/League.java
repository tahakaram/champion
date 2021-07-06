package com.example.champion.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "league")
@Data
public class League {

	@Id
	private Long id;
	
	private String leagueName ;
}
