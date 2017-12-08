package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_test_question_map database table.
 * 
 */
@Entity
@Table(name="s_test_question_map")
@NamedQuery(name="STestQuestionMap.findAll", query="SELECT s FROM STestQuestionMap s")
public class STestQuestionMap implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private STestQuestionMapPK id;

	@Column(name="row_id")
	private int rowId;

	public STestQuestionMap() {
	}

	public STestQuestionMapPK getId() {
		return this.id;
	}

	public void setId(STestQuestionMapPK id) {
		this.id = id;
	}

	public int getRowId() {
		return this.rowId;
	}

	public void setRowId(int rowId) {
		this.rowId = rowId;
	}

}