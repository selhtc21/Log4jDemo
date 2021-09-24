package fr.htc.library.services.impl;

import fr.htc.library.model.Book;
import fr.htc.library.model.Member;
import fr.htc.library.services.BookService;
import fr.htc.library.services.BorrowService;
import fr.htc.library.services.MemberService;

public class BorrowServiceImpl implements BorrowService {

	MemberService memberService = new MemberServiceImpl();
	BookService bookService = new BookServiceImpl();

	@Override
	public boolean checkOut(String matricule, String cote) {

		// Load book by cote
		Book book = bookService.findBookByCote(cote);

		if (book == null) {
			System.out.println("Opretaion canceled : this book doesn't exist");
			return false;
		}

		// Load Member by matricule

		Member member = memberService.findMemberByMatricule(matricule);

		if (member == null) {
			System.out.println("Opretaion canceled : this member doesn't exist");
			return false;
		}

		// Check availability
		// check if can borrow

		if (member.canCheck() && book.isAvailable()) {
			member.addBook(book);
			book.setBorrower(member);
		}
		return true;
	}

	@Override
	public boolean checkIn(String matricule, String cote) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkIn(String cote) {
		// TODO Auto-generated method stub
		return false;
	}

}
