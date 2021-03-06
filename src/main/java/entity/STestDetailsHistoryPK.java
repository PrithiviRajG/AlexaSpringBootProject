package entity;
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the s_test_details_history database table.
 * 
 */
@Embeddable
public class STestDetailsHistoryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="user_id")
	private String userId;

	@Column(name="test_id")
	private int testId;

	@Column(name="q_id")
	private int qId;

	@Column(name="test_trial_id")
	private int testTrialId;

	public STestDetailsHistoryPK() {
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
	public int getTestTrialId() {
		return this.testTrialId;
	}
	public void setTestTrialId(int testTrialId) {
		this.testTrialId = testTrialId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof STestDetailsHistoryPK)) {
			return false;
		}
		STestDetailsHistoryPK castOther = (STestDetailsHistoryPK)other;
		return 
			this.userId.equals(castOther.userId)
			&& (this.testId == castOther.testId)
			&& (this.qId == castOther.qId)
			&& (this.testTrialId == castOther.testTrialId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userId.hashCode();
		hash = hash * prime + this.testId;
		hash = hash * prime + this.qId;
		hash = hash * prime + this.testTrialId;
		
		return hash;
	}
}