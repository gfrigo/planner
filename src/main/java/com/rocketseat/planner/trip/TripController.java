package com.rocketseat.planner.trip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rocketseat.planner.participant.ParticipantService;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/trips")
public class TripController {
    
    @Autowired
    private ParticipantService participantService;

    @Autowired
    private TripRepository repository;

    @PostMapping
    public ResponseEntity<String> createTrip(@RequestBody TripRequestPayload payload){
        Trip newTrip = new Trip(payload);

        this.repository.save(newTrip);
        
        this.participantService.registerParticipantsToTrip(payload.emails_to_envite(), newTrip.getId());

        return ResponseEntity.ok("Sucesso");
    }
}
