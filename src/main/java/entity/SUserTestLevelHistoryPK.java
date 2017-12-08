package entity;
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the s_user_test_level_history database table.
 * 
 */
@Embeddable
public class SUserTestLevelHistoryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="user_id")
	private String userId;

	@Column(name="test_id")
	private int testId;

	@Column(name="test_trial_id")
	private int testTrialId;

	@Column(name="user_level")
	private int userLevel;

	@Column(name="attempt_no")
	private int attemptNo;

	public SUserTestLevelHistoryPK(String userId, int testId, int testTrialId) {
		super();
		this.userId = userId;
		this.testId = testId;
		this.testTrialId = testTrialId;
	}
	public SUserTestLevelHistoryPK() {
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
	public int getUserLevel() {
		return this.userLevel;
	}
	public void setUserLevel(int userLevel) {
		this.userLevel = userLevel;
	}
	public int getAttemptNo() {
		return this.attemptNo;
	}
	public void setAttemptNo(int attemptNo) {
		this.attemptNo = attemptNo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SUserTestLevelHistoryPK)) {
			return false;
		}
		SUserTestLevelHistoryPK castOther = (SUserTestLevelHistoryPK)other;
		return 
			this.userId.equals(castOther.userId)
			&& (this.testId == castOther.testId)
			&& (this.testTrialId == castOther.testTrialId)
			&& (this.userLevel == castOther.userLevel)
			&& (this.attemptNo == castOther.attemptNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userId.hashCode();
		hash = hash * prime + this.testId;
		hash = hash * prime + this.testTrialId;
		hash = hash * prime + this.userLevel;
		hash = hash * prime + this.attemptNo;
		
		return hash;
	}
}