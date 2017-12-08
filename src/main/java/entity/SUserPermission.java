package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_user_permission database table.
 * 
 */
@Entity
@Table(name="s_user_permission")
@NamedQuery(name="SUserPermission.findAll", query="SELECT s FROM SUserPermission s")
public class SUserPermission implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_permission_id")
	private int userPermissionId;

	@Column(name="user_permission_desc")
	private String userPermissionDesc;

	public SUserPermission() {
	}

	public int getUserPermissionId() {
		return this.userPermissionId;
	}

	public void setUserPermissionId(int userPermissionId) {
		this.userPermissionId = userPermissionId;
	}

	public String getUserPermissionDesc() {
		return this.userPermissionDesc;
	}

	public void setUserPermissionDesc(String userPermissionDesc) {
		this.userPermissionDesc = userPermissionDesc;
	}

}