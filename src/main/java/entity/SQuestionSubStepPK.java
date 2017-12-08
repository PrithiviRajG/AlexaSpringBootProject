package entity;
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the s_question_sub_step database table.
 * 
 */
@Embeddable
public class SQuestionSubStepPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="q_id")
	private int qId;

	@Column(name="step_no")
	private int stepNo;

	public SQuestionSubStepPK() {
	}
	public int getQId() {
		return this.qId;
	}
	public void setQId(int qId) {
		this.qId = qId;
	}
	public int getStepNo() {
		return this.stepNo;
	}
	public void setStepNo(int stepNo) {
		this.stepNo = stepNo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SQuestionSubStepPK)) {
			return false;
		}
		SQuestionSubStepPK castOther = (SQuestionSubStepPK)other;
		return 
			(this.qId == castOther.qId)
			&& (this.stepNo == castOther.stepNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.qId;
		hash = hash * prime + this.stepNo;
		
		return hash;
	}
}