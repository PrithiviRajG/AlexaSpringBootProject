package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ScoreCalculationPK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="user_id")
	private String userId;

	@Column(name="level_id")
	private int levelId;
	
	public ScoreCalculationPK(){
		
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getLevelId() {
		return levelId;
	}

	public void setLevelId(int levelId) {
		this.levelId = levelId;
	}
}
