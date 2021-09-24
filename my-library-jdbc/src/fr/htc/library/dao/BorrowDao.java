package fr.htc.library.dao;

import fr.htc.library.model.Book;
import fr.htc.library.model.Member;

public interface BorrowDao {

	boolean checkOut(Member member, Book book);

	boolean checkIn(Member member, Book book);

}
