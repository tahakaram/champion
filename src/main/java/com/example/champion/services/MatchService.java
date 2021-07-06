package com.example.champion.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.champion.repositories.MatchRepository;

@Service
public class MatchService {

	@Autowired
	MatchRepository matchRepository;
	
	public ResponseEntity<?> getRoundFromLeague(String leagueName, int roundId){
		return null;

	}
	
	public ResponseEntity<?> getRoundFromAllLeagues(int roundId){
		return null;
		
	}
	
	public ResponseEntity<?> updateMatchResult(int winnerParticipantID){
		return null;
	}
	
}
