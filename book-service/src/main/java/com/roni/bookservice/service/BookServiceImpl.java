package com.roni.bookservice.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roni.bookservice.model.Book;
import com.roni.bookservice.repository.BookRepository;

/**
 * Book Service Implementation
 *
 * @author Md. Josim Uddin Roni
 * @version 1.0
 * @since 24-10-2021
 */
@Service
public class BookServiceImpl implements BookService  {
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> findAllBooks() {
		
		return bookRepository.findAll();
	}

	@Override
	public Book findBook(Long bookId) {
		return bookRepository.findById(bookId).get();
	}

	@Override
	public Book insertBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public Book deleteBook(Long bookId) {
		Book book = bookRepository.findById(bookId).get();
		bookRepository.deleteById(bookId);
		
		return book;
	}

	@Override
	public Book updateBook(Book book, Long bookId) {
		
		return bookRepository.save(book);
	}

	@Override
	public Book updateBook(Map<String, String> updates, Long bookId) {
		Book book = bookRepository.findById(bookId).get();
		book.title = updates.get("title");
		
		return bookRepository.save(book);
	}

}
