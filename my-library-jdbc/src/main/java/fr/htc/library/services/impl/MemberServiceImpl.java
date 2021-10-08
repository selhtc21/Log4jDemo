package fr.htc.library.services.impl;

import java.util.List;

import org.apache.log4j.Logger;

import fr.htc.library.dao.MemberDao;
import fr.htc.library.dao.impl.map.MemberDaoMapImpl;
import fr.htc.library.model.Member;
import fr.htc.library.services.MemberService;

public class MemberServiceImpl implements MemberService {
	MemberDao memberDao = new MemberDaoMapImpl();
	final static Logger logger = Logger.getLogger(BorrowServiceImpl.class);

	@Override
	public Member createMember(String lastName, String firstName, int age) {

		if (age < 18) {
			logger.info("You are not allowed to subscribe, must have at least 18 years old");
			return null;
		}

		Member member = new Member(firstName, lastName, age);

		return memberDao.save(member);

	}

	@Override
	public List<Member> getMemberList() {

		return memberDao.getAllMembers();
	}

	@Override
	public void deleteMemberByMatricule(String matricule) {
		memberDao.remove(matricule);
	}

	@Override
	public void deleteMember(Member Member) {
		// TODO Auto-generated method stub

	}

	@Override
	public Member findMemberByMatricule(String matricule) {
		
		if (matricule == null || matricule.isEmpty()) {
			logger.warn("Opretaion canceled : this member doesn't exist : " + matricule);
			return null;
		}
		
		return memberDao.getMemberByMatricule(matricule);
		
	}

}
