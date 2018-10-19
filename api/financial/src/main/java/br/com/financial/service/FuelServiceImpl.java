package br.com.financial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.financial.repository.FuelRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FuelServiceImpl implements FuelService{

	@Autowired
	private FuelRepository repository;
	
	
}
