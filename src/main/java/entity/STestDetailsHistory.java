package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_test_details_history database table.
 * 
 */
@Entity
@Table(name="s_test_details_history")
@NamedQuery(name="STestDetailsHistory.findAll", query="SELECT s FROM STestDetailsHistory s")
public class STestDetailsHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private STestDetailsHistoryPK id;

	@Column(name="correct_yn")
	private String correctYn;

	private Integer duration;

	@Column(name="incorrect_yn")
	private String incorrectYn;

	@Column(name="unanswered_yn")
	private String unansweredYn;

	public STestDetailsHistory() {
	}

	public STestDetailsHistoryPK getId() {
		return this.id;
	}

	public void setId(STestDetailsHistoryPK id) {
		this.id = id;
	}

	public String getCorrectYn() {
		return this.correctYn;
	}

	public void setCorrectYn(String correctYn) {
		this.correctYn = correctYn;
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getIncorrectYn() {
		return this.incorrectYn;
	}

	public void setIncorrectYn(String incorrectYn) {
		this.incorrectYn = incorrectYn;
	}

	public String getUnansweredYn() {
		return this.unansweredYn;
	}

	public void setUnansweredYn(String unansweredYn) {
		this.unansweredYn = unansweredYn;
	}

}