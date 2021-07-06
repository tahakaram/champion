package com.example.champion.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.champion.views.Views;
import com.fasterxml.jackson.annotation.JsonView;

import lombok.Data;

@Entity
@Table(name = "match_details")
@Data
public class MatchDetails {

	@JsonView(Views.DetailedMatch.class)
	@Id
	private Long id;
	
	@JsonView(Views.DetailedMatch.class)
	private String winner;
	
	@JsonView(Views.DetailedMatch.class)
	private String pOneScore;
	
	@JsonView(Views.DetailedMatch.class)
	private String pTwoScore;
	
	@JsonView(Views.DetailedMatch.class)
	private int round;
	
	@OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Match match;
}
