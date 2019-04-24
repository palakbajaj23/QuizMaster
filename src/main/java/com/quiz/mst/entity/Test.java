package com.quiz.mst.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Test {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Test_Id")
	private long testId;
	private int noOfQuestion;

	// multiple test belong to a category
	@ManyToOne
	@JoinColumn(name = "Category_Id")
	private CategoryMst category;

	public long getTestId() {
		return testId;
	}

	public void setTestId(long testId) {
		this.testId = testId;
	}

	public int getNoOfQuestion() {
		return noOfQuestion;
	}

	public void setNoOfQuestion(int noOfQuestion) {
		this.noOfQuestion = noOfQuestion;
	}

	public CategoryMst getCategory() {
		return category;
	}

	public void setCategory(CategoryMst category) {
		this.category = category;
	}
	

	
}
