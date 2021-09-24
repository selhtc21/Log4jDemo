package fr.htc.library.dao.impl.map;

import java.util.ArrayList;
import java.util.List;

import fr.htc.library.dao.BookDao;
import fr.htc.library.dao.db.DBMap;
import fr.htc.library.model.Book;

public class BookDaoMapImpl implements BookDao {

	@Override
	public List<Book> getAllBooks() {
		return  new ArrayList<>(DBMap.booksMap.values()) ;
	}

	@Override
	public Book getBookByCote(String cote) {
		
		return DBMap.booksMap.get(cote); 
	}

	@Override
	public void save(Book book) {
		DBMap.booksMap.put(book.getCote(), book);
	}

	@Override
	public void remove(String cote) {
		DBMap.booksMap.remove(cote);

	}

	@Override
	public void remove(Book book) {
		this.remove(book.getCote());	

	}

	@Override
	public List<Book> getAvailableBooks() {
		// TODO Auto-generated method stub
		return null;
	}

}
