package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_exam_section database table.
 * 
 */
@Entity
@Table(name="s_exam_section")
@NamedQuery(name="SExamSection.findAll", query="SELECT s FROM SExamSection s")
public class SExamSection implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SExamSectionPK id;
	
	@Column(name="Default_indicator")
	private String defaultIndicator;
	
	

	/**
	 * @return the defaultIndicator
	 */
	public String getDefaultIndicator() {
		return defaultIndicator;
	}

	/**
	 * @param defaultIndicator the defaultIndicator to set
	 */
	public void setDefaultIndicator(String defaultIndicator) {
		this.defaultIndicator = defaultIndicator;
	}

	public SExamSection() {
	}

	public SExamSectionPK getId() {
		return this.id;
	}

	public void setId(SExamSectionPK id) {
		this.id = id;
	}

}