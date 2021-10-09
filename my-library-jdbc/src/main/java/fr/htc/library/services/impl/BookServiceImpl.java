package fr.htc.library.services.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import fr.htc.library.dao.BookDao;
import fr.htc.library.dao.impl.map.BookDaoMapImpl;
import fr.htc.library.model.Book;
import fr.htc.library.services.BookService;


public class BookServiceImpl implements BookService {
	BookDao bookDao = new BookDaoMapImpl();
//	BookDao bookDao = new BookDaoJdbcImpl();
	
	final static Logger logger = Logger.getLogger(BorrowServiceImpl.class);

	@Override
	public void createBook(String title, String author, int year) {

		if (title == null || title.isEmpty()) {
			logger.error("Opretaion canceled : Title is mandatory...");
			return;
		}
		if(author == null || author.isEmpty()) {
			logger.error("Opretaion canceled : author is mandatory...");
			return;
		}
		if(year < 1800 ) {
			logger.error("Opretaion canceled : year is mandatory...");
			return;
		}
		Book book = new Book(title, author, year);
		
		try {
			bookDao.save(book);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Book> getBookList() {
		return bookDao.getAllBooks();
	}

	@Override
	public void deleteBookByCote(String cote) {
		bookDao.remove(cote);

	}

	@Override
	public void deleteBook(Book book) {
		bookDao.remove(book.getCote());

	}

	@Override
	public Book findBookByCote(String cote) {
		if (cote == null || cote.isEmpty()) {
			logger.warn("Opretaion canceled : cote must be provided  " );
			return null;
		}
		return bookDao.getBookByCote(cote);

	}

}
