package br.com.financial.arq;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public abstract class FinancialController<T> implements AbstractController<T> {

	@Autowired
	private AbstractRepository<T> repository;
	
	@GetMapping("/")
	public Iterable<T> findAll() {
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<T> findById(@PathVariable Long id) {
		return repository.findById(id);
	}
	
	@PostMapping("/")
	public void save(T entity) {
		repository.save(entity);
	}
	
	@PutMapping("/{id}")
	public void update(T entity) {
		repository.save(entity);
	}
	
	@DeleteMapping("/{id}")
	public void delete(T entity) {
		repository.delete(entity);
	}
	
}
