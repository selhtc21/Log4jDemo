package fr.htc.library.dao.impl.map;

import java.util.ArrayList;
import java.util.List;

import fr.htc.library.dao.MemberDao;
import fr.htc.library.dao.db.DBMap;
import fr.htc.library.model.Member;

public class MemberDaoMapImpl implements MemberDao {

	@Override
	public List<Member> getAllMembers() {
		return  new ArrayList<>(DBMap.membersMap.values()) ;
	}

	@Override
	public Member getMemberByMatricule(String matricule) {
		
		return DBMap.membersMap.get(matricule);
		
		
	}

	@Override
	public Member save(Member member) {
		
		DBMap.membersMap.put(member.getMatricule(), member);
		return member;

	}

	@Override
	public void remove(String matricule) {
		DBMap.membersMap.remove(matricule);

	}

	@Override
	public void remove(Member member) {
		// TODO Auto-generated method stub

	}

}
