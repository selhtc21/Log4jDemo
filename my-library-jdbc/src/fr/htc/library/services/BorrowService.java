package fr.htc.library.services;

public interface BorrowService {

	boolean checkOut(String matricule, String cote);

	boolean checkIn(String matricule, String cote);

	boolean checkIn(String cote);

}
