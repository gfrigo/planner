package com.rocketseat.planner.participant;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rocketseat.planner.trip.Trip;

@Service
public class ParticipantService {
    
    @Autowired
    private ParticipantRepository repository;

    public void registerParticipantsToTrip(List<String> paticipantsToEnvite, Trip trip){
        List<Participant> participants = paticipantsToEnvite.stream().map(email -> new Participant(email, trip)).toList();
        
        this.repository.saveAll(participants);
        
        System.out.println(participants.get(0).getId());
    }

    public void triggerConfirmationEmailToParticipants(UUID tripId){}

}
