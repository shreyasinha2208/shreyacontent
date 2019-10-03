package com.cg.library.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.cg.library.exception.LibException;
import com.cg.library.model.Book;

public class BookDaoImpl implements BookDao {
	private Map<Integer, Book> booksMap;

	public BookDaoImpl() {
		booksMap = new TreeMap<>();
	}

	@Override
	public void addBook(Book book) throws LibException {
		if (book != null && !booksMap.containsKey(book.getBookCode())) {
			booksMap.put(book.getBookCode(), book);
		}
		else {
			throw new LibException("No Book or Duplicate book received");
		}
	}

	@Override
	public void updateBook(Book book) throws LibException {
		if(book!=null && !booksMap.containsKey(book.getBookCode())){
			booksMap.replace(book.getBookCode(), book);
		}
		else {
			throw new LibException("Error");
		}

	}

	@Override
	public void delete(int bookCode) throws LibException {
		if(booksMap.containsKey(bookCode)){
			booksMap.remove(bookCode);
		}
		else {
			throw new LibException("No such book found");
		}
	}

	@Override
	public List<Book> getAllBooks() {
		return new ArrayList<>(booksMap.values());
	
	}

	@Override
	public Book getBookById(int bookCode) {
		return booksMap.get(bookCode);
		
	}

}
