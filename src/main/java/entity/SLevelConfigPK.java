package entity;
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the s_level_config database table.
 * 
 */
@Embeddable
public class SLevelConfigPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="level_id")
	private int levelId;

	@Column(name="section_id")
	private int sectionId;

	@Column(name="exam_id")
	private int examId;

	public SLevelConfigPK() {
	}
	public SLevelConfigPK(Integer examId, Integer levelNum, Integer secId) {
		// TODO Auto-generated constructor stub
		this.examId=examId;
		this.levelId= levelNum;
		this.sectionId=secId;
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
	public int getExamId() {
		return this.examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SLevelConfigPK)) {
			return false;
		}
		SLevelConfigPK castOther = (SLevelConfigPK)other;
		return 
			(this.levelId == castOther.levelId)
			&& (this.sectionId == castOther.sectionId)
			&& (this.examId == castOther.examId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.levelId;
		hash = hash * prime + this.sectionId;
		hash = hash * prime + this.examId;
		
		return hash;
	}
}