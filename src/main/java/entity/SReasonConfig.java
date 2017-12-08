package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_reason_config database table.
 * 
 */
@Entity
@Table(name="s_reason_config")
@NamedQuery(name="SReasonConfig.findAll", query="SELECT s FROM SReasonConfig s")
public class SReasonConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="reason_id")
	private int reasonId;

	@Column(name="reason_desc")
	private String reasonDesc;

	public SReasonConfig() {
	}

	public int getReasonId() {
		return this.reasonId;
	}

	public void setReasonId(int reasonId) {
		this.reasonId = reasonId;
	}

	public String getReasonDesc() {
		return this.reasonDesc;
	}

	public void setReasonDesc(String reasonDesc) {
		this.reasonDesc = reasonDesc;
	}

}