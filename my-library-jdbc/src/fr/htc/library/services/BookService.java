package fr.htc.library.services;

import java.util.List;

import fr.htc.library.model.Book;

public interface BookService {

	void createBook(String title, String author, String year);

	List<Book> getBookList();

	void deleteBookByCote(String cote);
       
	void deleteBook(Book book);
	
	Book findBookByCote(String cote);
	
}
