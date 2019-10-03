package com.cg.library.service;

import java.util.List;

import com.cg.library.dao.BookDao;
import com.cg.library.dao.BookDaoImpl;
import com.cg.library.exception.LibException;
import com.cg.library.model.Book;

public class BookServiceImpl implements BookService {
	private BookDao bookDao;
	
	public BookServiceImpl() {
		bookDao= new BookDaoImpl();
	}
	public boolean isValidBook(Book book){
		return true;
	}
	@Override
	public void addBook(Book book) throws LibException {
		if(isValidBook(book)){
			bookDao.addBook(book);
		}
		else{
			throw new LibException("Book is not valid");
		}
	}

	@Override
	public void updateBook(Book book) throws LibException {
		if(isValidBook(book)){
			bookDao.updateBook(book);
		}
		else{
			throw new LibException("Book is not valid");
		}
		
	}

	@Override
	public void delete(int bookCode) throws LibException {
		bookDao.delete(bookCode);
		
	}

	@Override
	public List<Book> getAllBooks() {
		
		return bookDao.getAllBooks();
	}

	@Override
	public Book getBookById(int bookCode) {
		
		return bookDao.getBookById(bookCode);
	}

	@Override
	public List<Book> getAllBooksOrderedByBookCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBooksOrderedByPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBooksOrderedByTitle() {
		// TODO Auto-generated method stub
		return null;
	}
}
