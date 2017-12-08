package entity;
import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the s_db_jobs_logging database table.
 * 
 */
@Entity
@Table(name="s_db_jobs_logging")
@NamedQuery(name="SDbJobsLogging.findAll", query="SELECT s FROM SDbJobsLogging s")
public class SDbJobsLogging implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="seq_id")
	private int seqId;

	@Column(name="job_desc")
	private String jobDesc;

	@Column(name="job_time")
	private Timestamp jobTime;

	@Column(name="job_type")
	private String jobType;

	@Column(name="rows_affected")
	private String rowsAffected;

	public SDbJobsLogging() {
	}

	public int getSeqId() {
		return this.seqId;
	}

	public void setSeqId(int seqId) {
		this.seqId = seqId;
	}

	public String getJobDesc() {
		return this.jobDesc;
	}

	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

	public Timestamp getJobTime() {
		return this.jobTime;
	}

	public void setJobTime(Timestamp jobTime) {
		this.jobTime = jobTime;
	}

	public String getJobType() {
		return this.jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getRowsAffected() {
		return this.rowsAffected;
	}

	public void setRowsAffected(String rowsAffected) {
		this.rowsAffected = rowsAffected;
	}

}