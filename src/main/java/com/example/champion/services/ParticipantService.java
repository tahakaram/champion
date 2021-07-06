package com.example.champion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.champion.entities.Participant;
import com.example.champion.repositories.ParticipantRepository;

@Service
public class ParticipantService {

	@Autowired
	ParticipantRepository participantRepository;

	public void addParticipant(Participant participant) {
		participantRepository.save(participant);
	}

	public List<Participant> getAllParticipant() {
		return participantRepository.findAll();		
	}
	
	public Participant getParticipant(Long id) {
		return participantRepository.findById(id).get();		
	}
	
	public void removeParticipant(Long id) {
		participantRepository.deleteById(id);		
	}

}
