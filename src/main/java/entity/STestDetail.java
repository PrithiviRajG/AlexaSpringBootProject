package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_test_details database table.
 * 
 */
@Entity
@Table(name="s_test_details")
@NamedQuery(name="STestDetail.findAll", query="SELECT s FROM STestDetail s")
public class STestDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private STestDetailPK id;

	@Column(name="correct_yn")
	private String correctYn;

	private Integer duration;

	@Column(name="incorrect_yn")
	private String incorrectYn;

	@Column(name="unanswered_yn")
	private String unansweredYn;

	public STestDetail() {
	}

	public STestDetailPK getId() {
		return this.id;
	}

	public void setId(STestDetailPK id) {
		this.id = id;
	}

	public String getCorrectYn() {
		return this.correctYn;
	}

	public void setCorrectYn(String correctYn) {
		this.correctYn = correctYn;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getIncorrectYn() {
		return this.incorrectYn;
	}

	public void setIncorrectYn(String incorrectYn) {
		this.incorrectYn = incorrectYn;
	}

	public String getUnansweredYn() {
		return this.unansweredYn;
	}

	public void setUnansweredYn(String unansweredYn) {
		this.unansweredYn = unansweredYn;
	}

}