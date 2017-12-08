package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_question_progression_history database table.
 * 
 */
@Entity
@Table(name="t_question_progression_history")
@NamedQuery(name="TQuestionProgressionHistory.findAll", query="SELECT t FROM TQuestionProgressionHistory t")
public class TQuestionProgressionHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="history_seq")
	private int historySeq;

	private String admin_Reviewed;

	@Column(name="progression_level")
	private int progressionLevel;

	@Column(name="progression_status")
	private int progressionStatus;

	@Column(name="q_id")
	private int qId;

	@Column(name="reason_comments")
	private String reasonComments;

	@Column(name="reason_type")
	private int reasonType;

	@Column(name="user_id")
	private String userId;

	public TQuestionProgressionHistory() {
	}

	public int getHistorySeq() {
		return this.historySeq;
	}

	public void setHistorySeq(int historySeq) {
		this.historySeq = historySeq;
	}

	public String getAdmin_Reviewed() {
		return this.admin_Reviewed;
	}

	public void setAdmin_Reviewed(String admin_Reviewed) {
		this.admin_Reviewed = admin_Reviewed;
	}

	public int getProgressionLevel() {
		return this.progressionLevel;
	}

	public void setProgressionLevel(int progressionLevel) {
		this.progressionLevel = progressionLevel;
	}

	public int getProgressionStatus() {
		return this.progressionStatus;
	}

	public void setProgressionStatus(int progressionStatus) {
		this.progressionStatus = progressionStatus;
	}

	public int getQId() {
		return this.qId;
	}

	public void setQId(int qId) {
		this.qId = qId;
	}

	public String getReasonComments() {
		return this.reasonComments;
	}

	public void setReasonComments(String reasonComments) {
		this.reasonComments = reasonComments;
	}

	public int getReasonType() {
		return this.reasonType;
	}

	public void setReasonType(int reasonType) {
		this.reasonType = reasonType;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}