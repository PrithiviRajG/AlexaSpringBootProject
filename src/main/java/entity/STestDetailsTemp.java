package entity;
import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.CacheConcurrencyStrategy;


/**
 * The persistent class for the s_test_details_temp database table.
 * 
 */
@Entity
@Table(name="s_test_details_temp")
@NamedQuery(name="STestDetailsTemp.findAll", query="SELECT s FROM STestDetailsTemp s")
public class STestDetailsTemp implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private STestDetailsTempPK id;

	@Column(name="correct_yn")
	private String correctYn;

	@Column(name="duration")
	private Integer duration;

	@Column(name="incorrect_yn")
	private String incorrectYn;

	@Column(name="unanswered_yn")
	private String unansweredYn;
	
	@Column(name="question_token")
	private Integer questionToken;
	
	@Column(name="is_lockout")
	private String isLockout;

	public STestDetailsTemp() {
	}

	public STestDetailsTemp(STestDetailsTempPK testDetailsTempPK, String isCorrect, String isSkip, String isWrong,
			String isLockout, Integer getqDuration) {
		// TODO Auto-generated constructor stub
		this.id=testDetailsTempPK;
		this.correctYn=isCorrect;
		this.incorrectYn=isWrong;
		this.unansweredYn=isSkip;
		this.duration=getqDuration;
	}

	public String getIsLockout() {
		return isLockout;
	}

	public void setIsLockout(String isLockout) {
		this.isLockout = isLockout;
	}

	public STestDetailsTempPK getId() {
		return this.id;
	}

	public void setId(STestDetailsTempPK id) {
		this.id = id;
	}

	public String getCorrectYn() {
		return this.correctYn;
	}

	public void setCorrectYn(String correctYn) {
		this.correctYn = correctYn;
	}

	public Integer getDuration() {
		return duration;
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

	public Integer getQuestionToken() {
		return questionToken;
	}

	public void setQuestionToken(Integer questionToken) {
		this.questionToken = questionToken;
	}
	

}