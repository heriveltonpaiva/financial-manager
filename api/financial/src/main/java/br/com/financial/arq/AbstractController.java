package br.com.financial.arq;

import java.util.Optional;

public interface AbstractController<T> {

	public Iterable<T> findAll();
	
	public Optional<T> findById(Long id);
	
	public void save(T entity);
	
	public void update(T entity);
	
	public void delete(T entity);
	
}
