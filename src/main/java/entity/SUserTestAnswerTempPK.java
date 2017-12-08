package entity;
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the s_user_test_answer_temp database table.
 * 
 */
@Embeddable
public class SUserTestAnswerTempPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="user_id")
	private String userId;

	@Column(name="test_id")
	private int testId;

	@Column(name="q_id")
	private int qId;

	@Column(name="opt_id")
	private int optId;

	public SUserTestAnswerTempPK() {
	}
	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public int getOptId() {
		return this.optId;
	}
	public void setOptId(int optId) {
		this.optId = optId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SUserTestAnswerTempPK)) {
			return false;
		}
		SUserTestAnswerTempPK castOther = (SUserTestAnswerTempPK)other;
		return 
			this.userId.equals(castOther.userId)
			&& (this.testId == castOther.testId)
			&& (this.qId == castOther.qId)
			&& (this.optId == castOther.optId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userId.hashCode();
		hash = hash * prime + this.testId;
		hash = hash * prime + this.qId;
		hash = hash * prime + this.optId;
		
		return hash;
	}
}