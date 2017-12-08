package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_role_config database table.
 * 
 */
@Entity
@Table(name="t_role_config")
@NamedQuery(name="TRoleConfig.findAll", query="SELECT t FROM TRoleConfig t")
public class TRoleConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="role_id")
	private int roleId;

	@Column(name="role_desc")
	private String roleDesc;

	@Column(name="role_name")
	private String roleName;

	@Column(name="role_value")
	private String roleValue;

	public TRoleConfig() {
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleDesc() {
		return this.roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleValue() {
		return this.roleValue;
	}

	public void setRoleValue(String roleValue) {
		this.roleValue = roleValue;
	}

}