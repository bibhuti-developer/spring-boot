package com.bsa.spring5entity.repositories;

import org.springframework.data.repository.CrudRepository;
import com.bsa.spring5entity.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {}
