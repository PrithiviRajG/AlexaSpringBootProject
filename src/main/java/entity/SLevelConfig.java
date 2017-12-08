package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_level_config database table.
 * 
 */
@Entity
@Table(name="s_level_config")
@NamedQuery(name="SLevelConfig.findAll", query="SELECT s FROM SLevelConfig s")
public class SLevelConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SLevelConfigPK id;

	@Column(name="correct_answer_points")
	private int correctAnswerPoints;

	private float duration;

	@Column(name="lock_out_duration")
	private int lockOutDuration;

	@Column(name="max_attempts")
	private int maxAttempts;

	@Column(name="no_of_questions")
	private int noOfQuestions;

	@Column(name="pass_percentage")
	private int passPercentage;

	@Column(name="remaining_time_points")
	private int remainingTimePoints;

	@Column(name="time_delay")
	private int timeDelay;

	@Column(name="unanswered_question_points")
	private int unansweredQuestionPoints;

	@Column(name="wrong_question_points")
	private int wrongQuestionPoints;

	public SLevelConfig() {
	}

	public SLevelConfigPK getId() {
		return this.id;
	}

	public void setId(SLevelConfigPK id) {
		this.id = id;
	}

	public int getCorrectAnswerPoints() {
		return this.correctAnswerPoints;
	}

	public void setCorrectAnswerPoints(int correctAnswerPoints) {
		this.correctAnswerPoints = correctAnswerPoints;
	}

	public float getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getLockOutDuration() {
		return this.lockOutDuration;
	}

	public void setLockOutDuration(int lockOutDuration) {
		this.lockOutDuration = lockOutDuration;
	}

	public int getMaxAttempts() {
		return this.maxAttempts;
	}

	public void setMaxAttempts(int maxAttempts) {
		this.maxAttempts = maxAttempts;
	}

	public int getNoOfQuestions() {
		return this.noOfQuestions;
	}

	public void setNoOfQuestions(int noOfQuestions) {
		this.noOfQuestions = noOfQuestions;
	}

	public int getPassPercentage() {
		return this.passPercentage;
	}

	public void setPassPercentage(int passPercentage) {
		this.passPercentage = passPercentage;
	}

	public int getRemainingTimePoints() {
		return remainingTimePoints;
	}

	public void setRemainingTimePoints(int remainingTimePoints) {
		this.remainingTimePoints = remainingTimePoints;
	}

	public int getTimeDelay() {
		return this.timeDelay;
	}

	public void setTimeDelay(int timeDelay) {
		this.timeDelay = timeDelay;
	}

	public int getUnansweredQuestionPoints() {
		return this.unansweredQuestionPoints;
	}

	public void setUnansweredQuestionPoints(int unansweredQuestionPoints) {
		this.unansweredQuestionPoints = unansweredQuestionPoints;
	}

	public int getWrongQuestionPoints() {
		return this.wrongQuestionPoints;
	}

	public void setWrongQuestionPoints(int wrongQuestionPoints) {
		this.wrongQuestionPoints = wrongQuestionPoints;
	}

	

}