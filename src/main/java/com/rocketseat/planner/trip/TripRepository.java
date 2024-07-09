package com.rocketseat.planner.trip;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

/*Os arquivos de repository fazem queries em tabelas respectivas*/
/*Herda de JPARepository ditando que classe representa a tabela trips e sua chave primária */
/*JPARepository cria assinaturas automáticas que fazem queries */

public interface TripRepository extends JpaRepository<Trip, UUID>{
}
