package com.smhrd.mapper;

import java.util.List;

import com.smhrd.domain.Member;

public interface MemberMapper {

	// 회원가입
	public int insertMember(Member member);

	// 로그인 기능
	public Member selectMember(Member member);
	
	// 조회 기능
	public List<Member> memberList();

}
