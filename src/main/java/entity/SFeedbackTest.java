package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_feedback_test database table.
 * 
 */
@Entity
@Table(name="s_feedback_test")
@NamedQuery(name="SFeedbackTest.findAll", query="SELECT s FROM SFeedbackTest s")
public class SFeedbackTest implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private SFeedbackTestPK id;
	
	

	/**
	 * @return the id
	 */
	public SFeedbackTestPK getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(SFeedbackTestPK id) {
		this.id = id;
	}



	public SFeedbackTest() {
	}
}