package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_sections database table.
 * 
 */
@Entity
@Table(name="t_sections")
@NamedQuery(name="TSection.findAll", query="SELECT t FROM TSection t")
public class TSection implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="section_id")
	private int sectionId;

	@Column(name="section_desc")
	private String sectionDesc;

	@Column(name="section_name")
	private String sectionName;

	public TSection() {
	}

	public int getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}

	public String getSectionDesc() {
		return this.sectionDesc;
	}

	public void setSectionDesc(String sectionDesc) {
		this.sectionDesc = sectionDesc;
	}

	public String getSectionName() {
		return this.sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

}