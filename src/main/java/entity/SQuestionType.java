package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_question_type database table.
 * 
 */
@Entity
@Table(name="s_question_type")
@NamedQuery(name="SQuestionType.findAll", query="SELECT s FROM SQuestionType s")
public class SQuestionType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="type_id")
	private int typeId;

	@Column(name="type_desc")
	private String typeDesc;

	@Column(name="type_name")
	private String typeName;

	public SQuestionType() {
	}

	public int getTypeId() {
		return this.typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getTypeDesc() {
		return this.typeDesc;
	}

	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}