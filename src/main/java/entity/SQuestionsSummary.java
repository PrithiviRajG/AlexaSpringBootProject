package entity;
import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the s_questions_summary database table.
 * 
 */
@Entity
@Table(name="s_questions_summary")
@NamedQuery(name="SQuestionsSummary.findAll", query="SELECT s FROM SQuestionsSummary s")
public class SQuestionsSummary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="q_id")
	private int qId;

	@Column(name="avg_no_of_retries")
	private BigDecimal avgNoOfRetries;

	@Column(name="avg_time_taken")
	private BigDecimal avgTimeTaken;

	@Column(name="no_of_retries")
	private int noOfRetries;

	@Column(name="total_no_students_taken")
	private int totalNoStudentsTaken;

	@Column(name="total_time_taken")
	private int totalTimeTaken;

	public SQuestionsSummary() {
	}

	public int getQId() {
		return this.qId;
	}

	public void setQId(int qId) {
		this.qId = qId;
	}

	public BigDecimal getAvgNoOfRetries() {
		return this.avgNoOfRetries;
	}

	public void setAvgNoOfRetries(BigDecimal avgNoOfRetries) {
		this.avgNoOfRetries = avgNoOfRetries;
	}

	public BigDecimal getAvgTimeTaken() {
		return this.avgTimeTaken;
	}

	public void setAvgTimeTaken(BigDecimal avgTimeTaken) {
		this.avgTimeTaken = avgTimeTaken;
	}

	public int getNoOfRetries() {
		return this.noOfRetries;
	}

	public void setNoOfRetries(int noOfRetries) {
		this.noOfRetries = noOfRetries;
	}

	public int getTotalNoStudentsTaken() {
		return this.totalNoStudentsTaken;
	}

	public void setTotalNoStudentsTaken(int totalNoStudentsTaken) {
		this.totalNoStudentsTaken = totalNoStudentsTaken;
	}

	public int getTotalTimeTaken() {
		return this.totalTimeTaken;
	}

	public void setTotalTimeTaken(int totalTimeTaken) {
		this.totalTimeTaken = totalTimeTaken;
	}

}