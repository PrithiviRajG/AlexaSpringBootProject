package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_upload_status database table.
 * 
 */
@Entity
@Table(name="t_upload_status")
@NamedQuery(name="TUploadStatus.findAll", query="SELECT t FROM TUploadStatus t")
public class TUploadStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="status_id")
	private int statusId;

	@Column(name="status_desc")
	private String statusDesc;

	public TUploadStatus() {
	}

	public int getStatusId() {
		return this.statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getStatusDesc() {
		return this.statusDesc;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

}