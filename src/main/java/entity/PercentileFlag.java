package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="s_percentile_flag")
@NamedQuery(name="PercentileFlag.findAll", query="SELECT s FROM PercentileFlag s")
public class PercentileFlag {


	@Id
	@Column(name="s_no")
	private int sNo;

	@Column(name="percentile_flag")
	private String percentileFlag;
	
	@Column(name="percentile_desc")
	private String percentileDesc;
	
	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public String getPercentileFlag() {
		return percentileFlag;
	}

	public void setPercentileFlag(String percentileFlag) {
		this.percentileFlag = percentileFlag;
	}

	public String getPercentileDesc() {
		return percentileDesc;
	}

	public void setPercentileDesc(String percentileDesc) {
		this.percentileDesc = percentileDesc;
	}

    		
}
