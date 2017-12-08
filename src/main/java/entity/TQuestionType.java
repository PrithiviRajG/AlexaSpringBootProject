package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_question_type database table.
 * 
 */
@Entity
@Table(name="t_question_type")
@NamedQuery(name="TQuestionType.findAll", query="SELECT t FROM TQuestionType t")
public class TQuestionType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="type_id")
	private int typeId;

	@Column(name="type_desc")
	private String typeDesc;

	@Column(name="type_name")
	private String typeName;

	public TQuestionType() {
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