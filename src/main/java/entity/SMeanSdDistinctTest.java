package entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_mean_sd_distinct_test database table.
 * 
 */
@Entity
@Table(name="s_mean_sd_distinct_test")
@NamedQuery(name="SMeanSdDistinctTest.findAll", query="SELECT s FROM SMeanSdDistinctTest s")
public class SMeanSdDistinctTest implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SMeanSdDistinctTestPK id;

	private double mean;

	@Column(name="standard_deviation")
	private double standardDeviation;

    public SMeanSdDistinctTest() {
    }

	public SMeanSdDistinctTestPK getId() {
		return this.id;
	}

	public void setId(SMeanSdDistinctTestPK id) {
		this.id = id;
	}
	
	public double getMean() {
		return this.mean;
	}

	public void setMean(double mean) {
		this.mean = mean;
	}

	public double getStandardDeviation() {
		return this.standardDeviation;
	}

	public void setStandardDeviation(double standardDeviation) {
		this.standardDeviation = standardDeviation;
	}

}