package fr.htc.library.dao.impl.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.htc.library.dao.BookDao;
import fr.htc.library.model.Book;
import fr.htc.library.utils.ConnectionUtils;

public class BookDaoJdbcImpl implements BookDao {

	@Override
	public List<Book> getAllBooks() {
		List<Book> result = new ArrayList<>();

		Connection conn = ConnectionUtils.getConnection();
		String query = "select * from book";
		try {
			Statement stat = conn.createStatement();

			ResultSet rs = stat.executeQuery(query);

			while (rs.next()) {
				Book b = new Book();
				b.setCote(rs.getString(1));
				b.setTitle(rs.getString(2));
				b.setAuthor(rs.getString(3));
				b.setYear(rs.getString(4));
				result.add(b);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return result;
	}

	@Override
	public Book getBookByCote(String cote) {
		return null;
	}

	@Override
	public void save(Book book) throws SQLException {
		Connection conn = ConnectionUtils.getConnection();
		String query = "INSERT INTO BOOK VALUES('" + book.getCote() + "', '" + book.getTitle() + "', '"
				+ book.getAuthor() + "', '" + book.getYear() + "')";

		Statement stat = conn.createStatement();

		int status = stat.executeUpdate(query);

		if (status != 1) {
			System.out.println("Book not inserted");
		}
		System.out.println("OK");

	}

	@Override
	public void remove(String cote) {

	}

	@Override
	public void remove(Book book) {

	}

	@Override
	public List<Book> getAvailableBooks() {
		return null;
	}

}
