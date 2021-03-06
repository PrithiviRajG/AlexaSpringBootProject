package entity;
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the s_mean_sd_consolidate database table.
 * 
 */
@Embeddable
public class SMeanSdConsolidatePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="level_id")
	private int levelId;

	@Column(name="exam_id")
	private int examId;

	@Column(name="section_id")
	private int sectionId;

    public SMeanSdConsolidatePK() {
    }
	public int getLevelId() {
		return this.levelId;
	}
	public void setLevelId(int levelId) {
		this.levelId = levelId;
	}
	public int getExamId() {
		return this.examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public int getSectionId() {
		return this.sectionId;
	}
	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SMeanSdConsolidatePK)) {
			return false;
		}
		SMeanSdConsolidatePK castOther = (SMeanSdConsolidatePK)other;
		return 
			(this.levelId == castOther.levelId)
			&& (this.examId == castOther.examId)
			&& (this.sectionId == castOther.sectionId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.levelId;
		hash = hash * prime + this.examId;
		hash = hash * prime + this.sectionId;
		
		return hash;
    }
}