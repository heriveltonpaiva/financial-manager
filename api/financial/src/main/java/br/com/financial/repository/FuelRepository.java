package br.com.financial.repository;

import org.springframework.stereotype.Repository;

import br.com.financial.arq.AbstractRepository;
import br.com.financial.domain.Fuel;

@Repository
public interface FuelRepository extends AbstractRepository<Fuel>{}
