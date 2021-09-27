package fr.htc.library.dao;

import java.util.List;

import fr.htc.library.model.Member;

public interface MemberDao {

	List<Member> getAllMembers();

	Member getMemberByMatricule(String matricule);

	Member save(Member member);

	void remove(String matricule);

	void remove(Member member);

}
