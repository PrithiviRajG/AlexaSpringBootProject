package entity;
import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the s_log_referral_clicks database table.
 * 
 */
@Entity
@Table(name="s_log_referral_clicks")
@NamedQuery(name="SLogReferralClick.findAll", query="SELECT s FROM SLogReferralClick s")
public class SLogReferralClick implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="generated_time")
	private Timestamp generatedTime;

	@Id
	@Column(name="user_id")
	private String userId;

	public SLogReferralClick() {
	}

	public Timestamp getGeneratedTime() {
		return this.generatedTime;
	}

	public void setGeneratedTime(Timestamp generatedTime) {
		this.generatedTime = generatedTime;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}