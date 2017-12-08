package entity;
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the s_test_question_map database table.
 * 
 */
@Embeddable
public class STestQuestionMapPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="test_id")
	private int testId;

	@Column(name="q_id")
	private int qId;

	public STestQuestionMapPK() {
	}
	public int getTestId() {
		return this.testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public int getQId() {
		return this.qId;
	}
	public void setQId(int qId) {
		this.qId = qId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof STestQuestionMapPK)) {
			return false;
		}
		STestQuestionMapPK castOther = (STestQuestionMapPK)other;
		return 
			(this.testId == castOther.testId)
			&& (this.qId == castOther.qId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.testId;
		hash = hash * prime + this.qId;
		
		return hash;
	}
}