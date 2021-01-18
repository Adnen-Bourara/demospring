package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Service.PersonneService;
import com.example.demo.entity.Personne;
import com.example.demo.repo.PersonneRepo;

@Service
public class PersoneServiceImpl implements PersonneService {
	
	@Autowired
	private PersonneRepo pr;

	public Personne addPersonne(Personne personne) {

		return pr.save(personne);
	}

	public List<Personne> findAll() {
	
		return ( List<Personne>) pr.findAll();
	}

	public List<Personne> findPersonneByAdresse(String adr) {

		return ( List<Personne>) pr.findByAdresse(adr);
	}

	public Personne findavecutlisationId(Long id) {
		return pr.getOne(id) ;
	}

	public void deletePersonne(Long id) {
		try {
			pr.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			System.out.println("erreur delete");
		}		
	}

	public int countPersonneParAdresse(String adr) {
	List<Personne> listpersonne = pr.findByAdresse(adr);
		return listpersonne.size();
	}
 
}
