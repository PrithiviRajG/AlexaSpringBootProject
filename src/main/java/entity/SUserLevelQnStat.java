package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_user_level_qn_stats database table.
 * 
 */
@Entity
@Table(name="s_user_level_qn_stats")
@NamedQuery(name="SUserLevelQnStat.findAll", query="SELECT s FROM SUserLevelQnStat s")
public class SUserLevelQnStat implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SUserLevelQnStatPK id;

	@Column(name="total_mistakes")
	private int totalMistakes;

	@Column(name="total_time")
	private int totalTime;

	public SUserLevelQnStat() {
	}

	public SUserLevelQnStatPK getId() {
		return this.id;
	}

	public void setId(SUserLevelQnStatPK id) {
		this.id = id;
	}

	public int getTotalMistakes() {
		return this.totalMistakes;
	}

	public void setTotalMistakes(int totalMistakes) {
		this.totalMistakes = totalMistakes;
	}

	public int getTotalTime() {
		return this.totalTime;
	}

	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}

}