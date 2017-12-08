package entity;
import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the s_lock_log database table.
 * 
 */
@Entity
@Table(name="s_lock_log")
@NamedQuery(name="SLockLog.findAll", query="SELECT s FROM SLockLog s")
public class SLockLog implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private SLockLogPK lockLogPK;	

	@Column(name="lock_end_time")
	private Timestamp lockEndTime;

	


	public SLockLogPK getLockLogPK() {
		return lockLogPK;
	}


	public void setLockLogPK(SLockLogPK lockLogPK) {
		this.lockLogPK = lockLogPK;
	}


	public SLockLog() {
	}


	/**
	 * @return the lockEndTime
	 */
	public Timestamp getLockEndTime() {
		return lockEndTime;
	}


	/**
	 * @param lockEndTime the lockEndTime to set
	 */
	public void setLockEndTime(Timestamp lockEndTime) {
		this.lockEndTime = lockEndTime;
	}


	
	




}