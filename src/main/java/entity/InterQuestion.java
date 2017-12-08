package entity;
import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the inter_questions database table.
 * 
 */
@Entity
@Table(name="inter_questions")
@NamedQuery(name="InterQuestion.findAll", query="SELECT i FROM InterQuestion i")
public class InterQuestion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="q_id")
	private int qId;

	private String active_flag;

	@Column(name="added_date")
	private Timestamp addedDate;

	@Column(name="box_number")
	private int boxNumber;

	@Column(name="category_id")
	private int categoryId;

	@Column(name="data_inter_id")
	private int dataInterId;

	@Column(name="difficulty_level")
	private String difficultyLevel;

	@Column(name="exam_id")
	private int examId;

	@Column(name="group_id")
	private int groupId;

	@Lob
	@Column(name="key_points")
	private String keyPoints;

	@Column(name="modified_date")
	private Timestamp modifiedDate;

	@Column(name="passage_id")
	private int passageId;

	private int progression_status_id;

	@Column(name="q_image")
	private String qImage;

	@Lob
	@Column(name="q_image_file")
	private byte[] qImageFile;

	@Column(name="q_image_path")
	private String qImagePath;

	@Column(name="q_k_score")
	private float qKScore;

	@Column(name="q_no_blank")
	private int qNoBlank;

	@Column(name="q_only_img")
	private String qOnlyImg;

	@Lob
	@Column(name="q_question_text")
	private String qQuestionText;

	@Column(name="q_question_text_2")
	private String qQuestionText2;

	@Column(name="q_question_text_addl")
	private String qQuestionTextAddl;

	@Column(name="q_soln_image")
	private String qSolnImage;

	@Column(name="q_soln_image_path")
	private String qSolnImagePath;

	@Lob
	@Column(name="q_solution")
	private String qSolution;

	@Column(name="q_type_id")
	private int qTypeId;

	private String reviewer_Id;

	@Column(name="section_id")
	private int sectionId;

	private int status_id;

	@Lob
	@Column(name="step_zero")
	private String stepZero;

	private String uploader_Id;

	private int version;

	public InterQuestion() {
	}

	public int getQId() {
		return this.qId;
	}

	public void setQId(int qId) {
		this.qId = qId;
	}

	public String getActive_flag() {
		return this.active_flag;
	}

	public void setActive_flag(String active_flag) {
		this.active_flag = active_flag;
	}

	public Timestamp getAddedDate() {
		return this.addedDate;
	}

	public void setAddedDate(Timestamp addedDate) {
		this.addedDate = addedDate;
	}

	public int getBoxNumber() {
		return this.boxNumber;
	}

	public void setBoxNumber(int boxNumber) {
		this.boxNumber = boxNumber;
	}

	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getDataInterId() {
		return this.dataInterId;
	}

	public void setDataInterId(int dataInterId) {
		this.dataInterId = dataInterId;
	}

	public String getDifficultyLevel() {
		return this.difficultyLevel;
	}

	public void setDifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}

	public int getExamId() {
		return this.examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getKeyPoints() {
		return this.keyPoints;
	}

	public void setKeyPoints(String keyPoints) {
		this.keyPoints = keyPoints;
	}

	public Timestamp getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public int getPassageId() {
		return this.passageId;
	}

	public void setPassageId(int passageId) {
		this.passageId = passageId;
	}

	public int getProgression_status_id() {
		return this.progression_status_id;
	}

	public void setProgression_status_id(int progression_status_id) {
		this.progression_status_id = progression_status_id;
	}

	public String getQImage() {
		return this.qImage;
	}

	public void setQImage(String qImage) {
		this.qImage = qImage;
	}

	public byte[] getQImageFile() {
		return this.qImageFile;
	}

	public void setQImageFile(byte[] qImageFile) {
		this.qImageFile = qImageFile;
	}

	public String getQImagePath() {
		return this.qImagePath;
	}

	public void setQImagePath(String qImagePath) {
		this.qImagePath = qImagePath;
	}

	public float getQKScore() {
		return this.qKScore;
	}

	public void setQKScore(float qKScore) {
		this.qKScore = qKScore;
	}

	public int getQNoBlank() {
		return this.qNoBlank;
	}

	public void setQNoBlank(int qNoBlank) {
		this.qNoBlank = qNoBlank;
	}

	public String getQOnlyImg() {
		return this.qOnlyImg;
	}

	public void setQOnlyImg(String qOnlyImg) {
		this.qOnlyImg = qOnlyImg;
	}

	public String getQQuestionText() {
		return this.qQuestionText;
	}

	public void setQQuestionText(String qQuestionText) {
		this.qQuestionText = qQuestionText;
	}

	public String getQQuestionText2() {
		return this.qQuestionText2;
	}

	public void setQQuestionText2(String qQuestionText2) {
		this.qQuestionText2 = qQuestionText2;
	}

	public String getQQuestionTextAddl() {
		return this.qQuestionTextAddl;
	}

	public void setQQuestionTextAddl(String qQuestionTextAddl) {
		this.qQuestionTextAddl = qQuestionTextAddl;
	}

	public String getQSolnImage() {
		return this.qSolnImage;
	}

	public void setQSolnImage(String qSolnImage) {
		this.qSolnImage = qSolnImage;
	}

	public String getQSolnImagePath() {
		return this.qSolnImagePath;
	}

	public void setQSolnImagePath(String qSolnImagePath) {
		this.qSolnImagePath = qSolnImagePath;
	}

	public String getQSolution() {
		return this.qSolution;
	}

	public void setQSolution(String qSolution) {
		this.qSolution = qSolution;
	}

	public int getQTypeId() {
		return this.qTypeId;
	}

	public void setQTypeId(int qTypeId) {
		this.qTypeId = qTypeId;
	}

	public String getReviewer_Id() {
		return this.reviewer_Id;
	}

	public void setReviewer_Id(String reviewer_Id) {
		this.reviewer_Id = reviewer_Id;
	}

	public int getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}

	public int getStatus_id() {
		return this.status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

	public String getStepZero() {
		return this.stepZero;
	}

	public void setStepZero(String stepZero) {
		this.stepZero = stepZero;
	}

	public String getUploader_Id() {
		return this.uploader_Id;
	}

	public void setUploader_Id(String uploader_Id) {
		this.uploader_Id = uploader_Id;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}