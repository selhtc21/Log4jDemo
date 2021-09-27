package fr.htc.library.services;

import java.util.List;

import fr.htc.library.model.Member;

public interface MemberService {
	Member createMember(String lastName, String firstName, int age);

	List<Member> getMemberList();

	void deleteMemberByMatricule(String matricule);

	void deleteMember(Member member);
	
	Member findMemberByMatricule(String matricule);
}
