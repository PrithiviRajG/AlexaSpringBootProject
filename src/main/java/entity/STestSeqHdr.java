package entity;
import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the s_test_seq_hdr database table.
 * 
 */
@Entity
@Table(name="s_test_seq_hdr")
@NamedQuery(name="STestSeqHdr.findAll", query="SELECT s FROM STestSeqHdr s")
public class STestSeqHdr implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private STestSeqHdrPK id;

	@Column(name="added_date")
	private Timestamp addedDate;

	@Column(name="cur_seq_yn")
	private String curSeqYn;

	@Column(name="rotation_yn")
	private String rotationYn;

	@Column(name="seq_name")
	private String seqName;

	public STestSeqHdr() {
	}

	public STestSeqHdrPK getId() {
		return this.id;
	}

	public void setId(STestSeqHdrPK id) {
		this.id = id;
	}

	public Timestamp getAddedDate() {
		return this.addedDate;
	}

	public void setAddedDate(Timestamp addedDate) {
		this.addedDate = addedDate;
	}

	public String getCurSeqYn() {
		return this.curSeqYn;
	}

	public void setCurSeqYn(String curSeqYn) {
		this.curSeqYn = curSeqYn;
	}

	public String getRotationYn() {
		return this.rotationYn;
	}

	public void setRotationYn(String rotationYn) {
		this.rotationYn = rotationYn;
	}

	public String getSeqName() {
		return this.seqName;
	}

	public void setSeqName(String seqName) {
		this.seqName = seqName;
	}

}