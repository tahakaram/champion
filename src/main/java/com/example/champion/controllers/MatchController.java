package com.example.champion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.champion.entities.MatchDetails;
import com.example.champion.services.MatchService;
import com.example.champion.views.Views;
import com.fasterxml.jackson.annotation.JsonView;

@RestController
public class MatchController {

	@Autowired
	MatchService matchService;

	@JsonView(Views.League.class)
	@GetMapping("/getRoundFromLeague/{leagueName}/{id}")
	public ResponseEntity<?> getRoundFromLeague(@PathVariable(value="leagueName") String leagueName, @PathVariable(value="id") int roundId) {
		try {
			matchService.getRoundFromLeague(leagueName, roundId);
			return new ResponseEntity<>("TAHA KARAM", HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>("TAHA KARAM", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@JsonView(Views.DetailedMatch.class)
	@GetMapping("/getRoundFromAllLeagues/{id}")
	public ResponseEntity<?> getRoundFromAllLeagues(@PathVariable(value="id") int roundId) {
		try {
			matchService.getRoundFromAllLeagues(roundId);
			return new ResponseEntity<>("TAHA KARAM", HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>("TAHA KARAM", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	@PostMapping("/updateMatchResult")
	public ResponseEntity<?> updateMatchResult(@PathVariable int winnerParticipantID, @RequestBody MatchDetails matchDetails) {
		try {
			matchService.updateMatchResult(winnerParticipantID);

			return new ResponseEntity<>("TAHA KARAM", HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>("TAHA KARAM", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
