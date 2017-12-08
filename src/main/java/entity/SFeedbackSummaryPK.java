package entity;
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the s_feedback_summary database table.
 * 
 */
@Embeddable
public class SFeedbackSummaryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="user_id")
	private String userId;

	@Column(name="test_id")
	private int testId;

	public SFeedbackSummaryPK() {
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SFeedbackSummaryPK)) {
			return false;
		}
		SFeedbackSummaryPK castOther = (SFeedbackSummaryPK)other;
		return 
			this.userId.equals(castOther.userId)
			&& (this.testId == castOther.testId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userId.hashCode();
		hash = hash * prime + this.testId;
		
		return hash;
	}
}