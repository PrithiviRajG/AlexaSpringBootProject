package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_category_tiers database table.
 * 
 */
@Entity
@Table(name="s_category_tiers")
@NamedQuery(name="SCategoryTier.findAll", query="SELECT s FROM SCategoryTier s")
public class SCategoryTier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tier_id")
	private int tierId;

	@Column(name="tier_name")
	private String tierName;

	public SCategoryTier() {
	}

	public int getTierId() {
		return this.tierId;
	}

	public void setTierId(int tierId) {
		this.tierId = tierId;
	}

	public String getTierName() {
		return this.tierName;
	}

	public void setTierName(String tierName) {
		this.tierName = tierName;
	}

}