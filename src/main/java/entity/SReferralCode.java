package entity;
import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the s_referral_codes database table.
 * 
 */
@Entity
@Table(name="s_referral_codes")
@NamedQuery(name="SReferralCode.findAll", query="SELECT s FROM SReferralCode s")
public class SReferralCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="referral_code")
	private String referralCode;

	@Column(name="active_flag")
	private String activeFlag;

	@Column(name="referrer_id")
	private String referrerId;

	@Column(name="student_id")
	private String studentId;

	@Column(name="time_added")
	private Timestamp timeAdded;

	@Column(name="time_taken")
	private Timestamp timeTaken;

	public SReferralCode() {
	}

	public String getReferralCode() {
		return this.referralCode;
	}

	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
	}

	public String getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getReferrerId() {
		return this.referrerId;
	}

	public void setReferrerId(String referrerId) {
		this.referrerId = referrerId;
	}

	public String getStudentId() {
		return this.studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public Timestamp getTimeAdded() {
		return this.timeAdded;
	}

	public void setTimeAdded(Timestamp timeAdded) {
		this.timeAdded = timeAdded;
	}

	public Timestamp getTimeTaken() {
		return this.timeTaken;
	}

	public void setTimeTaken(Timestamp timeTaken) {
		this.timeTaken = timeTaken;
	}

}