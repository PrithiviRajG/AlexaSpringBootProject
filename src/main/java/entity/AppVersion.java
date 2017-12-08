package entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the s_user_exam_level database table.
 * 
 */
@Entity
@Table(name="app_support_version")
@NamedQuery(name="AppVersion.findAll", query="SELECT s FROM AppVersion s")
public class AppVersion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="app_version_id")
	private String appId;

	@Id
	@Column(name="app_version_name")
	private String appName;

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}


	
}