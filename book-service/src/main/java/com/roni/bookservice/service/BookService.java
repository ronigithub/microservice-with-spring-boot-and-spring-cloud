package com.roni.bookservice.service;

import java.util.List;
import java.util.Map;

import com.roni.bookservice.model.Book;

/**
 * {@link Book} Service
 * @author Md. Josim Uddin Roni
 * @version 1.0
 * @since 24-10-2021
 */
public interface BookService {

    /**
     * Retrieve all books details
     *
     * @return List<Book> This returns list of book
     */
    List<Book> findAllBooks();
    /**
     * Retrieve book details
     * @param bookId
     * @return Book
     */
    Book findBook(Long bookId);

    /**
     * Insert new Book information
     * @param book
     * @return Book
     */
    Book insertBook(Book book);

    /**
     * Delete Resource
     * @param bookId
     * @return Book
     */
    Book deleteBook(Long bookId);

    /**
     * Update entire book resource
     * @param book
     * @param bookId
     * @return Book
     */
    Book updateBook(Book book, Long bookId);

    /**
     * 	Update partial resource
     * @param updates
     * @param bookId
     * @return Book
     */
    Book updateBook(Map<String, String> updates, Long bookId);

}
