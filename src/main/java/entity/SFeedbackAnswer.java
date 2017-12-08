package entity;
import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the s_feedback_answer database table.
 * 
 */
@Entity
@Table(name="s_feedback_answer")
@NamedQuery(name="SFeedbackAnswer.findAll", query="SELECT s FROM SFeedbackAnswer s")
public class SFeedbackAnswer implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SFeedbackAnswerPK id;

	@Column(name="added_date")
	private Timestamp addedDate;

	private String duration;

	@Column(name="opt_blank")
	private String optBlank;

	@Column(name="opt_correct")
	private String optCorrect;

	@Column(name="opt_correct_img_flag")
	private String optCorrectImgFlag;

	@Column(name="opt_img_flag")
	private String optImgFlag;

	@Column(name="opt_text")
	private String optText;

	public SFeedbackAnswer() {
	}

	public SFeedbackAnswerPK getId() {
		return this.id;
	}

	public void setId(SFeedbackAnswerPK id) {
		this.id = id;
	}

	public Timestamp getAddedDate() {
		return this.addedDate;
	}

	public void setAddedDate(Timestamp addedDate) {
		this.addedDate = addedDate;
	}

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getOptBlank() {
		return this.optBlank;
	}

	public void setOptBlank(String optBlank) {
		this.optBlank = optBlank;
	}

	public String getOptCorrect() {
		return this.optCorrect;
	}

	public void setOptCorrect(String optCorrect) {
		this.optCorrect = optCorrect;
	}

	public String getOptCorrectImgFlag() {
		return this.optCorrectImgFlag;
	}

	public void setOptCorrectImgFlag(String optCorrectImgFlag) {
		this.optCorrectImgFlag = optCorrectImgFlag;
	}

	public String getOptImgFlag() {
		return this.optImgFlag;
	}

	public void setOptImgFlag(String optImgFlag) {
		this.optImgFlag = optImgFlag;
	}

	public String getOptText() {
		return this.optText;
	}

	public void setOptText(String optText) {
		this.optText = optText;
	}

}