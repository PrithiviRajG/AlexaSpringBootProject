package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_user_test_answer_temp database table.
 * 
 */
@Entity
@Table(name="s_user_test_answer_temp")
@NamedQuery(name="SUserTestAnswerTemp.findAll", query="SELECT s FROM SUserTestAnswerTemp s")
public class SUserTestAnswerTemp implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SUserTestAnswerTempPK id;

	@Column(name="duration")
	private int duration;

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

	public SUserTestAnswerTemp() {
	}

	public SUserTestAnswerTempPK getId() {
		return this.id;
	}

	public void setId(SUserTestAnswerTempPK id) {
		this.id = id;
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
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