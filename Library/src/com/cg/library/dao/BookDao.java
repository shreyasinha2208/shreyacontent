package com.cg.library.dao;


import java.util.List;

import com.cg.library.exception.LibException;
import com.cg.library.model.Book;

public interface BookDao {
	void addBook(Book book) throws LibException;
	void updateBook(Book book) throws LibException;
	void delete( int bookCode) throws LibException;
	List<Book> getAllBooks();
	Book getBookById(int bookCode);
}
