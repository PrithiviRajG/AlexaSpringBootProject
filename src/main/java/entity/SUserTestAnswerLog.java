package entity;
import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the s_user_test_answer_log database table.
 * 
 */
@Entity
@Table(name="s_user_test_answer_log")
@NamedQuery(name="SUserTestAnswerLog.findAll", query="SELECT s FROM SUserTestAnswerLog s")
public class SUserTestAnswerLog implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private SUserTestAnswerLogPK id;

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

	@Column(name="step_question_yn")
	private String stepQuestionYn;
	

	public SUserTestAnswerLogPK getId() {
		return id;
	}

	public void setId(SUserTestAnswerLogPK id) {
		this.id = id;
	}

	

	
	

	

	public SUserTestAnswerLog() {
	}

	public SUserTestAnswerLog(SUserTestAnswerLogPK userTestAnswerLogPK,
			String optAnswer, String optCorrect,  Integer qOrderNum, Integer currentSubStepNum,String stepQuestionYn) {
		// TODO Auto-generated constructor stub		
		this.id=userTestAnswerLogPK;		
		this.optBlank=optAnswer;
		this.stepQuestionYn = stepQuestionYn;
		this.optCorrect=optCorrect;
		this.qOrderNo=qOrderNum;
		this.qStepNo=currentSubStepNum;
	}
	
	public SUserTestAnswerLog(SUserTestAnswerLogPK userTestAnswerLogPK,
			String optAnswer, String optCorrect,  Integer qOrderNum, Integer currentSubStepNum) {
		// TODO Auto-generated constructor stub		
		this.id=userTestAnswerLogPK;		
		this.optBlank=optAnswer;
		this.optCorrect=optCorrect;
		this.qOrderNo=qOrderNum;
		this.qStepNo=currentSubStepNum;
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


	public String getStepQuestionYn() {
		return this.stepQuestionYn;
	}

	public void setStepQuestionYn(String stepQuestionYn) {
		this.stepQuestionYn = stepQuestionYn;
	}

	

}