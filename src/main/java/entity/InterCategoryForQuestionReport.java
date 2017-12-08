package entity;


import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the inter_category_for_question_report database table.
 * 
 */
@Entity
@Table(name="inter_category_for_question_report")
@NamedQuery(name="InterCategoryForQuestionReport.findAll", query="SELECT i FROM InterCategoryForQuestionReport i")
public class InterCategoryForQuestionReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="category_seq_id")
	private int categorySeqId;

	@Column(name="category_id")
	private int categoryId;

	@Column(name="group_id")
	private int groupId;

	@Column(name="question_id")
	private int questionId;

	public InterCategoryForQuestionReport() {
	}

	public int getCategorySeqId() {
		return this.categorySeqId;
	}

	public void setCategorySeqId(int categorySeqId) {
		this.categorySeqId = categorySeqId;
	}

	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

}