package entity;
import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.CacheConcurrencyStrategy;


/**
 * The persistent class for the s_configurations database table.
 * 
 */
@Entity
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name="s_configurations")
@NamedQuery(name="SConfiguration.findAll", query="SELECT s FROM SConfiguration s")
public class SConfiguration implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="s_no")
	private int sNo;

	@Column(name="initial_retry")
	private int initialRetry;

	@Column(name="lockout_time")

	private int lockoutTime;	

	
	@Column(name="premium_user_lock_out_time")
	private int premiumUserLockOutTime;	
	
	@Column(name="no_ad_lock_out_time")
	private int noAdLockOutTime;	


	@Column(name="message_for_lock_out_time")
	private String messageForLockOutTime;

	@Column(name="message_for_pts_after_lockout")
	private String messageForPtsAfterLockout;

	@Column(name="message_for_token_all_correct")
	private String messageForTokenAllCorrect;

	@Column(name="message_for_token_any_attempt")
	private String messageForTokenAnyAttempt;

	@Column(name="message_for_token_first_attempt")
	private String messageForTokenFirstAttempt;

	@Column(name="message_for_token_lost")
	private String messageForTokenLost;

	@Column(name="pts_after_lockout")
	private int ptsAfterLockout;

	@Column(name="quants_rotation")
	private String quantsRotation;

	@Lob
	@Column(name="terms_and_conditions")
	private String termsAndConditions;

	@Column(name="token_gained_per_attempt")
	private int tokenGainedPerAttempt;

	@Column(name="token_lost_per_retry")
	private int tokenLostPerRetry;

	@Column(name="tokens_gained_for_all_correct")
	private int tokensGainedForAllCorrect;

	@Column(name="tokens_gained_per_any_attempt")
	private int tokensGainedPerAnyAttempt;

	@Column(name="verbal_rotation")
	private String verbalRotation;
	
	@Column(name="pass")
	private Integer pass;
	
	@Column(name="fail")
	private Integer fail;
	
	@Column(name="max_token_for_user")
	private Integer maxTokenForUser;	
	
	@Column(name="max_level_allowed_for_guest_user")
	private int maxLevelAllowedForGuestUser;
	
	public Integer getMaxTokenForUser() {
		return maxTokenForUser;
	}

	public void setMaxTokenForUser(Integer maxTokenForUser) {
		this.maxTokenForUser = maxTokenForUser;
	}

	public Integer getPass() {
		return pass;
	}

	public void setPass(Integer pass) {
		this.pass = pass;
	}

	public Integer getFail() {
		return fail;
	}

	public void setFail(Integer fail) {
		this.fail = fail;
	}

	public SConfiguration() {
	}
	
	public int getMaxLevelAllowedForGuestUser() {
		return this.maxLevelAllowedForGuestUser;
	}

	public void setMaxLevelAllowedForGuestUser(int maxLevelAllowedForGuestUser) {
		this.maxLevelAllowedForGuestUser = maxLevelAllowedForGuestUser;
	}


	public int getSNo() {
		return this.sNo;
	}

	public void setSNo(int sNo) {
		this.sNo = sNo;
	}

	public int getInitialRetry() {
		return this.initialRetry;
	}

	public void setInitialRetry(int initialRetry) {
		this.initialRetry = initialRetry;
	}

	public int getLockoutTime() {
		return this.lockoutTime;
	}

	public void setLockoutTime(int lockoutTime) {
		this.lockoutTime = lockoutTime;
	}
	
	/**
	 * @return the sNo
	 */
	public int getsNo() {
		return sNo;
	}

	/**
	 * @param sNo the sNo to set
	 */
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	/**
	 * @return the premiumUserLockOutTime
	 */
	public int getPremiumUserLockOutTime() {
		return premiumUserLockOutTime;
	}

	/**
	 * @param premiumUserLockOutTime the premiumUserLockOutTime to set
	 */
	public void setPremiumUserLockOutTime(int premiumUserLockOutTime) {
		this.premiumUserLockOutTime = premiumUserLockOutTime;
	}
	

	public int getNoAdLockOutTime() {
		return noAdLockOutTime;
	}

	public void setNoAdLockOutTime(int noAdLockOutTime) {
		this.noAdLockOutTime = noAdLockOutTime;
	}

	public String getMessageForLockOutTime() {
		return this.messageForLockOutTime;
	}

	public void setMessageForLockOutTime(String messageForLockOutTime) {
		this.messageForLockOutTime = messageForLockOutTime;
	}

	public String getMessageForPtsAfterLockout() {
		return this.messageForPtsAfterLockout;
	}

	public void setMessageForPtsAfterLockout(String messageForPtsAfterLockout) {
		this.messageForPtsAfterLockout = messageForPtsAfterLockout;
	}

	public String getMessageForTokenAllCorrect() {
		return this.messageForTokenAllCorrect;
	}

	public void setMessageForTokenAllCorrect(String messageForTokenAllCorrect) {
		this.messageForTokenAllCorrect = messageForTokenAllCorrect;
	}

	public String getMessageForTokenAnyAttempt() {
		return this.messageForTokenAnyAttempt;
	}

	public void setMessageForTokenAnyAttempt(String messageForTokenAnyAttempt) {
		this.messageForTokenAnyAttempt = messageForTokenAnyAttempt;
	}

	public String getMessageForTokenFirstAttempt() {
		return this.messageForTokenFirstAttempt;
	}

	public void setMessageForTokenFirstAttempt(String messageForTokenFirstAttempt) {
		this.messageForTokenFirstAttempt = messageForTokenFirstAttempt;
	}

	public String getMessageForTokenLost() {
		return this.messageForTokenLost;
	}

	public void setMessageForTokenLost(String messageForTokenLost) {
		this.messageForTokenLost = messageForTokenLost;
	}

	public int getPtsAfterLockout() {
		return this.ptsAfterLockout;
	}

	public void setPtsAfterLockout(int ptsAfterLockout) {
		this.ptsAfterLockout = ptsAfterLockout;
	}

	public String getQuantsRotation() {
		return this.quantsRotation;
	}

	public void setQuantsRotation(String quantsRotation) {
		this.quantsRotation = quantsRotation;
	}

	public String getTermsAndConditions() {
		return this.termsAndConditions;
	}

	public void setTermsAndConditions(String termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}

	public int getTokenGainedPerAttempt() {
		return this.tokenGainedPerAttempt;
	}

	public void setTokenGainedPerAttempt(int tokenGainedPerAttempt) {
		this.tokenGainedPerAttempt = tokenGainedPerAttempt;
	}

	public int getTokenLostPerRetry() {
		return this.tokenLostPerRetry;
	}

	public void setTokenLostPerRetry(int tokenLostPerRetry) {
		this.tokenLostPerRetry = tokenLostPerRetry;
	}

	public int getTokensGainedForAllCorrect() {
		return this.tokensGainedForAllCorrect;
	}

	public void setTokensGainedForAllCorrect(int tokensGainedForAllCorrect) {
		this.tokensGainedForAllCorrect = tokensGainedForAllCorrect;
	}

	public int getTokensGainedPerAnyAttempt() {
		return this.tokensGainedPerAnyAttempt;
	}

	public void setTokensGainedPerAnyAttempt(int tokensGainedPerAnyAttempt) {
		this.tokensGainedPerAnyAttempt = tokensGainedPerAnyAttempt;
	}

	public String getVerbalRotation() {
		return this.verbalRotation;
	}

	public void setVerbalRotation(String verbalRotation) {
		this.verbalRotation = verbalRotation;
	}

}