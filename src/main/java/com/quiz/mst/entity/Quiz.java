package com.quiz.mst.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Quiz {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Quiz_Id")
	private long quizId;
	private int score;
	private float durationInMin;
	
	@ManyToOne
	@JoinColumn(name = "Test_Id")
	private Test test;
	
	@ManyToOne
	@JoinColumn(name = "User_Id")
	private User user;

	public long getQuizId() {
		return quizId;
	}

	public void setQuizId(long quizId) {
		this.quizId = quizId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public float getDurationInMin() {
		return durationInMin;
	}

	public void setDurationInMin(float durationInMin) {
		this.durationInMin = durationInMin;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}
	
	
	
	
	
	
	
}
