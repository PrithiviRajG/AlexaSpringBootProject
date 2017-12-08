package entity;
import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the s_retry_logging_main database table.
 * 
 */
@Entity
@Table(name="s_retry_logging_main")
@NamedQuery(name="SRetryLoggingMain.findAll", query="SELECT s FROM SRetryLoggingMain s")
public class SRetryLoggingMain implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SRetryLoggingMainPK id;

	@Column(name="taken_time")
	private Timestamp takenTime;

	public SRetryLoggingMain() {
	}

	public SRetryLoggingMainPK getId() {
		return this.id;
	}

	public void setId(SRetryLoggingMainPK id) {
		this.id = id;
	}

	public Timestamp getTakenTime() {
		return takenTime;
	}

	public void setTakenTime(Timestamp takenTime) {
		this.takenTime = takenTime;
	}


}