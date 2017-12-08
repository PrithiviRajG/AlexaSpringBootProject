package entity;
import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the s_retry_logging_test database table.
 * 
 */
@Entity
@Table(name="s_retry_logging_test")
@NamedQuery(name="SRetryLoggingTest.findAll", query="SELECT s FROM SRetryLoggingTest s")
public class SRetryLoggingTest implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SRetryLoggingTestPK id;

	private int duration;

	@Column(name="taken_date")
	private Timestamp takenDate;

	public SRetryLoggingTest() {
	}

	public SRetryLoggingTestPK getId() {
		return this.id;
	}

	public void setId(SRetryLoggingTestPK id) {
		this.id = id;
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Timestamp getTakenDate() {
		return takenDate;
	}

	public void setTakenDate(Timestamp takenDate) {
		this.takenDate = takenDate;
	}

}