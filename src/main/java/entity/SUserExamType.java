package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_user_exam_type database table.
 * 
 */
@Entity
@Table(name="s_user_exam_type")
@NamedQuery(name="SUserExamType.findAll", query="SELECT s FROM SUserExamType s")
public class SUserExamType implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SUserExamTypePK id;

	public SUserExamType() {
	}

	public SUserExamTypePK getId() {
		return this.id;
	}

	public void setId(SUserExamTypePK id) {
		this.id = id;
	}

}