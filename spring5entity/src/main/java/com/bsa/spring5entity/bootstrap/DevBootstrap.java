package com.bsa.spring5entity.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.bsa.spring5entity.model.Author;
import com.bsa.spring5entity.model.Book;
import com.bsa.spring5entity.model.Publisher;
import com.bsa.spring5entity.repositories.AuthorRepository;
import com.bsa.spring5entity.repositories.BookRepository;
import com.bsa.spring5entity.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{
	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;

	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	private void initData() {
		
		Author eric = new Author("Eric","Evans");
		Publisher harperPublisher = new Publisher("Harper Collins", "D/2");
		Book ericBook = new Book("Domain Driven Design", "123456", harperPublisher);
		eric.getBooks().add(ericBook);
		authorRepository.save(eric);
		publisherRepository.save(harperPublisher);
		bookRepository.save(ericBook);
		
		Author rod = new Author("Rod","Johnson");
		Publisher worxPublisher = new Publisher("Worx", "MX6-D2");
		Book rodBook = new Book("JEE Developemnt", "78454", worxPublisher);
		rod.getBooks().add(rodBook);
		authorRepository.save(rod);
		publisherRepository.save(worxPublisher);
		bookRepository.save(rodBook);
	}
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initData();
	}

}
