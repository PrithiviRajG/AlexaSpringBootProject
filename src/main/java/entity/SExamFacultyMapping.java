package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_exam_faculty_mapping database table.
 * 
 */
@Entity
@Table(name="s_exam_faculty_mapping")
@NamedQuery(name="SExamFacultyMapping.findAll", query="SELECT s FROM SExamFacultyMapping s")
public class SExamFacultyMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SExamFacultyMappingPK id;

	public SExamFacultyMapping() {
	}

	public SExamFacultyMappingPK getId() {
		return this.id;
	}

	public void setId(SExamFacultyMappingPK id) {
		this.id = id;
	}

}