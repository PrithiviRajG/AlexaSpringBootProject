package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_passage database table.
 * 
 */
@Entity
@Table(name="s_passage")
@NamedQuery(name="SPassage.findAll", query="SELECT s FROM SPassage s")
public class SPassage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="passage_id")
	private int passageId;

	@Lob
	@Column(name="passage_desc")
	private String passageDesc;

	@Column(name="passage_image")
	private String passageImage;

	@Column(name="passage_image_path")
	private String passageImagePath;

	@Column(name="passage_length")
	private String passageLength;

	public SPassage() {
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

	public String getPassageLength() {
		return this.passageLength;
	}

	public void setPassageLength(String passageLength) {
		this.passageLength = passageLength;
	}

}