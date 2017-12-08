package entity;
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the s_test_config database table.
 * 
 */
@Embeddable
public class STestConfigPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="test_id")
	private int testId;

	@Column(name="exam_id")
	private int examId;

	public STestConfigPK() {
	}
	public int getTestId() {
		return this.testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
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
		if (!(other instanceof STestConfigPK)) {
			return false;
		}
		STestConfigPK castOther = (STestConfigPK)other;
		return 
			(this.testId == castOther.testId)
			&& (this.examId == castOther.examId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.testId;
		hash = hash * prime + this.examId;
		
		return hash;
	}
}