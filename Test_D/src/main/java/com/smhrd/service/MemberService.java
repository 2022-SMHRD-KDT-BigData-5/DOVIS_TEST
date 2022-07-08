package com.smhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.domain.Member;
import com.smhrd.mapper.MemberMapper;

@Service
public class MemberService {

	// 컨트롤러 대신 로직 짜는 공간
	@Autowired
	MemberMapper mapper;

	// 회원가입
	public void insertMember(Member member) {
		mapper.insertMember(member);
	}

	// 로그인 기능
	public Member selectMember(Member member) {

		Member loginVO = mapper.selectMember(member);

		return loginVO;
	}

	// 조회 기능
	public List<Member> memberList() {

		List<Member> mlist = mapper.memberList();

		return mlist;
	}

}
