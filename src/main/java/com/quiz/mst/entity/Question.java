package com.quiz.mst.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Question_Id")
	private long questionId;
	private String queStatememt;
	private int marks;
	
	
	
	@ManyToOne
	@JoinColumn(name = "Test_Id")
	private Test test;

	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public String getQueStatememt() {
		return queStatememt;
	}

	public void setQueStatememt(String queStatememt) {
		this.queStatememt = queStatememt;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}
	
	

}
