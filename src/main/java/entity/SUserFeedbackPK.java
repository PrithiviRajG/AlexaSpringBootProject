package entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;

/**
 * The primary key class for the s_user_feedback database table.
 * 
 */
@Embeddable
public class SUserFeedbackPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="user_id")
	private String userId;

	private String uuid;

	@Column(name="feedback_ques_1")
	private String feedbackQues1;

	@Column(name="feedback_ans_1")
	private String feedbackAns1;

	@Column(name="feedback_ques_2")
	private String feedbackQues2;

	@Column(name="feedback_ans_2")
	private String feedbackAns2;

	@Column(name="overall_feedback")
	private String overallFeedback;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="feedback_time")
	private java.util.Date feedbackTime;

	public SUserFeedbackPK() {
	}
	public SUserFeedbackPK(String userId, String uuid, String feedbackQn1, String feedbackAns1, String feedbackQn2,
			String feedbackAns2, String overallFeedback, Timestamp timestamp) {
		// TODO Auto-generated constructor stub
		this.userId=userId;
		this.uuid=uuid;
		this.feedbackQues1=feedbackQn1;
		this.feedbackQues2=feedbackQn2;
		this.feedbackAns1=feedbackAns1;
		this.feedbackAns2=feedbackAns2;
		this.overallFeedback=overallFeedback;
		this.feedbackTime=timestamp;
	}
	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUuid() {
		return this.uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getFeedbackQues1() {
		return this.feedbackQues1;
	}
	public void setFeedbackQues1(String feedbackQues1) {
		this.feedbackQues1 = feedbackQues1;
	}
	public String getFeedbackAns1() {
		return this.feedbackAns1;
	}
	public void setFeedbackAns1(String feedbackAns1) {
		this.feedbackAns1 = feedbackAns1;
	}
	public String getFeedbackQues2() {
		return this.feedbackQues2;
	}
	public void setFeedbackQues2(String feedbackQues2) {
		this.feedbackQues2 = feedbackQues2;
	}
	public String getFeedbackAns2() {
		return this.feedbackAns2;
	}
	public void setFeedbackAns2(String feedbackAns2) {
		this.feedbackAns2 = feedbackAns2;
	}
	public String getOverallFeedback() {
		return this.overallFeedback;
	}
	public void setOverallFeedback(String overallFeedback) {
		this.overallFeedback = overallFeedback;
	}


	/**
	 * @return the feedbackTime
	 */
	public java.util.Date getFeedbackTime() {
		return feedbackTime;
	}
	/**
	 * @param feedbackTime the feedbackTime to set
	 */
	public void setFeedbackTime(java.util.Date feedbackTime) {
		this.feedbackTime = feedbackTime;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SUserFeedbackPK)) {
			return false;
		}
		SUserFeedbackPK castOther = (SUserFeedbackPK)other;
		return 
			this.userId.equals(castOther.userId)
			&& this.uuid.equals(castOther.uuid)
			&& this.feedbackQues1.equals(castOther.feedbackQues1)
			&& this.feedbackAns1.equals(castOther.feedbackAns1)
			&& this.feedbackQues2.equals(castOther.feedbackQues2)
			&& this.feedbackAns2.equals(castOther.feedbackAns2)
			&& this.overallFeedback.equals(castOther.overallFeedback)
			&& this.feedbackTime.equals(castOther.feedbackTime);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userId.hashCode();
		hash = hash * prime + this.uuid.hashCode();
		hash = hash * prime + this.feedbackQues1.hashCode();
		hash = hash * prime + this.feedbackAns1.hashCode();
		hash = hash * prime + this.feedbackQues2.hashCode();
		hash = hash * prime + this.feedbackAns2.hashCode();
		hash = hash * prime + this.overallFeedback.hashCode();
		hash = hash * prime + this.feedbackTime.hashCode();
		
		return hash;
	}
}