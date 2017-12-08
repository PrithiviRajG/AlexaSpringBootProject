package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_map_uploader_reviewer database table.
 * 
 */
@Entity
@Table(name="t_map_uploader_reviewer")
@NamedQuery(name="TMapUploaderReviewer.findAll", query="SELECT t FROM TMapUploaderReviewer t")
public class TMapUploaderReviewer implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TMapUploaderReviewerPK id;

	public TMapUploaderReviewer() {
	}

	public TMapUploaderReviewerPK getId() {
		return this.id;
	}

	public void setId(TMapUploaderReviewerPK id) {
		this.id = id;
	}

}