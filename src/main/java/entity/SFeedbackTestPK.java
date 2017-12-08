/**
 * 
 */
package entity;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * @author Prithivi
 *
 */
public class SFeedbackTestPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="exam_id")
	private int examId;

	@Column(name="level_id")
	private int levelId;

	@Column(name="section_id")
	private int sectionId;

	@Column(name="test_id")
	private int testId;

	

	public SFeedbackTestPK() {
		super();
	}

	public int getExamId() {
		return this.examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
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

	public int getTestId() {
		return this.testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}
	
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SFeedbackTestPK)) {
			return false;
		}
		SFeedbackTestPK castOther = (SFeedbackTestPK)other;
		return 
			(this.examId == castOther.examId)
			&& (this.sectionId == castOther.sectionId)
			&& (this.levelId == castOther.levelId)
			&& (this.testId == castOther.testId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.examId;
		hash = hash * prime + this.sectionId;
		
		return hash;
	}


}
