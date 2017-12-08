package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_user_role database table.
 * 
 */
@Entity
@Table(name="t_user_role")
@NamedQuery(name="TUserRole.findAll", query="SELECT t FROM TUserRole t")
public class TUserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_role_id")
	private int userRoleId;

	@Column(name="user_role_code")
	private String userRoleCode;

	@Column(name="user_role_desc")
	private String userRoleDesc;

	public TUserRole() {
	}

	public int getUserRoleId() {
		return this.userRoleId;
	}

	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}

	public String getUserRoleCode() {
		return this.userRoleCode;
	}

	public void setUserRoleCode(String userRoleCode) {
		this.userRoleCode = userRoleCode;
	}

	public String getUserRoleDesc() {
		return this.userRoleDesc;
	}

	public void setUserRoleDesc(String userRoleDesc) {
		this.userRoleDesc = userRoleDesc;
	}

}