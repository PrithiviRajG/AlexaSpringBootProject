package entity;


import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_question_section_map database table.
 * 
 */
@Entity
@Table(name="s_question_section_map")
@NamedQuery(name="SQuestionSectionMap.findAll", query="SELECT s FROM SQuestionSectionMap s")
public class SQuestionSectionMap implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private SQuestionSectionMapPK id;

	

	public SQuestionSectionMap() {
	}

	

}