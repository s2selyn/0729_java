package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	
	// ArrayList 객체 생성
	List list = new ArrayList();
	
	// 리스트 마지막에 값 저장 메소드
	public int addList(Music music) {
		
		// 마지막 리스트에 객체 저장, 1 리턴
		list.add(music);
		return 1;
		
	}
	
	// 리스트 첫 번째에 값 저장 메소드
	public int addAtZero(Music music) {
		
		// 첫 번째 리스트에 객체 저장, 1 리턴
		list.addFirst(music);
		return 1;
		
	}
	
	// 모든 리스트를 반환하는 메소드
	public List printAll() {
		
		// List 반환
		return list;
		
	}
	
	// 곡 명을 검색하는 메소드
	public Music searchMusic(String title) {
		
		// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 리턴, 없으면 null 리턴
		for(int i = 0; i < list.size(); i++) {
			
			Music music = (Music)list.get(i);
			
			if(title.equals(music.getTitle())) {
				return music;
			}
			
		}
		
		return null;
		
	}
	
	// 곡 명으로 찾아 삭제하는 메소드
	public Music removeMusic(String title) {
		
		// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 삭제, 없으면 null 리턴
		for(int i = 0; i < list.size(); i++) {
			
			Music music = (Music)list.get(i);
			
			if(title.equals(music.getTitle())) {
				return music;
			}
			
		}
		return null;
		
	}
	
	// 곡 명으로 찾아 내용을 수정하는 메소드
	public Music setMusic(String title, Music music) {
		
		// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 수정, 없으면 null 리턴
		for(int i = 0; i < list.size(); i++) {
			
			Music searchMusic = (Music)list.get(i);
			
			if(title.equals(searchMusic.getTitle())) {
				
				this.setMusic(title, music);
				return searchMusic;
				
			}
			
		}
		
		return null;
		
	}
	
	// 곡 명 오름차순 정렬하는 메소드
	public int ascTitle() {
		
		// 리스트 곡 명 오름차순 정렬, 제목이 같으면 가수 명으로 오름차순 정렬, 1 리턴
		return 1;
		
	}
	
	// 가수 명을 내림차순 정렬하는 메소드
	public int descSinger() {
		
		// 리스트 가수 명 내림차순 정렬, 1 리턴
		return 1;
		
	}

}
