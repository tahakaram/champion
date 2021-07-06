package com.example.champion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.champion.entities.League;
import com.example.champion.repositories.LeagueRepository;

@Service
public class LeagueService {

	@Autowired
	LeagueRepository leagueRepository;

	public List<League> getLeague(String leagueName) {
		
		
		return leagueRepository.findAll();
	}
	
	
}
