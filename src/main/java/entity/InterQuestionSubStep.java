package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the inter_question_sub_step database table.
 * 
 */
@Entity
@Table(name="inter_question_sub_step")
@NamedQuery(name="InterQuestionSubStep.findAll", query="SELECT i FROM InterQuestionSubStep i")
public class InterQuestionSubStep implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private InterQuestionSubStepPK id;

	@Column(name="check_point")
	private String checkPoint;

	@Column(name="no_of_steps")
	private int noOfSteps;

	@Column(name="step_q_id")
	private int stepQId;

	public InterQuestionSubStep() {
	}

	public InterQuestionSubStepPK getId() {
		return this.id;
	}

	public void setId(InterQuestionSubStepPK id) {
		this.id = id;
	}

	public String getCheckPoint() {
		return this.checkPoint;
	}

	public void setCheckPoint(String checkPoint) {
		this.checkPoint = checkPoint;
	}

	public int getNoOfSteps() {
		return this.noOfSteps;
	}

	public void setNoOfSteps(int noOfSteps) {
		this.noOfSteps = noOfSteps;
	}

	public int getStepQId() {
		return this.stepQId;
	}

	public void setStepQId(int stepQId) {
		this.stepQId = stepQId;
	}

}