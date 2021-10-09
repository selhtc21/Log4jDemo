package fr.htc.library.model;

import org.apache.log4j.Logger;

public class Book {

	final static Logger logger = Logger.getLogger(Book.class);
	static int sequence = 10;
	String cote;
	String title;
	String author;
	int year;
	Member borrower;
	

	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.cote = generateCote();
	}
	
	public Book() {
	}

	public void setCote(String cote) {
		this.cote = cote;
	}

	public boolean isAvailable() {
		if(this.borrower == null) {
			logger.info("book (" + this.cote + ") is available");
			return true;
		}
		logger.info("book (" + this.cote + ") is not available");
		return false;
	}
	


	/**
	 * Cette methode permet de g�n�rer la cote du livre sous le format AUAA-XXX
	 * 
	 * @return
	 */
	private String generateCote() {
		StringBuilder sb = new StringBuilder(this.author.substring(0, 2).toUpperCase());
		//sb.append(year.substring(2, 4));
		sb.append("-" + sequence++);

		return sb.toString();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCote() {
		return cote;
	}

	public Member getBorrower() {
		return borrower;
	}

	public void setBorrower(Member borrower) {
		this.borrower = borrower;
	}

	@Override
	public String toString() {
		return "Book [cote=" + cote + ", title=" + title + ", author=" + author + ", year=" + year 
				+ "\n - Borrower = " + borrower;
	}

}
