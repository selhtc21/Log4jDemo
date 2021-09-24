package fr.htc.library.services.impl;

import java.sql.SQLException;
import java.util.List;

import fr.htc.library.dao.BookDao;
import fr.htc.library.dao.impl.jdbc.BookDaoJdbcImpl;
import fr.htc.library.model.Book;
import fr.htc.library.services.BookService;

public class BookServiceImpl implements BookService {
//	BookDao bookDao = new BookDaoMapImpl();
	BookDao bookDao = new BookDaoJdbcImpl();

	@Override
	public void createBook(String title, String author, String year) {

		if (title == null || title.isEmpty()) {
			System.err.println("Title is mandatory...");
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
		if (cote == null) {
			System.out.println("cote must be provided");
			return null;
		}
		return bookDao.getBookByCote(cote);

	}

}
