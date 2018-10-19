package br.com.financial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.financial.domain.Fuel;
import br.com.financial.repository.FuelRepository;


@RestController
public class FuelController {

	@Autowired
	private FuelRepository service;
	
	@GetMapping("/fuel")
	public Iterable<Fuel> getAll(){
		return service.findAll();
	}
	
}
