package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the inter_data_interpretation database table.
 * 
 */
@Entity
@Table(name="inter_data_interpretation")
@NamedQuery(name="InterDataInterpretation.findAll", query="SELECT i FROM InterDataInterpretation i")
public class InterDataInterpretation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="data_inter_id")
	private int dataInterId;

	@Column(name="q_id")
	private int qId;

	public InterDataInterpretation() {
	}

	public int getDataInterId() {
		return this.dataInterId;
	}

	public void setDataInterId(int dataInterId) {
		this.dataInterId = dataInterId;
	}

	public int getQId() {
		return this.qId;
	}

	public void setQId(int qId) {
		this.qId = qId;
	}

}