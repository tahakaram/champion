package com.example.champion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.champion.entities.League;

public interface LeagueRepository extends JpaRepository<League, Long>{

}
