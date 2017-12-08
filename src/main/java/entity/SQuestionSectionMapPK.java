/**
 * 
 */
package entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Prithivi Raj G
 *
 */
@Embeddable
public class SQuestionSectionMapPK implements Serializable{
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	public SQuestionSectionMapPK() {
		super();
	}

	@Column(name="exam_id")
	private int examId;

	@Column(name="order_id")
	private int orderId;

	@Column(name="section_id")
	private int sectionId;

	@Column(name="type_id")
	private int typeId;
	
	public int getExamId() {
		return this.examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}

	public int getTypeId() {
		return this.typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

}
