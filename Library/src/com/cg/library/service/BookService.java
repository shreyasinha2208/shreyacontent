package com.cg.library.service;

import java.util.List;

import com.cg.library.exception.LibException;
import com.cg.library.model.Book;

public interface BookService {
	void addBook(Book book) throws LibException;
	void updateBook(Book book) throws LibException;
	void delete( int bookCode) throws LibException;
	List<Book> getAllBooks();
	Book getBookById(int bookCode);
	List<Book> getAllBooksOrderedByBookCode();
	List<Book> getAllBooksOrderedByPrice();
	List<Book> getAllBooksOrderedByTitle();
	

}
