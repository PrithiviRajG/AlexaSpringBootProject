package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_test_summary database table.
 * 
 */
@Entity
@Table(name="s_test_summary")
@NamedQuery(name="STestSummary.findAll", query="SELECT s FROM STestSummary s")
public class STestSummary implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private STestSummaryPK id;

	private Integer duration;

	@Column(name="no_correct")
	private int noCorrect;

	@Column(name="no_incorrect")
	private int noIncorrect;

	@Column(name="no_unanswered")
	private int noUnanswered;

	@Column(name="total_question")
	private int totalQuestion;

	public STestSummary() {
	}

	public STestSummaryPK getId() {
		return this.id;
	}

	public void setId(STestSummaryPK id) {
		this.id = id;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public int getNoCorrect() {
		return this.noCorrect;
	}

	public void setNoCorrect(int noCorrect) {
		this.noCorrect = noCorrect;
	}

	public int getNoIncorrect() {
		return this.noIncorrect;
	}

	public void setNoIncorrect(int noIncorrect) {
		this.noIncorrect = noIncorrect;
	}

	public int getNoUnanswered() {
		return this.noUnanswered;
	}

	public void setNoUnanswered(int noUnanswered) {
		this.noUnanswered = noUnanswered;
	}

	public int getTotalQuestion() {
		return this.totalQuestion;
	}

	public void setTotalQuestion(int totalQuestion) {
		this.totalQuestion = totalQuestion;
	}

}