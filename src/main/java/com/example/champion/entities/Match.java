package com.example.champion.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.champion.views.Views;
import com.fasterxml.jackson.annotation.JsonView;

import lombok.Data;

@Entity
@Table(name = "/match/")
@Data
public class Match {

	@JsonView(Views.Match.class)
	@Id
	private Long id;
	
	@JsonView(Views.Match.class)
	private Long pOne;
	
	@JsonView(Views.Match.class)
	private Long pTwo;

}