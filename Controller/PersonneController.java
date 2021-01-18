package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.PersonneService;
import com.example.demo.entity.Personne;

@RestController
public class PersonneController {
	
	@Autowired
	PersonneService ps;
	
	
	
@PostMapping("Personne/add")
	public	Object ajouterPersonne(@RequestBody Personne p)
{
		ps.addPersonne(p);

	
}
	

}
