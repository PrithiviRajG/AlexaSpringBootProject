package entity;
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the s_retry_logging_main database table.
 * 
 */
@Embeddable
public class SRetryLoggingMainPK implements Serializable {
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

	@Column(name="q_id")
	private int qId;

	@Column(name="retry_count")
	private int retryCount;

	public SRetryLoggingMainPK() {
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
	public int getQId() {
		return this.qId;
	}
	public void setQId(int qId) {
		this.qId = qId;
	}
	public int getRetryCount() {
		return this.retryCount;
	}
	public void setRetryCount(int retryCount) {
		this.retryCount = retryCount;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SRetryLoggingMainPK)) {
			return false;
		}
		SRetryLoggingMainPK castOther = (SRetryLoggingMainPK)other;
		return 
			this.userId.equals(castOther.userId)
			&& (this.testId == castOther.testId)
			&& (this.testTrialNo == castOther.testTrialNo)
			&& (this.subTrialNo == castOther.subTrialNo)
			&& (this.qId == castOther.qId)
			&& (this.retryCount == castOther.retryCount);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userId.hashCode();
		hash = hash * prime + this.testId;
		hash = hash * prime + this.testTrialNo;
		hash = hash * prime + this.subTrialNo;
		hash = hash * prime + this.qId;
		hash = hash * prime + this.retryCount;
		
		return hash;
	}
}