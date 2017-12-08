package entity;
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the s_level_difficulty_mapping database table.
 * 
 */
@Embeddable
public class SLevelDifficultyMappingPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="section_id")
	private int sectionId;

	@Column(name="s_no")
	private int sNo;

	@Column(name="exam_id")
	private int examId;

	public SLevelDifficultyMappingPK() {
	}
	public int getSectionId() {
		return this.sectionId;
	}
	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}
	public int getSNo() {
		return this.sNo;
	}
	public void setSNo(int sNo) {
		this.sNo = sNo;
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
		if (!(other instanceof SLevelDifficultyMappingPK)) {
			return false;
		}
		SLevelDifficultyMappingPK castOther = (SLevelDifficultyMappingPK)other;
		return 
			(this.sectionId == castOther.sectionId)
			&& (this.sNo == castOther.sNo)
			&& (this.examId == castOther.examId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.sectionId;
		hash = hash * prime + this.sNo;
		hash = hash * prime + this.examId;
		
		return hash;
	}
}