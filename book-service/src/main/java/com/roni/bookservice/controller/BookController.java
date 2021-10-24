package com.roni.bookservice.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roni.bookservice.model.Book;
import com.roni.bookservice.service.BookService;

/**
 * {@link Book} Resource Controller
 * Find all books
 * Find book details,
 * Insert new book
 * Delete book
 * Update book
 *
 * @author Md. Josim Uddin Roni
 * @version 1.0
 * @since 24-10-2021
 */

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookService bookService;

	/**
	 * Retrieve all books details
	 * 
	 * @return List<Book> This returns list of book
	 */
	@GetMapping
	public List<Book> findAllBooks() {
		return bookService.findAllBooks();
	}

	/**
	 * Retrieve book details
	 * @param bookId
	 * @return Book
	 */
	@GetMapping("/{bookId}")
	public Book findBook(@PathVariable Long bookId) {
		return bookService.findBook(bookId);
	}

	/**
	 * Insert new Book information
	 * @param book  
	 * @return Book 
	 */
	@PostMapping
	public Book insertBook(@RequestBody Book book)
	{
		return bookService.insertBook(book);
	}

	/**
	 * Delete Book Resource
	 * @param bookId
	 * @return Book
	 */
	@DeleteMapping("/{bookId}")
	public Book deleteBook(@PathVariable Long bookId)
	{
		return bookService.deleteBook(bookId);
	}
	
	/**
	 * Update entire book information
	 * @param book
	 * @param bookId
	 * @return Book
	 */
	@PutMapping("/{bookId}")
	public Book updateBook(@RequestBody Book book, @PathVariable Long bookId)
	{
		return bookService.updateBook(book, bookId);
	}
	
	/**
	 * 	Update partial information
	 * @param updates
	 * @param bookId
	 * @return Book
	 */
	@PatchMapping("/{bookId}")
	public Book updateBook(@RequestBody Map<String, String> updates,@PathVariable Long bookId)
	{
		return bookService.updateBook(updates, bookId);
	}
	
}
