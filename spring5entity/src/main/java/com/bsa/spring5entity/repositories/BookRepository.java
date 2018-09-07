package com.bsa.spring5entity.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bsa.spring5entity.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {}
