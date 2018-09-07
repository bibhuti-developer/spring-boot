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