package entity;
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the s_user_exam_type database table.
 * 
 */
@Embeddable
public class SUserExamTypePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="user_id")
	private String userId;

	@Column(name="exam_id")
	private int examId;

	public SUserExamTypePK() {
	}
	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
		if (!(other instanceof SUserExamTypePK)) {
			return false;
		}
		SUserExamTypePK castOther = (SUserExamTypePK)other;
		return 
			this.userId.equals(castOther.userId)
			&& (this.examId == castOther.examId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userId.hashCode();
		hash = hash * prime + this.examId;
		
		return hash;
	}
}