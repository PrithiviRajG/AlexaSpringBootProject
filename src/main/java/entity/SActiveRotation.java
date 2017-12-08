package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_active_rotations database table.
 * 
 */
@Entity
@Table(name="s_active_rotations")
@NamedQuery(name="SActiveRotation.findAll", query="SELECT s FROM SActiveRotation s")
public class SActiveRotation implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SActiveRotationPK id;

	@Column(name="s_no")
	private int sNo;

	public SActiveRotation() {
	}

	public SActiveRotationPK getId() {
		return this.id;
	}

	public void setId(SActiveRotationPK id) {
		this.id = id;
	}

	public int getSNo() {
		return this.sNo;
	}

	public void setSNo(int sNo) {
		this.sNo = sNo;
	}

}