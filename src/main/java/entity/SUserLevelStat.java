package entity;
import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the s_user_level_stats database table.
 * 
 */
@Entity
@Table(name="s_user_level_stats")
@NamedQuery(name="SUserLevelStat.findAll", query="SELECT s FROM SUserLevelStat s")
public class SUserLevelStat implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SUserLevelStatPK id;

	@Column(name="avg_mistakes_qn")
	private BigDecimal avgMistakesQn;

	@Column(name="avg_time_qn")
	private int avgTimeQn;

	@Column(name="final_score")
	private BigDecimal finalScore;

	@Column(name="qn_correct_score")
	private int qnCorrectScore;

	@Column(name="qn_count")
	private int qnCount;

	@Column(name="qn_mistakes_score")
	private BigDecimal qnMistakesScore;

	@Column(name="qn_speed_score")
	private BigDecimal qnSpeedScore;

	@Column(name="qn_with_mistakes")
	private int qnWithMistakes;

	public SUserLevelStat() {
	}

	public SUserLevelStatPK getId() {
		return this.id;
	}

	public void setId(SUserLevelStatPK id) {
		this.id = id;
	}

	public BigDecimal getAvgMistakesQn() {
		return this.avgMistakesQn;
	}

	public void setAvgMistakesQn(BigDecimal avgMistakesQn) {
		this.avgMistakesQn = avgMistakesQn;
	}

	public int getAvgTimeQn() {
		return this.avgTimeQn;
	}

	public void setAvgTimeQn(int avgTimeQn) {
		this.avgTimeQn = avgTimeQn;
	}

	public BigDecimal getFinalScore() {
		return this.finalScore;
	}

	public void setFinalScore(BigDecimal finalScore) {
		this.finalScore = finalScore;
	}

	public int getQnCorrectScore() {
		return this.qnCorrectScore;
	}

	public void setQnCorrectScore(int qnCorrectScore) {
		this.qnCorrectScore = qnCorrectScore;
	}

	public int getQnCount() {
		return this.qnCount;
	}

	public void setQnCount(int qnCount) {
		this.qnCount = qnCount;
	}

	public BigDecimal getQnMistakesScore() {
		return this.qnMistakesScore;
	}

	public void setQnMistakesScore(BigDecimal qnMistakesScore) {
		this.qnMistakesScore = qnMistakesScore;
	}

	public BigDecimal getQnSpeedScore() {
		return this.qnSpeedScore;
	}

	public void setQnSpeedScore(BigDecimal qnSpeedScore) {
		this.qnSpeedScore = qnSpeedScore;
	}

	public int getQnWithMistakes() {
		return this.qnWithMistakes;
	}

	public void setQnWithMistakes(int qnWithMistakes) {
		this.qnWithMistakes = qnWithMistakes;
	}

}