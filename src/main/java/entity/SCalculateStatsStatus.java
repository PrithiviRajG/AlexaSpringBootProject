package entity;
import java.io.Serializable;

import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the s_calculate_stats_status database table.
 * 
 */
@Entity
@Table(name="s_calculate_stats_status")
@NamedQuery(name="SCalculateStatsStatus.findAll", query="SELECT s FROM SCalculateStatsStatus s")
public class SCalculateStatsStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="process_id")
	private Integer processid;

	@Column(name="end_time", nullable=true)
	private Date endTime;

	@Column(name="records_updated")
	private int recordsUpdated;

	@Column(name="start_time", nullable=true)
	private Date startTime;

	@Column(name="status")
	private String status;

	public SCalculateStatsStatus() {
	}

	public Integer getProcessId() {
		return this.processid;
	}

	public void setProcessId(Integer processId) {
		this.processid = processId;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public int getRecordsUpdated() {
		return this.recordsUpdated;
	}

	public void setRecordsUpdated(int recordsUpdated) {
		this.recordsUpdated = recordsUpdated;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}