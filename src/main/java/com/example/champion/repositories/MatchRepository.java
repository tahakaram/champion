package com.example.champion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.champion.entities.Match;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long>{

}
