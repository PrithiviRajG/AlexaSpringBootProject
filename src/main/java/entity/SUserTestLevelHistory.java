package entity;
import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the s_user_test_level_history database table.
 * 
 */
@Entity
@Table(name="s_user_test_level_history")
@NamedQuery(name="SUserTestLevelHistory.findAll", query="SELECT s FROM SUserTestLevelHistory s")
public class SUserTestLevelHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SUserTestLevelHistoryPK id;

	@Column(name="first_time_pass")
	private String firstTimePass;

	@Column(name="pass_fail")
	private String passFail;

	@Column(name="percentage_taken")
	private BigDecimal percentageTaken;

	@Column(name="points_scored")
	private int pointsScored;

	@Column(name="section_id")
	private int sectionId;

	@Column(name="test_taken")
	private String testTaken;
	
	
	
	public SUserTestLevelHistory() {
	}

	public SUserTestLevelHistoryPK getId() {
		return this.id;
	}

	public void setId(SUserTestLevelHistoryPK id) {
		this.id = id;
	}

	public String getFirstTimePass() {
		return this.firstTimePass;
	}

	public void setFirstTimePass(String firstTimePass) {
		this.firstTimePass = firstTimePass;
	}

	public String getPassFail() {
		return this.passFail;
	}

	public void setPassFail(String passFail) {
		this.passFail = passFail;
	}

	public BigDecimal getPercentageTaken() {
		return this.percentageTaken;
	}

	public void setPercentageTaken(BigDecimal percentageTaken) {
		this.percentageTaken = percentageTaken;
	}

	public int getPointsScored() {
		return this.pointsScored;
	}

	public void setPointsScored(int pointsScored) {
		this.pointsScored = pointsScored;
	}

	public int getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}

	public String getTestTaken() {
		return testTaken;
	}

	public void setTestTaken(String testTaken) {
		this.testTaken = testTaken;
	}


}