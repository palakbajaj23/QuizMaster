package com.quiz.mst.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Optionss {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Option_Id")
	private long optionId;
	private String optionStatement;
	private String answer;
	
	/* question has multiple option */
	@ManyToOne
	@JoinColumn(name = "Question_Id")
	private Question question;
	
	public long getOptionId() {
		return optionId;
	}
	public void setOptionId(long optionId) {
		this.optionId = optionId;
	}
	public String getOptionStatement() {
		return optionStatement;
	}
	public void setOptionStatement(String optionStatement) {
		this.optionStatement = optionStatement;
	}
	
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
	
	

}
