package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_test_config_seq_dtl database table.
 * 
 */
@Entity
@Table(name="s_test_config_seq_dtl")
@NamedQuery(name="STestConfigSeqDtl.findAll", query="SELECT s FROM STestConfigSeqDtl s")
public class STestConfigSeqDtl implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private STestConfigSeqDtlPK id;

	@Column(name="attempt_no")
	private int attemptNo;

	@Column(name="level_no")
	private int levelNo;

	@Column(name="section_id")
	private int sectionId;

	@Column(name="test_desc")
	private String testDesc;

	@Column(name="test_name")
	private String testName;

	public STestConfigSeqDtl() {
	}

	public STestConfigSeqDtlPK getId() {
		return this.id;
	}

	public void setId(STestConfigSeqDtlPK id) {
		this.id = id;
	}

	public int getAttemptNo() {
		return this.attemptNo;
	}

	public void setAttemptNo(int attemptNo) {
		this.attemptNo = attemptNo;
	}

	public int getLevelNo() {
		return this.levelNo;
	}

	public void setLevelNo(int levelNo) {
		this.levelNo = levelNo;
	}

	public int getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}

	public String getTestDesc() {
		return this.testDesc;
	}

	public void setTestDesc(String testDesc) {
		this.testDesc = testDesc;
	}

	public String getTestName() {
		return this.testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

}