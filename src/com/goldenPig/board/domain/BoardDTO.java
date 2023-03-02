package com.goldenPig.board.domain;

public class BoardDTO {
	private Long boardId;
	private Long memberId;
	private String boardTitle;
	private String boardContent;
	private String boardRegisterDate;
	private String boardUpdateDate;
	private Long ReadCount;
	private Long boardImgId;
	private String boardImgPath;
	private String boardImgName;
	private Long boardLikeId;
	private Long replyId;
	private String replyContent;
	private String replyRegisterDate;
	private String replyUpdateDate;
	private Long tagId;
	private String tagName;
	private Long favoriteId;
	private Long answerId;
	private String answerTitle;
	private String answerContent;
	private String answerRegisterDate;
	private String answerUpdateDate;
	private Long answerLikeId;
	
	

	
	
	public BoardDTO() {;}





	public Long getBoardId() {
		return boardId;
	}





	public void setBoardId(Long boardId) {
		this.boardId = boardId;
	}





	public Long getMemberId() {
		return memberId;
	}





	public void setMemberId(Long memberId) {
		this.memberId = memberId;
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





	public String getBoardRegisterDate() {
		return boardRegisterDate;
	}





	public void setBoardRegisterDate(String boardRegisterDate) {
		this.boardRegisterDate = boardRegisterDate;
	}





	public String getBoardUpdateDate() {
		return boardUpdateDate;
	}





	public void setBoardUpdateDate(String boardUpdateDate) {
		this.boardUpdateDate = boardUpdateDate;
	}





	public Long getReadCount() {
		return ReadCount;
	}





	public void setReadCount(Long readCount) {
		ReadCount = readCount;
	}





	public Long getBoardImgId() {
		return boardImgId;
	}





	public void setBoardImgId(Long boardImgId) {
		this.boardImgId = boardImgId;
	}





	public String getBoardImgPath() {
		return boardImgPath;
	}





	public void setBoardImgPath(String boardImgPath) {
		this.boardImgPath = boardImgPath;
	}





	public String getBoardImgName() {
		return boardImgName;
	}





	public void setBoardImgName(String boardImgName) {
		this.boardImgName = boardImgName;
	}





	public Long getBoardLikeId() {
		return boardLikeId;
	}





	public void setBoardLikeId(Long boardLikeId) {
		this.boardLikeId = boardLikeId;
	}





	public Long getReplyId() {
		return replyId;
	}





	public void setReplyId(Long replyId) {
		this.replyId = replyId;
	}





	public String getReplyContent() {
		return replyContent;
	}





	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}





	public String getReplyRegisterDate() {
		return replyRegisterDate;
	}





	public void setReplyRegisterDate(String replyRegisterDate) {
		this.replyRegisterDate = replyRegisterDate;
	}





	public String getReplyUpdateDate() {
		return replyUpdateDate;
	}





	public void setReplyUpdateDate(String replyUpdateDate) {
		this.replyUpdateDate = replyUpdateDate;
	}





	public Long getTagId() {
		return tagId;
	}





	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}





	public String getTagName() {
		return tagName;
	}





	public void setTagName(String tagName) {
		this.tagName = tagName;
	}





	public Long getFavoriteId() {
		return favoriteId;
	}





	public void setFavoriteId(Long favoriteId) {
		this.favoriteId = favoriteId;
	}





	public Long getAnswerId() {
		return answerId;
	}





	public void setAnswerId(Long answerId) {
		this.answerId = answerId;
	}





	public String getAnswerTitle() {
		return answerTitle;
	}





	public void setAnswerTitle(String answerTitle) {
		this.answerTitle = answerTitle;
	}





	public String getAnswerContent() {
		return answerContent;
	}





	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}





	public String getAnswerRegisterDate() {
		return answerRegisterDate;
	}





	public void setAnswerRegisterDate(String answerRegisterDate) {
		this.answerRegisterDate = answerRegisterDate;
	}





	public String getAnswerUpdateDate() {
		return answerUpdateDate;
	}





	public void setAnswerUpdateDate(String answerUpdateDate) {
		this.answerUpdateDate = answerUpdateDate;
	}





	public Long getAnswerLikeId() {
		return answerLikeId;
	}





	public void setAnswerLikeId(Long answerLikeId) {
		this.answerLikeId = answerLikeId;
	}





	@Override
	public String toString() {
		return "BoardDTO [boardId=" + boardId + ", memberId=" + memberId + ", boardTitle=" + boardTitle
				+ ", boardContent=" + boardContent + ", boardRegisterDate=" + boardRegisterDate + ", boardUpdateDate="
				+ boardUpdateDate + ", ReadCount=" + ReadCount + ", boardImgId=" + boardImgId + ", boardImgPath="
				+ boardImgPath + ", boardImgName=" + boardImgName + ", boardLikeId=" + boardLikeId + ", replyId="
				+ replyId + ", replyContent=" + replyContent + ", replyRegisterDate=" + replyRegisterDate
				+ ", replyUpdateDate=" + replyUpdateDate + ", tagId=" + tagId + ", tagName=" + tagName + ", favoriteId="
				+ favoriteId + ", answerId=" + answerId + ", answerTitle=" + answerTitle + ", answerContent="
				+ answerContent + ", answerRegisterDate=" + answerRegisterDate + ", answerUpdateDate="
				+ answerUpdateDate + ", answerLikeId=" + answerLikeId + "]";
	}



	
}
