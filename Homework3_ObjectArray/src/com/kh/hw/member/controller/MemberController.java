package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	
	private Member[] m = new Member[SIZE];
	
	public static final int SIZE = 10;
	
	// static 블럭, 정적 초기화, 클래스가 로딩될때 딱 한번만 수행됨
	static{
		
	}
	
	// 초기화 블럭(필드와 생성자블럭 사이에 블럭 추가하면됨
	// 여러개의 생성자가 존재할 때(생성자 오버로드) 어떤 생성자를 호출하든지 생성자 이전에 초기화가 수행됨
	{
		m[0] = new Member("admin", "관리자", "ad1234", "admin@kh.com", 'M', 100);
	}
	
	public MemberController() {}
	
	public Member[] getM() {
		return m;
	}
	
	// 현재 존재하는 멤버 수
	public int existMemberNum() {
		
		int count = 0;
		
		/*
		if(m[0] != null) count++;
		if(m[1] != null) count++;
		if(m[2] != null) count++;
		 */
		
		for(int i = 0; i < m.length; i++) {
			
			if(m[i] != null) {
				count++;
			}
			
		}
		
		return count;
		
	}
	
	// 아이디 중복확인 하는 메소드
	public boolean checkId(String inputId) {
		
		/*
		if(m[0].getId().equals(inputId)) {
			return true;
		}
		if(m[1].getId().equals(inputId)) {
			
		}
		if(m[2].getId().equals(inputId)) {
			
		}
		*/
		
		for(int i = 0; i < m.length; i++) {
			
			if(m[i] != null && m[i].getId().equals(inputId)) {
				return true;
			}
			
		}
		
		return false;
	}
	
	// Member객체를 객체배열에 저장하는 메소드
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		
		for(int i = 0; i < m.length; i++) {
			
			if(m[i] == null) {
				
				m[i] = new Member(id, name, password, email, gender, age);
				break; // 또는 return;
				
			}
			
		}
		
	}
	
	// id로 회원을 조회하는 메소드
	public Member searchId(String id) {
		
		for(int i = 0; i < m.length; i++) {
			
			if(m[i] != null && m[i].getId().equals(id)) {
				return m[i];
			}
			
		}
		
		return null;
		
	}
	
	// 이름으로 회원을 조회하는 메소드
	public Member[] searchName(String name) {
		
		int count = existMemberNum();
		Member[] members = new Member[count]; // 등록된 회원수만큼으로 정의하기
		
		int index = 0;
		for(int i = 0; i < m.length; i++) {
			
			if(m[i] != null && m[i].getName().equals(name)) {
				members[index++] = m[i];
			}
			
		}
		
		return members; // 동명이인이 있을 수 있음... 여러명이면 다 돌려주고싶다...
		
	}
	
	// 이메일로 회원을 조회하는 메소드
	public Member searchEmail(String email) {
		
		for(int i = 0; i < m.length; i++) {
			
			if(m[i] != null && m[i].getEmail().equals(email)) {
				return m[i];
			}
			
		}
		
		return null;
	}
	
	// 비밀번호 변경 메소드
	public boolean updatePassword(String id, String thisPassword, String updatePassword) {
		
		for(int i = 0; i < m.length; i++) {
			
			if(m[i] != null && m[i].getId().equals(id) && m[i].getPassword().equals(thisPassword)) {
				
				m[i].setPassword(updatePassword);
				return true;
				
			}
			
		}
		
		return false;
		
	}
	
	// 이름 변경 메소드
	public boolean updateName(String id, String name) {
		return true;
	}
	
	// 이메일 변경 메소드
	public boolean updateEmail(String id, String email) {
		return true;
	}
	
	// 한 회원만 삭제하는 메소드
	public boolean delete(String id) {
		return true;
	}
	
	// 전체 회원을 삭제하는 메소드
	public void delete() {
		
	}
	
	// Memeber객체 반환 메소드
	public Member[] printAll() {
		return m;
	}

}
