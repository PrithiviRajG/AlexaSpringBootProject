package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_exam_type database table.
 * 
 */
@Entity
@Table(name="s_exam_type")
@NamedQuery(name="SExamType.findAll", query="SELECT s FROM SExamType s")
public class SExamType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="exam_id")
	private int examId;

	@Column(name="active_flag")
	private String activeFlag;

	@Column(name="exam_desc")
	private String examDesc;

	@Column(name="exam_name")
	private String examName;

	public SExamType() {
	}

	public int getExamId() {
		return this.examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public String getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getExamDesc() {
		return this.examDesc;
	}

	public void setExamDesc(String examDesc) {
		this.examDesc = examDesc;
	}

	public String getExamName() {
		return this.examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

}