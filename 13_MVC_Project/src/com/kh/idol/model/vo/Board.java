package com.kh.idol.model.vo;

public class Board {
	
	// 각 보드를 식별할 필드
	private int boardNo; // 보드 만들고, 수정, 삭제하는 것도 만들 수 있음. 일반적인 보드의 내용은 뻔함
	
	/*
	 * 제목
	 * 내용
	 * 작성자
	 * 작성일
	 * 
	 * 네가지 가지고는 각 게시글을 식별할 수 없음
	 * 다 똑같을 수 있음. 이것만으로 하나의 게시글을 식별할 수 없음 --> 특정 게시물을 수정하거나 삭제하는 기능을 구현하기 어려워짐
	 * 일반적인 게시판의 형태는 전부 노출되기보다는 제목정도만 나오고 선택해서 상세가 나오게됨 --> 하나만 선택하게 해줘야함 --> 식별자의 역할을 할 정수값이 필요함
	 * 
	 */
	
	private String boardTitle;
	private String boardContent;
	private String userId;
	private String createDate;
	
	public Board() {
		super();
	}
	
	public Board(int boardNo, String boardTitle, String boardContent, String userId, String createDate) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.userId = userId;
		this.createDate = createDate;
	}
	
	public int getBoardNo() {
		return boardNo;
	}
	
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	
	public String getBoardTitle() {
		return boardTitle;
	}
	
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	
	public String getBoardContent() {
		return boardContent;
	}
	
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getCreateDate() {
		return createDate;
	}
	
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	
	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", userId=" + userId + ", createDate=" + createDate + "]";
	}
	
}
