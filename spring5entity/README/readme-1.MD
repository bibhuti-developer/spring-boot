# Entity Mapping
1. Author
   ```java
     @Entity  
     public class Author {  
      @Id  
      @GeneratedValue(strategy = GenerationType.AUTO)  
      private Long id;  
      @ManyToMany(mappedBy = "authors")  
      private Set<Book> books  = new HashSet<>();  
    }
   ```
2. Book
   ```java
    @Entity
    public class Book {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @ManyToMany
        @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
        private Set<Author> authors = new HashSet<>();
    }
   ```   

# CRUD 
```
public interface AuthorRepository extends CrudRepository<Author, Long> {}
public interface BookRepository extends CrudRepository<Book, Long> {}
```

# Bootstrap for dev environment
```java
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    
    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        super();
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    private void initData() {
        Author eric = new Author("Eric","Evans");
        Book ericBook = new Book("Domain Driven Design", "123456", "Harper Collins");
        eric.getBooks().add(ericBook);
        authorRepository.save(eric);
        bookRepository.save(ericBook);
        
        Author rod = new Author("Rod","Johnson");
        Book rodBook = new Book("JEE Developemnt", "78454", "Worx");
        rod.getBooks().add(rodBook);
        authorRepository.save(rod);
        bookRepository.save(rodBook);
    }
    
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

}
```
# H2 Database
Url : `http://localhost:8080/h2-console/` 

### application.properties
```properties
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

```