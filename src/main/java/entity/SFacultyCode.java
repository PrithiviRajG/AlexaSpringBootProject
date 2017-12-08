package entity;
import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the s_faculty_codes database table.
 * 
 */
@Entity
@Table(name="s_faculty_codes")
@NamedQuery(name="SFacultyCode.findAll", query="SELECT s FROM SFacultyCode s")
public class SFacultyCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="faculty_code")
	private String facultyCode;

	@Column(name="active_flag")
	private String activeFlag;

	@Column(name="batch_id")
	private String batchId;

	@Column(name="code_type")
	private String codeType;

	@Column(name="faculty_id")
	private String facultyId;

	@Column(name="student_id")
	private String studentId;

	@Column(name="time_added")
	private Timestamp timeAdded;

	@Column(name="time_taken")
	private Timestamp timeTaken;
	
	@Column(name="promo_codes")
	private String promoCodes;

	/**
	 * @return the promoCodes
	 */
	public String getPromoCodes() {
		return promoCodes;
	}

	/**
	 * @param promoCodes the promoCodes to set
	 */
	public void setPromoCodes(String promoCodes) {
		this.promoCodes = promoCodes;
	}

	public SFacultyCode() {
	}

	public String getFacultyCode() {
		return this.facultyCode;
	}

	public void setFacultyCode(String facultyCode) {
		this.facultyCode = facultyCode;
	}

	public String getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getBatchId() {
		return this.batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getCodeType() {
		return this.codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getFacultyId() {
		return this.facultyId;
	}

	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}

	public String getStudentId() {
		return this.studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the timeAdded
	 */
	public Timestamp getTimeAdded() {
		return timeAdded;
	}

	/**
	 * @param timeAdded the timeAdded to set
	 */
	public void setTimeAdded(Timestamp timeAdded) {
		this.timeAdded = timeAdded;
	}

	/**
	 * @return the timeTaken
	 */
	public Timestamp getTimeTaken() {
		return timeTaken;
	}

	/**
	 * @param timeTaken the timeTaken to set
	 */
	public void setTimeTaken(Timestamp timeTaken) {
		this.timeTaken = timeTaken;
	}


}