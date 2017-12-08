package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_progression_status database table.
 * 
 */
@Entity
@Table(name="t_progression_status")
@NamedQuery(name="TProgressionStatus.findAll", query="SELECT t FROM TProgressionStatus t")
public class TProgressionStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="progression_level_id")
	private int progressionLevelId;

	@Column(name="progression_level_desc")
	private String progressionLevelDesc;

	public TProgressionStatus() {
	}

	public int getProgressionLevelId() {
		return this.progressionLevelId;
	}

	public void setProgressionLevelId(int progressionLevelId) {
		this.progressionLevelId = progressionLevelId;
	}

	public String getProgressionLevelDesc() {
		return this.progressionLevelDesc;
	}

	public void setProgressionLevelDesc(String progressionLevelDesc) {
		this.progressionLevelDesc = progressionLevelDesc;
	}

}