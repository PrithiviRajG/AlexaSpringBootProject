package entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the s_mean_sd_distinct_test database table.
 * 
 */
@Embeddable
public class SMeanSdDistinctTestPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="test_id")
	private int testId;

	@Column(name="section_id")
	private int sectionId;

	public SMeanSdDistinctTestPK() {
	}
	public int getTestId() {
		return this.testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public int getSectionId() {
		return this.sectionId;
	}
	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SMeanSdDistinctTestPK)) {
			return false;
		}
		SMeanSdDistinctTestPK castOther = (SMeanSdDistinctTestPK)other;
		return 
			(this.testId == castOther.testId)
			&& (this.sectionId == castOther.sectionId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.testId;
		hash = hash * prime + this.sectionId;
		
		return hash;
	}
}