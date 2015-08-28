package org.harper.otms.calendar.entity;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.harper.otms.common.dao.Entity;

@javax.persistence.Entity
@Table(name = "feedback")
public class Feedback extends Entity {

	@OneToOne
	@JoinColumn(name = "tutor_id")
	private Tutor tutor;

	@OneToOne
	@JoinColumn(name = "client_id")
	private Client client;

	@OneToOne
	@JoinColumn(name = "lesson_item_id")
	private LessonItem lessonItem;

	@Column(name = "success")
	private boolean success;

	@Column(name = "tutor_rate")
	private int tutorRate;

	@Column(name = "lesson_rate")
	private int lessonRate;

	@Column(name = "fail_reason")
	private int failReason;

	@Column(name = "comment")
	private String comment;

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public LessonItem getLessonItem() {
		return lessonItem;
	}

	public void setLessonItem(LessonItem lessonItem) {
		this.lessonItem = lessonItem;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getTutorRate() {
		return tutorRate;
	}

	public void setTutorRate(int tutorRate) {
		this.tutorRate = tutorRate;
	}

	public int getLessonRate() {
		return lessonRate;
	}

	public void setLessonRate(int lessonRate) {
		this.lessonRate = lessonRate;
	}

	public int getFailReason() {
		return failReason;
	}

	public void setFailReason(int failReason) {
		this.failReason = failReason;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
