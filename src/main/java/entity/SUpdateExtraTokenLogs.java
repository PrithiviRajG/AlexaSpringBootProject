package entity;

	import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the s_update_extra_token_logs database table.
 * 
 */
@Entity
@Table(name="s_update_extra_token_logs")
@NamedQuery(name="SUpdateExtraTokenLogs.findAll", query="SELECT s FROM SUpdateExtraTokenLogs s")
public class SUpdateExtraTokenLogs implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="max_token_for_user")
	private int maxTokenForUser;

	@Column(name="out_of_boundary_token")
	private int outOfBoundaryToken;

	@Column(name="test_id")
	private int testId;

	private Timestamp time;

	@Column(name="user_id")
	private String userId;

	public SUpdateExtraTokenLogs() {
	}

	public SUpdateExtraTokenLogs(String userId, Integer testId, Integer outofBoundaryToken,
			Integer maxTokenForUser, Timestamp time) {
		// TODO Auto-generated constructor stub
		this.userId=userId;
		this.testId=testId;
		this.outOfBoundaryToken=outofBoundaryToken;
		this.maxTokenForUser=maxTokenForUser;
		this.time=time;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMaxTokenForUser() {
		return this.maxTokenForUser;
	}

	public void setMaxTokenForUser(int maxTokenForUser) {
		this.maxTokenForUser = maxTokenForUser;
	}

	public int getOutOfBoundaryToken() {
		return this.outOfBoundaryToken;
	}

	public void setOutOfBoundaryToken(int outOfBoundaryToken) {
		this.outOfBoundaryToken = outOfBoundaryToken;
	}

	public int getTestId() {
		return this.testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp timestamp) {
		this.time = timestamp;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}