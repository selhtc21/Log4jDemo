package fr.htc.library.model;

import java.util.ArrayList;
import java.util.List;

public class Member {

	private static int sequence = 100;

	String matricule;
	String firstName;
	String lastName;
	int age;
	List<Book> borrowedBooks = new ArrayList<>();

	public Member(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.matricule = generateMatricule();
	}

	/**
	 * 
	 * @return
	 */
	private String generateMatricule() {
		StringBuilder sb = new StringBuilder(firstName.substring(0, 1).toUpperCase());
		sb.append(lastName.substring(0, 1).toUpperCase());
		sb.append(sequence++);

		return sb.toString();
	}

	public boolean canCheck() {
		if (borrowedBooks.size() < 3) {

			return true;
		}
		return false;
	}

	public void addBook(Book book) {
		this.borrowedBooks.add(book);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMatricule() {
		return matricule;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Member [matricule=" + matricule + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age);
		sb.append("\n Borrowed books : ");
		for (Book book : borrowedBooks) {
			sb.append("\t -" + book);
		}
		return sb.toString();
	}

}
