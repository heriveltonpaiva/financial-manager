package br.com.financial.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.financial.domain.Fuel;

@Repository
public interface FuelRepository extends CrudRepository<Fuel, Long>, FuelRepositoryCustom{
	

}
