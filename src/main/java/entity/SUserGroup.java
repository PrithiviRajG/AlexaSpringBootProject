package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_user_group database table.
 * 
 */
@Entity
@Table(name="s_user_group")
@NamedQuery(name="SUserGroup.findAll", query="SELECT s FROM SUserGroup s")
public class SUserGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_group_id")
	private int userGroupId;

	@Column(name="permission_level_1")
	private String permissionLevel1;

	@Column(name="permission_level_2")
	private String permissionLevel2;

	@Column(name="permission_level_3")
	private String permissionLevel3;

	@Column(name="permission_level_4")
	private String permissionLevel4;

	@Column(name="permission_level_5")
	private String permissionLevel5;

	@Column(name="user_group_desc")
	private String userGroupDesc;

	public SUserGroup() {
	}

	public int getUserGroupId() {
		return this.userGroupId;
	}

	public void setUserGroupId(int userGroupId) {
		this.userGroupId = userGroupId;
	}

	public String getPermissionLevel1() {
		return this.permissionLevel1;
	}

	public void setPermissionLevel1(String permissionLevel1) {
		this.permissionLevel1 = permissionLevel1;
	}

	public String getPermissionLevel2() {
		return this.permissionLevel2;
	}

	public void setPermissionLevel2(String permissionLevel2) {
		this.permissionLevel2 = permissionLevel2;
	}

	public String getPermissionLevel3() {
		return this.permissionLevel3;
	}

	public void setPermissionLevel3(String permissionLevel3) {
		this.permissionLevel3 = permissionLevel3;
	}

	public String getPermissionLevel4() {
		return this.permissionLevel4;
	}

	public void setPermissionLevel4(String permissionLevel4) {
		this.permissionLevel4 = permissionLevel4;
	}

	public String getPermissionLevel5() {
		return this.permissionLevel5;
	}

	public void setPermissionLevel5(String permissionLevel5) {
		this.permissionLevel5 = permissionLevel5;
	}

	public String getUserGroupDesc() {
		return this.userGroupDesc;
	}

	public void setUserGroupDesc(String userGroupDesc) {
		this.userGroupDesc = userGroupDesc;
	}

}