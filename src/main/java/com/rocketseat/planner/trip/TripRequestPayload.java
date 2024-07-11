package com.rocketseat.planner.trip;

import java.util.List;

/*Record: Objetos que não são alterados*/
/*Cria Getters e Setters de forma facilitada*/
public record TripRequestPayload (String destination, String starts_at, String ends_at, List<String> emails_to_invite, String owner_name, String owner_email){
}
