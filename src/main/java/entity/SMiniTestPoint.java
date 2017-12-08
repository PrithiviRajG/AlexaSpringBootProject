package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_mini_test_points database table.
 * 
 */
@Entity
@Table(name="s_mini_test_points")
@NamedQuery(name="SMiniTestPoint.findAll", query="SELECT s FROM SMiniTestPoint s")
public class SMiniTestPoint implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SMiniTestPointPK id;

	private int points;

	@Column(name="section_id")
	private int sectionId;

	public SMiniTestPoint() {
	}

	public SMiniTestPointPK getId() {
		return this.id;
	}

	public void setId(SMiniTestPointPK id) {
		this.id = id;
	}

	public int getPoints() {
		return this.points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}

}