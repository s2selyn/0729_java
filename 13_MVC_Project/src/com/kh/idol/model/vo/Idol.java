package com.kh.idol.model.vo;

public class Idol {
	
	// 정보는 나무위키에서 따와서 필드 짜기도 쉬움
	// 본명, 포지션, 전투 스킬 가져와야지
	private String name;
	private String position;
	private String skill;
	private String image;

	public Idol() {
		super();
	}
	
	public Idol(String name, String position, String skill) {
		super();
		this.name = name;
		this.position = position;
		this.skill = skill;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getSkill() {
		return skill;
	}
	
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	@Override
	public String toString() {
		return "Idol [name=" + name + ", position=" + position + ", skill=" + skill + "]";
	}
	
}
