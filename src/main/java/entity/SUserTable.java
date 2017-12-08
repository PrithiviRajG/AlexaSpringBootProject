package entity;
import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


/**
 * The persistent class for the s_user_table database table.
 * 
 */
@Entity
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name="s_user_table")
@DynamicUpdate //Default is true - it's used to update only the given column
@DynamicInsert //Default is true - it's used to insert only the given column
@NamedQuery(name="SUserTable.findAll", query="SELECT s FROM SUserTable s")
public class SUserTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_id")
	private String userId;

	@Column(name="active_flag", nullable=false, columnDefinition="varchar(1) default 'Y'")
	private String activeFlag="Y";

	@Column(name="exam_prefer", nullable=false, columnDefinition="int(1) default 0")
	private int examPrefer=0;

	@Column(name="lock_yn", nullable=false, columnDefinition="varchar(1) default 'N'")
	private String lockYn="N";

	@Column(name="seq_no", nullable=false, columnDefinition="int(3) default 1")
	private int seqNo=1;

	@Column(name="sign_up_date")
	private String signUpDate;

	@Column(name="test_user", nullable=false, columnDefinition="varchar(1) default 'N'")
	private String testUser="N";

	@Column(name="user_email")
	private String userEmail;

	@Column(name="user_fbid")
	private String userFbid;

	@Column(name="user_gender")
	private String userGender;

	@Column(name="user_group_id", nullable=false, columnDefinition="int(11) default 1")
	private int userGroupId=1;

	@Column(name="user_name")
	private String userName;

	@Column(name="user_pwd")
	private String userPwd;
	
	@Column(name="login_mode")
	private String loginMode;

	@Column(name="user_role_id", nullable=false, columnDefinition="int(11) default 4")
	private int userRoleId=4;
	
	@Column(name="account_id")
	private String accountId;
	
	/*@JsonIgnore
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "t_user_role", joinColumns = { @JoinColumn(name = "user_role_id") })
	private Set<TUserRole> roles;*/

	public SUserTable(SUserTable sUserTable) {
		super();
		this.userId = sUserTable.getUserId();
		this.activeFlag = sUserTable.getActiveFlag();
		this.examPrefer = sUserTable.getExamPrefer();
		this.lockYn = sUserTable.getLockYn();
		this.seqNo = sUserTable.getSeqNo();
		this.signUpDate = sUserTable.getSignUpDate();
		this.testUser = sUserTable.getTestUser();
		this.userEmail = sUserTable.getUserEmail();
		this.userFbid = sUserTable.getUserFbid();
		this.userGender = sUserTable.getUserGender();
		this.userGroupId = sUserTable.getUserGroupId();
		this.userName = sUserTable.getUserName();
		this.userPwd = sUserTable.getUserPwd();
		this.userRoleId = sUserTable.getUserRoleId();
		this.loginMode = sUserTable.getLoginMode();
	}

	/**
	 * 
	 */
	public SUserTable() {
		super();
	}
	
	

	public String getLoginMode() {
		return loginMode;
	}

	public void setLoginMode(String loginMode) {
		this.loginMode = loginMode;
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

	public int getExamPrefer() {
		return this.examPrefer;
	}

	public void setExamPrefer(int examPrefer) {
		this.examPrefer = examPrefer;
	}

	public String getLockYn() {
		return this.lockYn;
	}

	public void setLockYn(String lockYn) {
		this.lockYn = lockYn;
	}

	public int getSeqNo() {
		return this.seqNo;
	}

	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}

	public String getSignUpDate() {
		return signUpDate;
	}

	public void setSignUpDate(String signUpDate) {
		this.signUpDate = signUpDate;
	}

	public String getTestUser() {
		return this.testUser;
	}

	public void setTestUser(String testUser) {
		this.testUser = testUser;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserFbid() {
		return this.userFbid;
	}

	public void setUserFbid(String userFbid) {
		this.userFbid = userFbid;
	}

	public String getUserGender() {
		return this.userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public int getUserGroupId() {
		return this.userGroupId;
	}

	public void setUserGroupId(int userGroupId) {
		this.userGroupId = userGroupId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return this.userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public int getUserRoleId() {
		return this.userRoleId;
	}

	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}
	
	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

}