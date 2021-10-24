package com.roni.bookservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roni.bookservice.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	
}
