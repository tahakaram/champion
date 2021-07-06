package com.example.champion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.champion.entities.Participant;
import com.example.champion.services.ParticipantService;

@RestController
public class ParticipantController {

	@Autowired
	ParticipantService participantService;

	@PostMapping("/addParticipant")
	public ResponseEntity<?> addParticipant(@RequestBody Participant participant) {
		try {
			participantService.addParticipant(participant);

			return new ResponseEntity<>(HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/getAllParticipant")
	public ResponseEntity<?> getAllParticipant() {
		try {
			List<Participant> participants = participantService.getAllParticipant();
			
			return new ResponseEntity<>(participants, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/getGroupsOfParticipant")
	public ResponseEntity<?> getGroupsOfParticipant() {
		try {

		} catch (Exception e) {
			return new ResponseEntity<>("TAHA KARAM", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>("TAHA KARAM", HttpStatus.OK);

	}

	@GetMapping("/getParticipant/{id}")
	public ResponseEntity<?> getParticipant(@PathVariable(value="id") Long participantID) {
		try {
			Participant participant = participantService.getParticipant(participantID);

			return new ResponseEntity<>(participant, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	@DeleteMapping("/removeParticipant/{id}")
	public ResponseEntity<?> removeParticipant(@PathVariable(value="id") Long participantID) {
		try {
			participantService.removeParticipant(participantID);

			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
