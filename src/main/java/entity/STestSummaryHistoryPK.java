package entity;
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the s_test_summary_history database table.
 * 
 */
@Embeddable
public class STestSummaryHistoryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="user_id")
	private String userId;

	@Column(name="test_id")
	private int testId;

	@Column(name="test_trial_id")
	private int testTrialId;

	public STestSummaryHistoryPK() {
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
		if (!(other instanceof STestSummaryHistoryPK)) {
			return false;
		}
		STestSummaryHistoryPK castOther = (STestSummaryHistoryPK)other;
		return 
			this.userId.equals(castOther.userId)
			&& (this.testId == castOther.testId)
			&& (this.testTrialId == castOther.testTrialId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userId.hashCode();
		hash = hash * prime + this.testId;
		hash = hash * prime + this.testTrialId;
		
		return hash;
	}
}