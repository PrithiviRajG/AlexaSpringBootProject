package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_feedback_summary database table.
 * 
 */
@Entity
@Table(name="s_feedback_summary")
@NamedQuery(name="SFeedbackSummary.findAll", query="SELECT s FROM SFeedbackSummary s")
public class SFeedbackSummary implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SFeedbackSummaryPK id;

	private int duration;

	@Column(name="total_questions")
	private int totalQuestions;

	public SFeedbackSummary() {
	}

	public SFeedbackSummaryPK getId() {
		return this.id;
	}

	public void setId(SFeedbackSummaryPK id) {
		this.id = id;
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getTotalQuestions() {
		return this.totalQuestions;
	}

	public void setTotalQuestions(int totalQuestions) {
		this.totalQuestions = totalQuestions;
	}

}