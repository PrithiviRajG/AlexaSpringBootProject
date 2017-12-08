package entity;
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the s_tooltip_message database table.
 * 
 */
@Embeddable
public class STooltipMessagePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="seq_number")
	private int seqNumber;

	@Column(name="tooltip_name")
	private String tooltipName;

	public STooltipMessagePK() {
	}
	public int getSeqNumber() {
		return this.seqNumber;
	}
	public void setSeqNumber(int seqNumber) {
		this.seqNumber = seqNumber;
	}
	public String getTooltipName() {
		return this.tooltipName;
	}
	public void setTooltipName(String tooltipName) {
		this.tooltipName = tooltipName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof STooltipMessagePK)) {
			return false;
		}
		STooltipMessagePK castOther = (STooltipMessagePK)other;
		return 
			(this.seqNumber == castOther.seqNumber)
			&& this.tooltipName.equals(castOther.tooltipName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.seqNumber;
		hash = hash * prime + this.tooltipName.hashCode();
		
		return hash;
	}
}