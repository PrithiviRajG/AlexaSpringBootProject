package entity;
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the s_active_rotations database table.
 * 
 */
@Embeddable
public class SActiveRotationPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="seq_no")
	private int seqNo;

	@Column(name="section_id")
	private int sectionId;

	@Column(name="exam_id")
	private int examId;

	public SActiveRotationPK() {
	}
	public int getSeqNo() {
		return this.seqNo;
	}
	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
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
		if (!(other instanceof SActiveRotationPK)) {
			return false;
		}
		SActiveRotationPK castOther = (SActiveRotationPK)other;
		return 
			(this.seqNo == castOther.seqNo)
			&& (this.sectionId == castOther.sectionId)
			&& (this.examId == castOther.examId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.seqNo;
		hash = hash * prime + this.sectionId;
		hash = hash * prime + this.examId;
		
		return hash;
	}
}