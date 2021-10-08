package fr.htc.library.services.impl;

import org.apache.log4j.Logger;

import fr.htc.library.model.Book;
import fr.htc.library.model.Member;
import fr.htc.library.services.BookService;
import fr.htc.library.services.BorrowService;
import fr.htc.library.services.MemberService;

public class BorrowServiceImpl implements BorrowService {

	final static Logger logger = Logger.getLogger(BorrowServiceImpl.class);

	MemberService memberService = new MemberServiceImpl();
	BookService bookService = new BookServiceImpl();

	@Override
	public boolean checkOut(String matricule, String cote) {

		// Load book by cote
		Book book = bookService.findBookByCote(cote);

		if (book == null) {
			logger.warn("Opretaion canceled : this book doesn't exist : " + cote);
			return false;
		}

		// Load Member by matricule

		Member member = memberService.findMemberByMatricule(matricule);

		if (member == null) {
			logger.warn("Opretaion canceled : this member doesn't exist : " + matricule);
			return false;
		}

		// Check availability
		// check if can borrow
		try {
			if (member.canCheck() && book.isAvailable()) {
				member.addBook(book);
				book.setBorrower(member);
				logger.info("Book successfully checked out : (cote, matricule) = (" + cote + ", " + matricule + ")" );
				throw new Exception("C'est moi qui est à l'origine");
			}
		} catch (Exception e) {
			logger.error("Unknown exception occues when check ed out book  : (cote, matricule) = (" + cote + ", " + matricule + ")", e);
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
