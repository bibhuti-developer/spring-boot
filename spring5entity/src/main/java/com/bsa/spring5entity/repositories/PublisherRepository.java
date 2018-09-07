package com.bsa.spring5entity.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bsa.spring5entity.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {}
