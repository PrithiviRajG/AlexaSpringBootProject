package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="s_procedure_combine")
@NamedQuery(name="ProcedureCombine.findAll", query="SELECT s FROM ProcedureCombine s")
public class ProcedureCombine {


	@Id
	@Column(name="s_no")
	private int sNo;

	@Column(name="combine_value")
	private int combineValue;

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public int getCombineValue() {
		return combineValue;
	}

	public void setCombineValue(int combineValue) {
		this.combineValue = combineValue;
	}
		
}
