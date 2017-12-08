package entity;
import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the s_user_properties database table.
 * 
 */
@Entity
@Table(name="s_user_properties")
@NamedQuery(name="SUserProperty.findAll", query="SELECT s FROM SUserProperty s")
public class SUserProperty implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_id")
	private String userId;

	@Column(name="additional_tokens")
	private int additionalTokens;

	@Column(name="initial_tokens")
	private int initialTokens;

	@Column(name="lockout_start_time")
	private Timestamp lockoutStartTime;

	@Column(name="lockout_time_remaining")
	private int lockoutTimeRemaining;

	@Column(name="quant_consumed")
	private int quantConsumed;

	@Column(name="retry_tokens")
	private int retryTokens;

	@Column(name="tokens_gained")
	private int tokensGained;

	@Column(name="verbal_consumed")
	private int verbalConsumed;

	public SUserProperty() {
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getAdditionalTokens() {
		return this.additionalTokens;
	}

	public void setAdditionalTokens(int additionalTokens) {
		this.additionalTokens = additionalTokens;
	}

	public int getInitialTokens() {
		return this.initialTokens;
	}

	public void setInitialTokens(int initialTokens) {
		this.initialTokens = initialTokens;
	}

	public Timestamp getLockoutStartTime() {
		return this.lockoutStartTime;
	}

	public void setLockoutStartTime(Timestamp lockoutStartTime) {
		this.lockoutStartTime = lockoutStartTime;
	}

	public int getLockoutTimeRemaining() {
		return this.lockoutTimeRemaining;
	}

	public void setLockoutTimeRemaining(int lockoutTimeRemaining) {
		this.lockoutTimeRemaining = lockoutTimeRemaining;
	}

	public int getQuantConsumed() {
		return this.quantConsumed;
	}

	public void setQuantConsumed(int quantConsumed) {
		this.quantConsumed = quantConsumed;
	}

	public int getRetryTokens() {
		return this.retryTokens;
	}

	public void setRetryTokens(int retryTokens) {
		this.retryTokens = retryTokens;
	}

	public int getTokensGained() {
		return this.tokensGained;
	}

	public void setTokensGained(int tokensGained) {
		this.tokensGained = tokensGained;
	}

	public int getVerbalConsumed() {
		return this.verbalConsumed;
	}

	public void setVerbalConsumed(int verbalConsumed) {
		this.verbalConsumed = verbalConsumed;
	}

}