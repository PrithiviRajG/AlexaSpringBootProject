package entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the s_exam_faculty_mapping database table.
 * 
 */
@Embeddable
public class SExamFacultyMappingPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="exam_id")
	private int examId;

	@Column(name="batch_id")
	private String batchId;

	@Column(name="faculty_id")
	private String facultyId;

	public SExamFacultyMappingPK() {
	}
	public int getExamId() {
		return this.examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getFacultyId() {
		return this.facultyId;
	}
	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SExamFacultyMappingPK)) {
			return false;
		}
		SExamFacultyMappingPK castOther = (SExamFacultyMappingPK)other;
		return 
			(this.examId == castOther.examId)
			&& this.batchId.equals(castOther.batchId)
			&& this.facultyId.equals(castOther.facultyId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.examId;
		hash = hash * prime + this.batchId.hashCode();
		hash = hash * prime + this.facultyId.hashCode();
		
		return hash;
	}
}