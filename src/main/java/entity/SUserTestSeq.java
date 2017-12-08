package entity;
import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;


/**
 * The persistent class for the s_user_test_seq database table.
 * 
 */
@Entity
@Table(name="s_user_test_seq")
@NamedQuery(name="SUserTestSeq.findAll", query="SELECT s FROM SUserTestSeq s")
public class SUserTestSeq implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SUserTestSeqPK id;

	@Column(name="added_date")
	private Timestamp addedDate;

	@Column(name="seq_no")
	private int seqNo;

	public SUserTestSeq() {
	}

	public SUserTestSeqPK getId() {
		return this.id;
	}

	public void setId(SUserTestSeqPK id) {
		this.id = id;
	}

	public Timestamp getAddedDate() {
		return this.addedDate;
	}

	public void setAddedDate(Timestamp timestamp) {
		this.addedDate = timestamp;
	}

	public int getSeqNo() {
		return this.seqNo;
	}

	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}

}