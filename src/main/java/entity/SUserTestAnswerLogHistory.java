package entity;
import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the s_user_test_answer_log_history database table.
 * 
 */
@Entity
@Table(name="s_user_test_answer_log_history")
@NamedQuery(name="SUserTestAnswerLogHistory.findAll", query="SELECT s FROM SUserTestAnswerLogHistory s")
public class SUserTestAnswerLogHistory implements Serializable {
	public SUserTestAnswerLogHistoryPK getId() {
		return id;
	}

	public void setId(SUserTestAnswerLogHistoryPK id) {
		this.id = id;
	}

	public int getqOrderNo() {
		return qOrderNo;
	}

	public void setqOrderNo(int qOrderNo) {
		this.qOrderNo = qOrderNo;
	}

	public int getqStepNo() {
		return qStepNo;
	}

	public void setqStepNo(int qStepNo) {
		this.qStepNo = qStepNo;
	}

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private SUserTestAnswerLogHistoryPK id;

	@Column(name="end_time")
	private String endTime;

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

	

	@Column(name="q_order_no")
	private int qOrderNo;

	@Column(name="q_step_no")
	private int qStepNo;

	@Column(name="start_time")
	private String startTime;

	@Column(name="step_question_yn")
	private String stepQuestionYn;

	

	

	public SUserTestAnswerLogHistory() {
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



	public int getQOrderNo() {
		return this.qOrderNo;
	}

	public void setQOrderNo(int qOrderNo) {
		this.qOrderNo = qOrderNo;
	}

	public int getQStepNo() {
		return this.qStepNo;
	}

	public void setQStepNo(int qStepNo) {
		this.qStepNo = qStepNo;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getStepQuestionYn() {
		return this.stepQuestionYn;
	}

	public void setStepQuestionYn(String stepQuestionYn) {
		this.stepQuestionYn = stepQuestionYn;
	}

	

	

}