package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_user_exam_level database table.
 * 
 */
@Entity
@Table(name="s_user_exam_level")
@NamedQuery(name="SUserExamLevel.findAll", query="SELECT s FROM SUserExamLevel s")
public class SUserExamLevel implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SUserExamLevelPK id;

	@Column(name="attempt_no")
	private int attemptNo;

	@Column(name="level_id")
	private int levelId;

	public SUserExamLevel() {
	}

	public SUserExamLevelPK getId() {
		return this.id;
	}

	public void setId(SUserExamLevelPK id) {
		this.id = id;
	}

	public int getAttemptNo() {
		return this.attemptNo;
	}

	public void setAttemptNo(int attemptNo) {
		this.attemptNo = attemptNo;
	}

	public int getLevelId() {
		return this.levelId;
	}

	public void setLevelId(int levelId) {
		this.levelId = levelId;
	}

}