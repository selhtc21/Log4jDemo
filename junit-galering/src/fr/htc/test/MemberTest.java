package fr.htc.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MemberTest {
	private final String fn = "Djamel";
	private final String ln = "MOUCHENE";
	private final String expectedMat = "DM100";
	private Member member;
	@Test
	public final void testMemberStringStringInt() {
	
		
	}
	
	@Test
	public final void testMemberStringString() {
		 member = new Member(fn, ln);
			
		 assertNotNull("should not be null", member);
		 assertEquals("", fn, member.getFirstName());
		 assertEquals("", ln, member.getLastName());
		 assertEquals("", expectedMat, member.getMatricule());
		 
		 Member member1 = new Member(fn, ln);
		 assertTrue("Should increment the matricule", member1.getMatricule().endsWith("101"));
		 
		 
		 
		
	}

}
