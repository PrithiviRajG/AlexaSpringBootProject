/**
 * 
 */
package entity;
import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Prithivi Raj G
 *
 */
@Embeddable
public class SUserTestAnswerLogPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="test_id")
	private int testId;

	@Column(name="test_trial_no")
	private int testTrialNo;

	@Column(name="user_id")
	private String userId;
	
	@Column(name="q_id")
	private int qId;
		
	@Column(name="start_time")
	private String startTime;
	
	@Column(name="end_time")
	private String endTime;	
	
	@Column(name="opt_id")
	private int optId;
	
	public int getOptId() {
		return optId;
	}

	public void setOptId(int optId) {
		this.optId = optId;
	}

	/**
	 * 
	 */
	public SUserTestAnswerLogPK() {
		super();
	}

	public SUserTestAnswerLogPK(Integer qId, Integer testId, Integer maxTestTrialNumber,
			String userId,  String startTimeStamp, String endTimeStamp, Integer optionId) {
		// TODO Auto-generated constructor stub
		this.qId=qId;
		this.testId=testId;
		this.testTrialNo=maxTestTrialNumber;
		this.userId=userId;
		
		this.startTime=startTimeStamp;
		this.endTime=endTimeStamp;
		if(optionId!=null){
			this.optId=optionId;
			}
	}
	
	
	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
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

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	


	public int getQId() {
		return this.qId;
	}

	public void setQId(int qId) {
		this.qId = qId;
	}

}
