package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_reason_config database table.
 * 
 */
@Entity
@Table(name="t_reason_config")
@NamedQuery(name="TReasonConfig.findAll", query="SELECT t FROM TReasonConfig t")
public class TReasonConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="reason_id")
	private int reasonId;

	@Column(name="progression_level")
	private int progressionLevel;

	@Column(name="reason_desc")
	private String reasonDesc;

	public TReasonConfig() {
	}

	public int getReasonId() {
		return this.reasonId;
	}

	public void setReasonId(int reasonId) {
		this.reasonId = reasonId;
	}

	public int getProgressionLevel() {
		return this.progressionLevel;
	}

	public void setProgressionLevel(int progressionLevel) {
		this.progressionLevel = progressionLevel;
	}

	public String getReasonDesc() {
		return this.reasonDesc;
	}

	public void setReasonDesc(String reasonDesc) {
		this.reasonDesc = reasonDesc;
	}

}