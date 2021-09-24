package fr.htc.library.cui;

import fr.htc.library.model.Member;
import fr.htc.library.services.BookService;
import fr.htc.library.services.BorrowService;
import fr.htc.library.services.MemberService;
import fr.htc.library.services.impl.BookServiceImpl;
import fr.htc.library.services.impl.BorrowServiceImpl;
import fr.htc.library.services.impl.MemberServiceImpl;

public class MyLibraryLuncher {

	static MemberService memberService = new MemberServiceImpl();
	static BookService bookService = new BookServiceImpl();
	static BorrowService borrowService = new BorrowServiceImpl();

	public static void main(String[] args) {
		// ** save Members and get all
		Member m = memberService.createMember("MOUCHEN", "Djamel", 30);

		// ** save Books abd get all books
		bookService.createBook("le Zahir", "Paolo", "2005");
		bookService.createBook("le Zahir", "Paolo", "2005");
		bookService.createBook("le Zahir", "Paolo", "2005");
		bookService.createBook("le Zahir", "Paolo", "2005");
		
		System.out.println(bookService.getBookList());
		

		//borrowService.checkOut("DM100", "PA05-10");
		
		//System.out.println(m);

	}

}
