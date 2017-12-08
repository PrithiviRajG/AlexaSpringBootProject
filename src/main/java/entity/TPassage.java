package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_passage database table.
 * 
 */
@Entity
@Table(name="t_passage")
@NamedQuery(name="TPassage.findAll", query="SELECT t FROM TPassage t")
public class TPassage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="passage_id")
	private int passageId;

	@Column(name="passage_desc")
	private String passageDesc;

	@Column(name="passage_image")
	private String passageImage;

	@Column(name="passage_image_path")
	private String passageImagePath;

	public TPassage() {
	}

	public int getPassageId() {
		return this.passageId;
	}

	public void setPassageId(int passageId) {
		this.passageId = passageId;
	}

	public String getPassageDesc() {
		return this.passageDesc;
	}

	public void setPassageDesc(String passageDesc) {
		this.passageDesc = passageDesc;
	}

	public String getPassageImage() {
		return this.passageImage;
	}

	public void setPassageImage(String passageImage) {
		this.passageImage = passageImage;
	}

	public String getPassageImagePath() {
		return this.passageImagePath;
	}

	public void setPassageImagePath(String passageImagePath) {
		this.passageImagePath = passageImagePath;
	}

}