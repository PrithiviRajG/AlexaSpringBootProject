package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_mean_sd_consolidate database table.
 * 
 */
@Entity
@Table(name="s_mean_sd_consolidate")
public class SMeanSdConsolidate implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SMeanSdConsolidatePK id;

	@Column(name="mean_level_upto")
	private double meanLevelUpto;

	@Column(name="standard_deviation_level_upto")
	private double standardDeviationLevelUpto;

    public SMeanSdConsolidate() {
    }

	public SMeanSdConsolidatePK getId() {
		return this.id;
	}

	public void setId(SMeanSdConsolidatePK id) {
		this.id = id;
	}
	
	public double getMeanLevelUpto() {
		return this.meanLevelUpto;
	}

	public void setMeanLevelUpto(double meanLevelUpto) {
		this.meanLevelUpto = meanLevelUpto;
	}

	public double getStandardDeviationLevelUpto() {
		return this.standardDeviationLevelUpto;
	}

	public void setStandardDeviationLevelUpto(double standardDeviationLevelUpto) {
		this.standardDeviationLevelUpto = standardDeviationLevelUpto;
	}

}