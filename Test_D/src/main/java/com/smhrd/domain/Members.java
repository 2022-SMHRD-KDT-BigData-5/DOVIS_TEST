package com.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@Data // 기본 메소드(Getter/Setter/toString)생성
@AllArgsConstructor // 모든 필드를 요소로 갖는 생성자 생성
@NoArgsConstructor // 디폴트 생성자 생성
public class Members {
	
	private int member_no;
	
	@NonNull
	private String member_id;
	
	private String member_pw;
	
	private String email;
	
	private String member_name;
	
	private String member_dept;
	
	private String member_pos;


}
