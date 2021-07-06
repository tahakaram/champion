package com.example.champion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.champion.entities.Participant;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long>{

}
