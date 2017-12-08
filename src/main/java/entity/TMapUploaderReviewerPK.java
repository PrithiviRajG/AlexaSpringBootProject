package entity;
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_map_uploader_reviewer database table.
 * 
 */
@Embeddable
public class TMapUploaderReviewerPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="uploader_id")
	private String uploaderId;

	@Column(name="reviewer_id")
	private String reviewerId;

	public TMapUploaderReviewerPK() {
	}
	public String getUploaderId() {
		return this.uploaderId;
	}
	public void setUploaderId(String uploaderId) {
		this.uploaderId = uploaderId;
	}
	public String getReviewerId() {
		return this.reviewerId;
	}
	public void setReviewerId(String reviewerId) {
		this.reviewerId = reviewerId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TMapUploaderReviewerPK)) {
			return false;
		}
		TMapUploaderReviewerPK castOther = (TMapUploaderReviewerPK)other;
		return 
			this.uploaderId.equals(castOther.uploaderId)
			&& this.reviewerId.equals(castOther.reviewerId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.uploaderId.hashCode();
		hash = hash * prime + this.reviewerId.hashCode();
		
		return hash;
	}
}