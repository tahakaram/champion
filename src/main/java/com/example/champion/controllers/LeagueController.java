package com.example.champion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.champion.entities.League;
import com.example.champion.services.LeagueService;
import com.example.champion.views.Views;
import com.fasterxml.jackson.annotation.JsonView;

@RestController
public class LeagueController {

	@Autowired
	LeagueService leagueService;
	
	@JsonView(Views.League.class)
	@GetMapping("/getLeague/{leagueName}")
	public ResponseEntity<?> getLeague(@PathVariable(value="leagueName") String leagueName) {
		try {
			
			List<League> leagues = leagueService.getLeague(leagueName);
			  
			return new ResponseEntity<>(leagues, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
}
