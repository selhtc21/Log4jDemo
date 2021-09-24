package fr.htc.library.dao.db;

import java.util.HashMap;
import java.util.Map;

import fr.htc.library.model.Book;
import fr.htc.library.model.Member;

public class DBMap {

	public static Map<String, Member> membersMap = new HashMap<>();
	public static Map<String, Book> booksMap = new HashMap<>();
}
