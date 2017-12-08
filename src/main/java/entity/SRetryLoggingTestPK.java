package entity;
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the s_retry_logging_test database table.
 * 
 */
@Embeddable
public class SRetryLoggingTestPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="user_id")
	private String userId;

	@Column(name="test_id")
	private int testId;

	@Column(name="test_trial_no")
	private int testTrialNo;

	@Column(name="sub_trial_no")
	private int subTrialNo;

	public SRetryLoggingTestPK() {
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
	public int getTestTrialNo() {
		return this.testTrialNo;
	}
	public void setTestTrialNo(int testTrialNo) {
		this.testTrialNo = testTrialNo;
	}
	public int getSubTrialNo() {
		return this.subTrialNo;
	}
	public void setSubTrialNo(int subTrialNo) {
		this.subTrialNo = subTrialNo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SRetryLoggingTestPK)) {
			return false;
		}
		SRetryLoggingTestPK castOther = (SRetryLoggingTestPK)other;
		return 
			this.userId.equals(castOther.userId)
			&& (this.testId == castOther.testId)
			&& (this.testTrialNo == castOther.testTrialNo)
			&& (this.subTrialNo == castOther.subTrialNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userId.hashCode();
		hash = hash * prime + this.testId;
		hash = hash * prime + this.testTrialNo;
		hash = hash * prime + this.subTrialNo;
		
		return hash;
	}
}