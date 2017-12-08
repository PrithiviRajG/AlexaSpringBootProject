package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_data_interpretation database table.
 * 
 */
@Entity
@Table(name="s_data_interpretation")
@NamedQuery(name="SDataInterpretation.findAll", query="SELECT s FROM SDataInterpretation s")
public class SDataInterpretation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="data_inter_id")
	private int dataInterId;

	@Column(name="q_id")
	private int qId;

	public SDataInterpretation() {
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