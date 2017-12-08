package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_tooltip_message database table.
 * 
 */
@Entity
@Table(name="s_tooltip_message")
@NamedQuery(name="STooltipMessage.findAll", query="SELECT s FROM STooltipMessage s")
public class STooltipMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private STooltipMessagePK id;

	@Column(name="tooltip_message")
	private String tooltipMessage;

	public STooltipMessage() {
	}

	public STooltipMessagePK getId() {
		return this.id;
	}

	public void setId(STooltipMessagePK id) {
		this.id = id;
	}

	public String getTooltipMessage() {
		return this.tooltipMessage;
	}

	public void setTooltipMessage(String tooltipMessage) {
		this.tooltipMessage = tooltipMessage;
	}

}