package com.rocketseat.planner.activities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rocketseat.planner.trip.Trip;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository repository;

    public ActivityResponse registerActivity(ActivityRequestPayload payload, Trip trip){
        Activity newActivity = new Activity(payload.title(), payload.occursAt(), trip);

        this.repository.save(newActivity);       
        
        return new ActivityResponse(newActivity.getId());
    }
}
