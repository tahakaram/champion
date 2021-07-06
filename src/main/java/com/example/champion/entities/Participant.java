package com.example.champion.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.champion.views.Views;
import com.fasterxml.jackson.annotation.JsonView;

import lombok.Data;

@Entity
@Table(name = "participant")
@Data
public class Participant {

	@JsonView(Views.Participant.class)
	@Id
	private Long id;
	
	@JsonView(Views.DetailedParticipant.class)
	private String name;
	
	@JsonView(Views.DetailedParticipant.class)
	private int phoneNumber;
	
	@JsonView(Views.DetailedParticipant.class)
	private String email;
}
