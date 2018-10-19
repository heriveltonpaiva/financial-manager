package br.com.financial.arq;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AbstractRepository<T> extends CrudRepository<T, Long>, PagingAndSortingRepository<T, Long>{}
