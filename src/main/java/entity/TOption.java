package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_options database table.
 * 
 */
@Entity
@Table(name="t_options")
@NamedQuery(name="TOption.findAll", query="SELECT t FROM TOption t")
public class TOption implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="opt_id")
	private int optId;

	@Column(name="opt_blank")
	private String optBlank;

	@Column(name="opt_correct")
	private String optCorrect;

	@Column(name="opt_correct_img_flag")
	private String optCorrectImgFlag;

	@Column(name="opt_image_path")
	private String optImagePath;

	@Column(name="opt_img_flag")
	private String optImgFlag;

	@Column(name="opt_soln_group_id")
	private int optSolnGroupId;

	@Column(name="opt_solution")
	private String optSolution;

	@Column(name="opt_text")
	private String optText;

	@Column(name="q_id")
	private int qId;

	private int version;

	public TOption() {
	}

	public int getOptId() {
		return this.optId;
	}

	public void setOptId(int optId) {
		this.optId = optId;
	}

	public String getOptBlank() {
		return this.optBlank;
	}

	public void setOptBlank(String optBlank) {
		this.optBlank = optBlank;
	}

	public String getOptCorrect() {
		return this.optCorrect;
	}

	public void setOptCorrect(String optCorrect) {
		this.optCorrect = optCorrect;
	}

	public String getOptCorrectImgFlag() {
		return this.optCorrectImgFlag;
	}

	public void setOptCorrectImgFlag(String optCorrectImgFlag) {
		this.optCorrectImgFlag = optCorrectImgFlag;
	}

	public String getOptImagePath() {
		return this.optImagePath;
	}

	public void setOptImagePath(String optImagePath) {
		this.optImagePath = optImagePath;
	}

	public String getOptImgFlag() {
		return this.optImgFlag;
	}

	public void setOptImgFlag(String optImgFlag) {
		this.optImgFlag = optImgFlag;
	}

	public int getOptSolnGroupId() {
		return this.optSolnGroupId;
	}

	public void setOptSolnGroupId(int optSolnGroupId) {
		this.optSolnGroupId = optSolnGroupId;
	}

	public String getOptSolution() {
		return this.optSolution;
	}

	public void setOptSolution(String optSolution) {
		this.optSolution = optSolution;
	}

	public String getOptText() {
		return this.optText;
	}

	public void setOptText(String optText) {
		this.optText = optText;
	}

	public int getQId() {
		return this.qId;
	}

	public void setQId(int qId) {
		this.qId = qId;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}