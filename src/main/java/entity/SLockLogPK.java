/**
 * 
 */
package entity;
import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;

/**
 * @author Prithivi Raj G
 *
 */
public class SLockLogPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="section_id")
	private int sectionId;

	@Column(name="user_id")
	private String userId;
	
	@Column(name="level_id")
	private int levelId;
	
	@Column(name="lock_start_time")
	private Timestamp lockStartTime;
	
	/**
	 * @return the lockStartTime
	 */
	public Timestamp getLockStartTime() {
		return lockStartTime;
	}


	/**
	 * @param lockStartTime the lockStartTime to set
	 */
	public void setLockStartTime(Timestamp lockStartTime) {
		this.lockStartTime = lockStartTime;
	}


	
	
	
	/**
	 * 
	 */
	public SLockLogPK() {
		super();
	}

	public int getLevelId() {
		return this.levelId;
	}

	public void setLevelId(int levelId) {
		this.levelId = levelId;
	}
	
	public int getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	

}
