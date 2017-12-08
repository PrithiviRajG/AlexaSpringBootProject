/**
 * 
 */
package entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Prithivi Raj G
 *The primary key class for the SUserTestAnswerLogHistory database table.
 */
@Embeddable
public class SUserTestAnswerLogHistoryPK implements Serializable{
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	
	@Column(name="user_id")
	private String userId;
	
	@Column(name="test_id")
	private int testId;

	@Column(name="test_trial_no")
	private int testTrialNo;
	
	@Column(name="q_id")
	private int qId;
	
	@Column(name="opt_id")
	private int optId;
	
	
	
	public SUserTestAnswerLogHistoryPK() {
		super();
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
	
	public int getOptId() {
		return this.optId;
	}

	public void setOptId(int optId) {
		this.optId = optId;
	}
	
	public int getQId() {
		return this.qId;
	}

	public void setQId(int qId) {
		this.qId = qId;
	}

}
