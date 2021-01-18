package com.example.demo.Service;

import java.util.List;

import com.example.demo.entity.Personne;

public interface PersonneService {
	
Personne	addPersonne(Personne personne);
List<Personne> findAll();
List<Personne>  findPersonneByAdresse(String adr);
Personne findavecutlisationId(Long id);
void deletePersonne(Long id);
int countPersonneParAdresse(String adr);

}
