package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_user_table database table.
 * 
 */
@Entity
@Table(name="t_user_table")
@NamedQuery(name="TUserTable.findAll", query="SELECT t FROM TUserTable t")
public class TUserTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_id")
	private String userId;

	@Column(name="active_flag")
	private String activeFlag;

	@Column(name="bulk_upload_yn")
	private String bulkUploadYn;

	@Column(name="master_reviewer_yn")
	private String masterReviewerYn;

	@Column(name="role_id")
	private int roleId;

	@Column(name="user_email")
	private String userEmail;

	@Column(name="user_name")
	private String userName;

	@Column(name="user_org")
	private String userOrg;

	@Column(name="user_pwd")
	private String userPwd;
	
	@Column(name="user_role_code")
	private String userRoleCode;

	public String getUserRoleCode() {
		return userRoleCode;
	}

	public void setUserRoleCode(String userRoleCode) {
		this.userRoleCode = userRoleCode;
	}

	public TUserTable() {
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getBulkUploadYn() {
		return this.bulkUploadYn;
	}

	public void setBulkUploadYn(String bulkUploadYn) {
		this.bulkUploadYn = bulkUploadYn;
	}

	public String getMasterReviewerYn() {
		return this.masterReviewerYn;
	}

	public void setMasterReviewerYn(String masterReviewerYn) {
		this.masterReviewerYn = masterReviewerYn;
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserOrg() {
		return this.userOrg;
	}

	public void setUserOrg(String userOrg) {
		this.userOrg = userOrg;
	}

	public String getUserPwd() {
		return this.userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

}