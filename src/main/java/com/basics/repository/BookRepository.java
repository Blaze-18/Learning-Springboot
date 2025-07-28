package com.basics.repository;


import com.basics.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    // Custom query method example
    Book findByIsbn(String isbn);
}
