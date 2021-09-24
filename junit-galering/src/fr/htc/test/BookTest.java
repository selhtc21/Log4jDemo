package fr.htc.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class BookTest {
	private final String  title = "Nedjma";
	private final String author = "Kateb Yacine";
	private final int editionYear = 1985;
	private final String expectedCote = "KA85-10";
	private Book book;
	

//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}
//
//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}

	@Test
	public final void testBookStringStringInt() {
		book = new Book(title, author, editionYear);
		
		 assertNotNull("should not be null", book);
//		 assertEquals("", title, book.getTitle());
		 assertEquals("", author, book.getAuthor());
		 assertEquals("", editionYear, book.getEditionYear());
		 assertEquals("", expectedCote, book.getCote());
		 
		 Book book1 = new Book(title, author, editionYear);
		 assertTrue("Should increment the cote", book1.getCote().endsWith("11"));
	
		
	}

}
