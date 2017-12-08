package entity;
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the s_user_exam_level database table.
 * 
 */
@Embeddable
public class SUserExamLevelPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="exam_id")
	private int examId;

	@Column(name="user_id")
	private String userId;

	@Column(name="section_id")
	private int sectionId;

	public SUserExamLevelPK() {
	}
	public int getExamId() {
		return this.examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
		if (!(other instanceof SUserExamLevelPK)) {
			return false;
		}
		SUserExamLevelPK castOther = (SUserExamLevelPK)other;
		return 
			(this.examId == castOther.examId)
			&& this.userId.equals(castOther.userId)
			&& (this.sectionId == castOther.sectionId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.examId;
		hash = hash * prime + this.userId.hashCode();
		hash = hash * prime + this.sectionId;
		
		return hash;
	}
}